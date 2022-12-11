
package infra.daogeneric;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;
import jnbc.sys.etl.os.ETLEntradaDados;
import infra.ti.LerMapPersistenceXml;


 /**
* @author NILDO BUENO CORREIA FILHO 
 * CPF: 10333054725
 * EMAIL: nil_bueno@hotmail.com    
 * JAVA VERSION - 8;14;17
 * NETBEANS     - 8;12;16  >> ...Muitos anos fazendo isso
 * 
 * não tenho celular, 
 * por gentileza entrem 
 * em contato pelo email acima. 
 * ;)
 * Created on 30/12/2021, 17:09:27
 * @param <N>
 */

public class GenericsDAO<N extends EntitySerializable> {
  
    
    public  int     quantRegDAO     =   0;
    public  int     quantRegPesDAO  =   0;
    private String  idSemEspacos;
    private String  idNull;
    private Boolean idBooleanNull;
    private String   nomeSemEspacos;
    private Boolean  nomeEmpty;
    private String   nomeNull;
    private Boolean  retornoMaior;
    private Boolean  retornoMenor;
            
    ETLEntradaDados etl = new ETLEntradaDados();
    LerMapPersistenceXml mapXml = new LerMapPersistenceXml();
    public boolean finalPagina = true;

       
        public EntityManager getEM() {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("vendasPU");
            return factory.createEntityManager();
        }

         public EntityManager getEM2() {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("vendas2PU");
            return factory.createEntityManager();
        }
         public EntityManager getEM3() {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("vendas3PU");
            return factory.createEntityManager();
        } 
         
           public EntityManager getEM4() {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("vendas4PU");
            return factory.createEntityManager();
        }
         
        
    public N salvar(N n) throws Exception {
        
        EntityManager em = getEM();
        EntityManager em2 = getEM2();
        EntityManager em3 = getEM3();
        EntityManager em4 = getEM4();
       
        
        String str = etl.RemoverEspacosEmBrancoStringSubistituirVazio(n.getNome());
        try {
            em.getTransaction().begin();
              int conta = n.getNome().length();

          if (n.getId() == null ){
                    if(n.getNome().isEmpty()  ||   str.equals("") )
                    {
                   JOptionPane.showMessageDialog(null, "Nao é permitida inserções vázias nos banco de dados", "Aviso do Sistema", JOptionPane.PLAIN_MESSAGE);
                   }
                    else
                    {       
                   if(conta <= 3)
                   {
                   JOptionPane.showMessageDialog(null, "O registro precisa ter no mínimo 3 caracteres", "Aviso do Sistema", JOptionPane.PLAIN_MESSAGE);
                   } 
                   else if(conta >= 3){
                        em.persist(n);
                        System.out.println("Salvou");
                   }
              }
            }else{
                    
                if (!em.contains(n)) {
                    if (em.find(n.getClass(), n.getId()) == null){
                        throw new Exception("Erro ao atualizar o registro");
                    }
                }
                n = em.merge(n);
                System.out.println("Atualizou");
            }
            em.getTransaction().commit();
            System.out.println("Comitou");
        } finally {
            em.close();
            System.out.println("Fechou");
        }
        return n;
    }
  
        
        public N Atualizar(N n)  throws Exception {         
                EntityManager em = getEM();
                EntityManager em2 = getEM2();
                EntityManager em3 = getEM3();
                EntityManager em4 = getEM4();
           try {
                   em.merge(n);
                   System.out.println("Atualizou");
                   em.getTransaction().commit();
                   System.out.println("Comitou");
                    } finally {
                    em.close();
                    System.out.println("Fechou");
                }
                return n;
            }
        
        
        
              
      public N salvarVerificado(N n, 
              String namedQuery,
              String parametroNome,
              String nomePesquisado) throws Exception {
              EntityManager em = getEM();
                      EntityManager em2 = getEM2();
        EntityManager em3 = getEM3();
        EntityManager em4 = getEM4();
              
              String str = etl.RemoverEspacosEmBrancoStringSubistituirVazio(n.getNome());
        try {
            em.getTransaction().begin();
            Query query = em.createNamedQuery(namedQuery);
            query.setParameter(parametroNome, nomePesquisado);
            List<N> data = query.getResultList();

               if(data.isEmpty()){
                   int conta = n.getNome().length();
             if (n.getId() == null) {
                    if(n.getNome() == null || str.equals("") )
                    {
                   JOptionPane.showMessageDialog(null, "Nao é permitida inserções vázias nos banco de dados", "Aviso do Sistema", JOptionPane.PLAIN_MESSAGE);
                   }
                    else
                    {       
                   if(conta <= 3){
                   JOptionPane.showMessageDialog(null, "O nome de Cadastro deve conter mais de 3 Caracteres", "Aviso do Sistema", JOptionPane.PLAIN_MESSAGE);
                   } else if(conta >= 3){
                        em.persist(n);
                        System.out.println("Salvou");
                   }
              }
            }else{
                if (!em.contains(n)) 
                {
                    
                    if (em.find(n.getClass(), n.getId()) == null)
                    {
                        throw new Exception("Erro ao atualizar o evento!");
                    }
                }
                n = em.merge(n);
                System.out.println("Atualizou");
            }
            em.getTransaction().commit();
            System.out.println("Comitou");
        } else if(!data.isEmpty()){
        
        int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(
        null, 
       "O Registro: "+n.getNome()+"\n Já existe no Banco de Dados!    \n Deseja prosseguir com o cadastro mesmo assim?   ","    PERGUNTA DO SISTEMA     ", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,null,botoes,botoes[0]);
        if (opcao ==  JOptionPane.YES_OPTION) {
            if (n.getId() == null) {
                em.persist(n);
                System.out.println("Salvou");
            }
                 em.getTransaction().commit();
            }
        }
        } finally {
            em.close();
            System.out.println("Fechou");
        }
        return n;
    }


