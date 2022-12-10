
package projetodebolso;



/**
 *
 * @author nil_b
 */
public class ETLEntradaDados {
    
 

    public  String RemoverEspacosEmBrancoStringSubistituirVazio(String stringId) { 
         String stringlimpaVazio ;
 
        stringlimpaVazio = stringId.replaceAll("\\s+", "");

    return stringlimpaVazio;
    }
  
      public  String RemoverEspacosEmBrancoIntegerSubistituirVazio(String stringId) { 
          String converter ;
          converter = stringId;
    
         converter =  converter.replaceAll("\\s+", "");
          System.out.println(converter.trim());

    return converter;
    }

      
   public  Boolean TestarStringEmpity(String stringEnviada) { 
      boolean retorno = false;
      if(stringEnviada.isEmpty() || stringEnviada.equals("") ){
            retorno = true;
        }
     return retorno;
    }
   
   public  Boolean TestarStringNull(String stringEnviada) { 
      boolean retorno = false;
      if(stringEnviada == null){
            retorno = true;
        }

     return retorno;
    }


   public  Boolean TestarIntegerNull(Integer intEnviado) { 
      boolean retorno = false;
      if(intEnviado == null){
            retorno = true;
        }

     return retorno;
    }
   

      public Boolean TamanhoStringMaior(String stringEnviada, Integer minimo){
          boolean retorno = false;
      int tamanhoMinimo = minimo;
      int stringObservada = 0;
      stringObservada = stringEnviada.length();
     
      if(stringObservada >= tamanhoMinimo ){
      
      retorno = true;
      
      }
      
      return retorno;
      }
      public Boolean TamanhoStringMenor(String stringEnviada, Integer minimo){
          boolean retorno = false;
      int tamanhoMinimo = minimo;
      int stringObservada = 0;
      stringObservada = stringEnviada.length();
     
      if(stringObservada <= tamanhoMinimo ){
      
      retorno = true;
      
      }
      
      return retorno;
      }
      
      
             
//          if (n.getId() == null ||  Objects.equals(n.getId(),stringNome) ||  Objects.equals(n.getId(), null)) {
//                    if(n.getNome().isEmpty() ||  Objects.equals(n.getNome(),stringNome) ||  Objects.equals(n.getNome(), null) ){
      
}
