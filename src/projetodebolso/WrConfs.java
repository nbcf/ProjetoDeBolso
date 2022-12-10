/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodebolso;


import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

 /**
* @author NILDO BUENO CORREIA FILHO 
 * CPF: 10333054725
 * EMAIL: nil_bueno@hotmail.com    
 * JAVA VERSION - 14
 * NETBEANS     - 12
 * 
 * Created on 19/07/2022, 03:20:27
 */
public class WrConfs {
    
    public static void SalvaConfPersistence(
                        
                        String strUrlServidor,
                        String strPortDb, 
                        String strDriverDb, 
                        String strDialetoDb, 
                        String strDatabase, 
                        String strLogin, 
                        String strSenha,
                        String diretorio
                        )
    {

      int opcao;
                   Object[] botoes = {" SIM "," NÃO "};
                
                   opcao = JOptionPane.showOptionDialog(null, "O Programa será fechado, para aplicar novas configurações", "AVISO DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                   if (opcao ==  JOptionPane.YES_OPTION) {

        
        File dirServidor       =   new File    (diretorio+"urlServidor.nbx");
        File dirPortDb         =   new File    (diretorio+"portDb.nbx");
        File dirDriverDb       =   new File    (diretorio+"driverDb.nbx");
        File dirDialetoDb      =   new File    (diretorio+"dialetoDb.nbx");
        File dirDatabase       =   new File    (diretorio+"database.nbx");
        File dirLogin          =   new File    (diretorio+"usuarioBd.nbx");
        File dirSenha          =   new File    (diretorio+"senhaDb.nbx");

       
          FileOutputStream fluxInUrlServidor    = null;
          FileOutputStream fluxInPortDb         = null;
          FileOutputStream fluxInDriverDb       = null;
          FileOutputStream fluxInDialetoDb      = null;
          FileOutputStream fluxInDatabase       = null;
          FileOutputStream fluxInLogin          = null;
          FileOutputStream fluxInSenha          = null;
        
         //   ObjectOutputStream fluxOutDirAnalise = null;
        
          ObjectOutputStream fluxOuturlServidor     = null;
          ObjectOutputStream fluxOutportDb          = null;
          ObjectOutputStream fluxOutdriverDb        = null;
          ObjectOutputStream fluxOutdialetoDb       = null;
          ObjectOutputStream fluxOutdatabase        = null;
          ObjectOutputStream fluxOutlogin           = null;
          ObjectOutputStream fluxOutsenha           = null;
          
         // Object c1 = (Object)parDriverJdbc;
       
//          Object c1 = (Object)  cpt.mash(strUrlServidor,chave);
//          Object c2 = (Object)   cpt.mash(strPortDb,chave);
//          Object c3 = (Object)   cpt.mash(strDriverDb,chave);
//          Object c4 = (Object)   cpt.mash(strDialetoDb,chave);
//          Object c5 = (Object)   cpt.mash(strDatabase,chave);
//          Object c6 = (Object)   cpt.mash(strLogin,chave);
//          Object c7 = (Object)   cpt.mash(strSenha,chave);
    
          Object c1 = (Object) strUrlServidor;
          Object c2 = (Object) strPortDb;
          Object c3 = (Object) strDriverDb;
          Object c4 = (Object) strDialetoDb;
          Object c5 = (Object) strDatabase;
          Object c6 = (Object) strLogin;
          Object c7 = (Object) strSenha;
          
          
                  
          

       try{
           
  //          fluxInDirAnalise = new FileOutputStream(dirAnalise);
                             
                              
    
       fluxInUrlServidor    =   new FileOutputStream(dirServidor);
       fluxInPortDb         =   new FileOutputStream(dirPortDb);
       fluxInDriverDb       =   new FileOutputStream(dirDriverDb);
       fluxInDialetoDb      =   new FileOutputStream(dirDialetoDb);
       fluxInDatabase       =   new FileOutputStream(dirDatabase);
       fluxInLogin          =   new FileOutputStream(dirLogin);
       fluxInSenha          =   new FileOutputStream(dirSenha);
// fluxOutDirAnalise = new ObjectOutputStream(fluxInDirAnalise);
                              
       
       fluxOuturlServidor   =   new ObjectOutputStream(fluxInUrlServidor);
       fluxOutportDb        =   new ObjectOutputStream(fluxInPortDb);
       fluxOutdriverDb      =   new ObjectOutputStream(fluxInDriverDb);
       fluxOutdialetoDb     =   new ObjectOutputStream(fluxInDialetoDb);
       fluxOutdatabase      =   new ObjectOutputStream(fluxInDatabase);
       fluxOutlogin         =   new ObjectOutputStream(fluxInLogin);
       fluxOutsenha         =   new ObjectOutputStream(fluxInSenha);
        
    
     
   
    //   fluxOutDirAnalise.close();
    
       fluxOuturlServidor.close();
       fluxOutportDb.close();
       fluxOutdriverDb.close();
       fluxOutdialetoDb.close();
       fluxOutdatabase.close();
       fluxOutlogin.close();
       fluxOutsenha.close();
       
//       
//    entradaObjeto.close();
//    ob_Pri.close();
//    entradaObjeto1.close();
//    ob_Pri1.close();
//    entradaObjeto2.close();
//    ob_Pri2.close();
//    entradaObjeto3.close();
//    ob_Pri3.close();
   
       
       }
       catch(Exception e)
       {  
       
       }
      //  lerDadosTi.confirmaTi();
    }
  }
                 
}