             public N SalvarLoteVerificado(N n,String namedQuery,String parametroNome,String nomePesquisado)throws Exception{
  
                      idSemEspacos    = etl.RemoverEspacosEmBrancoStringSubistituirVazio(n.getId().toString());
                   EntityManager em = getEM();
                           EntityManager em2 = getEM2();
        EntityManager em3 = getEM3();
        EntityManager em4 = getEM4();
                   List<N> modelo;
                   try {
                   em.getTransaction().begin();

                   Query query = em.createNamedQuery(namedQuery);
                   query.setParameter(parametroNome, nomePesquisado);

                   modelo = query.getResultList();
                   List<N> data = query.getResultList();
                    if(data.size() > 0)
                    {

                    }else if(data.isEmpty()){
                         int conta = n.getNome().length();
                         if (  n.getId() == null ||Objects.equals(n.getId(), idSemEspacos )) {
                            if(n.getNome().isEmpty() ||  Objects.equals(n.getNome(),nomeSemEspacos) || Objects.equals(n.getNome(), nomeNull)){
                                    }else{ 
                                        if(retornoMenor){
                                        }else if(retornoMenor){   
                                        em.persist(n);
                                    }			   
                                }
                            }else{
                                if(!em.contains(n)){
                                    if (em.find(n.getClass(), n.getId()) == null){
                                    throw new Exception("Erro ao atualizar o evento!");
                                    }
                                }
                                n = em.merge(n);
                            }   
                    }
                    em.getTransaction().commit();
                } finally {
                    em.close();
                }
                return n;
            }


public N atualizarVerificado(N n, 
              String namedQuery,
              String parametroNome,
              String nomePesquisado) throws Exception {
              EntityManager em = getEM();
              EntityManager em2 = getEM2();
              EntityManager em3 = getEM3();
              EntityManager em4 = getEM4();
              
              String str = etl.RemoverEspacosEmBrancoStringSubistituirVazio(n.getNome());
        try {
            em.getTransaction().begin();
            Query query = em.createNamedQuery(namedQuery);
            query.setParameter(parametroNome, nomePesquisado);
            List<N> data = query.getResultList();

               if(data.isEmpty()){
                   int conta = n.getNome().length();
             if (n.getId() != null) 
             {
                    if(n.getNome() == null || str.equals("") )
                    {
                        JOptionPane.showMessageDialog(null, "Nao é permitida atualizar este registro sem informações", "Aviso do Sistema", JOptionPane.PLAIN_MESSAGE);
                   }
                    else
                        {       
                        if(conta <= 3)
                        {
                        JOptionPane.showMessageDialog(null, "Deve haver mais de 3 Caracteres para definir um registro", "Aviso do Sistema", JOptionPane.PLAIN_MESSAGE);
                   } else if(conta >= 3){
                        em.merge(n);
                        System.out.println("Salvou");
                   }
              }
            }else{
                if (!em.contains(n)) 
                {
                    
                    if (em.find(n.getClass(), n.getId()) != null)
                    {
                        throw new Exception("Erro ao atualizar o evento!");
                    }
                }
                n = em.merge(n);
                System.out.println("Atualizou");
            }
            em.getTransaction().commit();
            System.out.println("Comitou");
        } 
               else if(!data.isEmpty()){
        
                   
                JOptionPane.showMessageDialog(null, "O Registro: "+n.getNome()+"\n O Nome do Novo Registro já existe no banco de dados, revise sua edição", "Aviso do Sistema", JOptionPane.PLAIN_MESSAGE);
        }
        } finally {
            em.close();
            System.out.println("Fechou");
        }
        return n;
    }
         


    public void remover(Class<N> clazz, Integer id) {
        EntityManager em = getEM();
        EntityManager em2 = getEM2();
        EntityManager em3 = getEM3();
        EntityManager em4 = getEM4();
        N n = em.find(clazz, id);
        int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(null,"Confirma a Exclusão do Registro: "+n.getNome()+" ",
       "    PERGUNTA DO SISTEMA     ",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE,null,botoes,botoes[0]);
        if (opcao ==  JOptionPane.YES_OPTION) {

        try {
            em.getTransaction().begin();
            
            em.remove(n);
            em.getTransaction().commit();
           
        } 
        finally {
            em.close();
        }
    }
        
    }


             public void ExcluirLote(Class<N> clazz, Integer id) {
                EntityManager em = getEM();
                EntityManager em2 = getEM2();
                EntityManager em3 = getEM3();
                EntityManager em4 = getEM4();
                N n = em.find(clazz, id);
                try {
                    em.getTransaction().begin();
                    em.remove(n);
                    em.getTransaction().commit();
                } 

                finally {
                    em.close();
                }
            }


            public N consultarPorId(Class<N> clazz, Integer id) {
                EntityManager em = getEM();
                EntityManager em2 = getEM2();
                EntityManager em3 = getEM3();
                EntityManager em4 = getEM4();                
                N n = null;
                try {
                    n = em.find(clazz, id);
                } finally {
                    em.close();
                }
                return n;
            }

               public List<N> consultarPorIdPorIdEmpresa(String nomeNamedQuery,Integer idModel, Integer idModelParametro, String idEmpresa,String paramentroIdEmpresa) {
                 EntityManager em = getEM();
                 List<N> idIdEmpresa;
                 try{

                 Query query = em.createNamedQuery(nomeNamedQuery);
                 query.setParameter(idModel, idModelParametro);
                 query.setParameter(idEmpresa, paramentroIdEmpresa);
                 idIdEmpresa = query.getResultList();
                 }catch(Exception e){
                 idIdEmpresa = new ArrayList();
                 } finally{
                   em.close();
                 }
                        return idIdEmpresa;
                }  


                 public List<N> consultarComencaComIdEmpresa( String nomePesquisado, String namedQuery,  String parametroNome,String idContaEmpresa,String parametroIdEmpresa)   {
                 EntityManager em = getEM();
                 List<N> modelo;
                 try{
                 Query query = em.createNamedQuery(namedQuery);
                 query.setParameter(idContaEmpresa, parametroIdEmpresa);
                 query.setParameter("$"+parametroNome+"$", "%"+nomePesquisado+"%");

                 modelo = query.getResultList();
                 }catch(Exception e){
                 modelo = new ArrayList();
                 } finally{
                   em.close();
                 }
                        return modelo;
                }

                 public List<N> contarTodos(String namedQuery){
                     EntityManager em = getEM();
                     Query query = em.createNamedQuery(namedQuery);
                    quantRegDAO = query.getResultList().size();
                     return query.getResultList();
                }


                 public List<N> contarTodosPesquisa(String namedQuery) {
                     EntityManager em = getEM();
                     Query query = em.createNamedQuery(namedQuery);
                     quantRegPesDAO = query.getResultList().size();  
                     return query.getResultList();
                }


              public List<N> PesquisarComeca(int qtde, int deslocamento, String namedQuery,String parametroNome,String nomePesquisado) {
              EntityManager em = getEM();
                List<N> modelo;
                try {
                   em.getTransaction().begin();
                   Query query = em.createNamedQuery(namedQuery);
                   query.setParameter(parametroNome+"$", nomePesquisado+"%");
                    quantRegPesDAO = query.getResultList().size();
                   query.setMaxResults(qtde);
                   query.setFirstResult(deslocamento);

                   modelo = query.getResultList();
                 }catch(Exception e){
                 modelo = new ArrayList();
                 } finally{
                   em.close();
                 }
                        return modelo;
                }

              public List<N> PesquisarContem(int qtde, int deslocamento, String namedQuery,String parametroNome,String nomePesquisado)  {
              EntityManager em = getEM();
                List<N> modelo;
                try {
                   em.getTransaction().begin();
                   Query query = em.createNamedQuery(namedQuery);
                   query.setParameter("$"+parametroNome+"$", "%"+nomePesquisado+"%");
                    quantRegPesDAO = query.getResultList().size();
                   query.setMaxResults(qtde);
                   query.setFirstResult(deslocamento);

                  modelo = query.getResultList();
                 }catch(Exception e){
                 modelo = new ArrayList();
                 } finally{
                   em.close();
                 }
                        return modelo;
                }

              public List<N> PesquisarTermina(int qtde, int deslocamento, String namedQuery,String parametroNome,String nomePesquisado) {
              EntityManager em = getEM();
                List<N> modelo;
                try {
                   em.getTransaction().begin();
                   Query query = em.createNamedQuery(namedQuery);
                   query.setParameter("$"+parametroNome, "%"+nomePesquisado);
                    quantRegPesDAO = query.getResultList().size();
                   query.setMaxResults(qtde);
                   query.setFirstResult(deslocamento);

                  modelo = query.getResultList();
                 }catch(Exception e){
                 modelo = new ArrayList();
                 } finally{
                   em.close();
                 }
                        return modelo;
                }

          public List<N> consultarPorNamedQuery(String jpql) {
                 EntityManager em = getEM();
                 List<N> modelo;
                 try{

                 TypedQuery query = (TypedQuery) em.createNamedQuery(jpql);
                 modelo = query.getResultList();
                 }catch(Exception e){
                 modelo = new ArrayList();
                 } finally{
                   em.close();
                 }
                        return modelo;
                }

                public List<N> PesquisaPaginada(int qtde, int deslocamento, String namedQuery) {
                 EntityManager em = getEM();
                List<N> modeloPesquisaPaginada;
                    try{
                        em.getTransaction().begin();
                        Query query = em.createNamedQuery(namedQuery);
                        query.setMaxResults(qtde);
                        query.setFirstResult(deslocamento);

                        quantRegDAO = query.getResultList().size();
                        modeloPesquisaPaginada = query.getResultList();
                        }catch(Exception e){
                  modeloPesquisaPaginada = new ArrayList();
                 } finally{
                   em.close();
                 }
                        return modeloPesquisaPaginada;
                }  

                /// carregamento padrao
                public List<N> CarregamentoPadrão( String namedQuery) {
                 EntityManager em = getEM();
                List<N> modelo;
                    try{
                         em.getTransaction().begin();
                       Query query = em.createNamedQuery(namedQuery);
        //         
        //		query.setMaxResults(30);
        //		query.setFirstResult(0);
                 quantRegDAO= query.getResultList().size();
                        modelo = query.getResultList();

                        }catch(Exception e){
                  modelo = new ArrayList();
                 } finally{
                   em.close();
                 }
                        return modelo;
                }  


}



