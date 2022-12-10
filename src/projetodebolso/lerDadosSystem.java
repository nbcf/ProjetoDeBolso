/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodebolso;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;


public class lerDadosSystem {


public static String textDoneDriverJdbc = "";   
public static String textDoneUrlServidor = "";
public static String textDoneParPortDb = "";
public static String textDoneParDriverDb = "";
public static String textDoneParDialetoDb = "";
public static String textDoneParDatabase = "";
public static String textDoneParLogin = "";
public static String textDoneParSenha = "";



  public static  String textDoneddl = ""; 
  public static  String textDoneopddl = ""; 

  public static  String textDoneShow_Sql   = ""; 
  public static  String textDoneFormat_Sql = ""; 
  public static  String textDoneGS         = ""; 
  public static  String textDoneUSC        = ""; 
 
  
  
   public static  String textDoneC3p0_max_size = ""; 
  public static  String textDoneC3p0_min_size = ""; 
  public static  String textDoneC3p0_timeout = ""; 
  public static  String textDoneC3p0_max_statements = ""; 
  public static  String textDoneC3p0_idle_test_period = ""; 
  public static  String textDoneC3p0_acquire_increment = "";  
  
    public static void leituraFiles(){
        
          File doneDriverJdbc   = new File      ("./dist/urlDriverJdbc.nbx");
          File doneUrlServidor   =   new File   ("./dist/urlServidor.nbx");
          File donePortDb        =   new File    ("./dist/portDb.nbx");
          File doneDriverDb      =   new File   ("./dist/driverDb.nbx");
          File doneDialetoDb     =   new File   ("./dist/dialetoDb.nbx");
          File doneDatabase      =   new File   ("./dist/database.nbx");
          File doneLogin         =   new File   ("./dist/usuarioBd.nbx");
          File doneSenha         =   new File   ("./dist/senhaDb.nbx");
          

         FileInputStream    fluxDoneDriverJdbc     = null;
         ObjectInputStream  enterDoneDriverJdbc    = null;
         DataInputStream    dataDoneDriverJdbc     = null;
          
          
         FileInputStream    fluxDoneUrlServidor     = null;
         ObjectInputStream  enterDoneUrlServidor    = null;
         DataInputStream    dataDoneUrlServidor     = null;

         FileInputStream    fluxDonePortDb          = null;
         ObjectInputStream  enterDonePortDb         = null;
         DataInputStream    dataDonePortDb          = null;

         FileInputStream    fluxDoneDriverDb        = null;
         ObjectInputStream  enterDoneDriverDb       = null;
         DataInputStream    dataDoneDriverDb        = null;

         FileInputStream    fluxDoneDialetoDb       = null;
         ObjectInputStream  enterDoneDialetoDb      = null;
         DataInputStream    dataDoneDialetoDb       = null;

         FileInputStream    fluxDoneDatabase        = null;
         ObjectInputStream  enterDoneDatabase       = null;
         DataInputStream    dataDoneDatabase        = null;

         FileInputStream    fluxDoneLogin           = null;
         ObjectInputStream  enterDoneLogin          = null;
         DataInputStream    dataDoneLogin           = null;

         FileInputStream    fluxDoneSenha           = null;
         ObjectInputStream  enterDoneSenha          = null;
         DataInputStream    dataDoneSenha           = null;

        try{
            
        fluxDoneDriverJdbc   = new FileInputStream(doneDriverJdbc);
        enterDoneDriverJdbc  = new ObjectInputStream(fluxDoneDriverJdbc);
        dataDoneDriverJdbc   = new DataInputStream( fluxDoneDriverJdbc);
            
        fluxDoneUrlServidor   = new FileInputStream(doneUrlServidor);
        enterDoneUrlServidor  = new ObjectInputStream(fluxDoneUrlServidor);
        dataDoneUrlServidor   = new DataInputStream( fluxDoneUrlServidor);

        fluxDonePortDb        = new FileInputStream(donePortDb);
        enterDonePortDb       = new ObjectInputStream(fluxDonePortDb);
        dataDonePortDb        = new DataInputStream(fluxDonePortDb);

        fluxDoneDriverDb      = new  FileInputStream(doneDriverDb);
        enterDoneDriverDb     = new  ObjectInputStream(fluxDoneDriverDb);
        dataDoneDriverDb      = new  DataInputStream(fluxDoneDriverDb);

        fluxDoneDialetoDb     = new  FileInputStream(doneDialetoDb);
        enterDoneDialetoDb    = new  ObjectInputStream(fluxDoneDialetoDb);
        dataDoneDialetoDb     = new  DataInputStream(fluxDoneDialetoDb);

        fluxDoneDatabase      = new  FileInputStream(doneDatabase);
        enterDoneDatabase     = new  ObjectInputStream(fluxDoneDatabase);
        dataDoneDatabase      = new  DataInputStream(fluxDoneDatabase);

        fluxDoneLogin         = new  FileInputStream(doneLogin);
        enterDoneLogin        = new  ObjectInputStream(fluxDoneLogin);
        dataDoneLogin         = new  DataInputStream(fluxDoneLogin);

        fluxDoneSenha         = new  FileInputStream(doneSenha);
        enterDoneSenha        = new  ObjectInputStream(fluxDoneSenha);
        dataDoneSenha         = new  DataInputStream(fluxDoneSenha);

        textDoneDriverJdbc    =   (String) enterDoneDriverJdbc.readObject();
        textDoneUrlServidor    =   (String) enterDoneUrlServidor.readObject();
        textDoneParPortDb      =   (String) enterDonePortDb.readObject();
        textDoneParDriverDb    =   (String) enterDoneDriverDb.readObject();
        textDoneParDialetoDb   =   (String) enterDoneDialetoDb.readObject();
        textDoneParDatabase    =   (String) enterDoneDatabase.readObject();
        textDoneParLogin       =   (String) enterDoneLogin.readObject();
        textDoneParSenha       =   (String) enterDoneSenha.readObject();

  
        
        enterDoneDriverJdbc.close();
        dataDoneDriverJdbc.close();
        
        enterDoneUrlServidor.close();
        dataDoneUrlServidor.close();
        
        enterDonePortDb.close();
        dataDonePortDb.close();
        
        enterDoneDriverDb.close();
        dataDoneDriverDb.close();
        
        enterDoneDialetoDb.close();
        dataDoneDialetoDb.close();
        
        enterDoneDatabase.close();
        dataDoneDatabase.close();
        
        enterDoneLogin.close();
        dataDoneLogin.close();
        
        enterDoneSenha.close();
        dataDoneSenha.close();
        }
        catch(Exception e)
        {
        }
             System.out.println(textDoneDriverJdbc);
        

}
  public static void leituraFilesDDL(){
        
    File fileDdl     =   new File ("./dist/ddl.nbx");
    File filOpDdl    =   new File ("./dist/opddl.nbx");

      FileInputStream    fluxDoneDdl     = null;
      ObjectInputStream  enterDoneDdl     = null;
      DataInputStream    dataDoneDdl     = null;
             
      FileInputStream    fluxDoneOpDdl     = null;
      ObjectInputStream  enterDoneOpDdl    = null;
      DataInputStream    dataDoneOpDdl     = null;

       try
       {     
       fluxDoneDdl   = new FileInputStream(fileDdl);
       enterDoneDdl  = new ObjectInputStream(fluxDoneDdl);
       dataDoneDdl   = new DataInputStream(fluxDoneDdl);
            
       fluxDoneOpDdl   = new FileInputStream(filOpDdl);
       enterDoneOpDdl  = new ObjectInputStream(fluxDoneOpDdl);
       dataDoneOpDdl   = new DataInputStream(fluxDoneOpDdl);

       textDoneddl    =  (String) enterDoneDdl.readObject();
       textDoneopddl  =  (String)enterDoneOpDdl.readObject();
       
       enterDoneDdl.close();
       dataDoneDdl.close();
        
       enterDoneOpDdl.close();
       dataDoneOpDdl.close();

        }
        catch(Exception e)
        {
        }
    }
   public static void leituraFilesDebug()
    {    
        File fileShow_Sql   =   new File ("./dist/show_Sql.nbx");
        File filFor_Sql     =   new File ("./dist/format_Sql.nbx");
        File filGS          =   new File ("./dist/gS.nbx");
        File filUSC         =   new File ("./dist/uSC.nbx");

         FileInputStream    fluxDoneShow_Sql    = null;
         ObjectInputStream  enterDoneShow_Sql   = null;
         DataInputStream    dataDoneShow_Sql    = null;
          
         FileInputStream    fluxDoneFor_Sql     = null;
         ObjectInputStream  enterDoneFor_Sql    = null;
         DataInputStream    dataDoneFor_Sql     = null;

         FileInputStream    fluxDoneGS          = null;
         ObjectInputStream  enterDoneGS         = null;
         DataInputStream    dataDoneGS          = null;

         FileInputStream    fluxDoneUSC         = null;
         ObjectInputStream  enterDoneUSC        = null;
         DataInputStream    dataDoneUSC         = null;

        try
        {    
        fluxDoneShow_Sql    = new FileInputStream(fileShow_Sql);
        enterDoneShow_Sql   = new ObjectInputStream(fluxDoneShow_Sql);
        dataDoneShow_Sql    = new DataInputStream(fluxDoneShow_Sql );
            
        fluxDoneFor_Sql     = new FileInputStream(filFor_Sql);
        enterDoneFor_Sql    = new ObjectInputStream(fluxDoneFor_Sql);
        dataDoneFor_Sql     = new DataInputStream(fluxDoneFor_Sql);
        
        fluxDoneGS     = new FileInputStream(filGS);
        enterDoneGS    = new ObjectInputStream(fluxDoneGS);
        dataDoneGS     = new DataInputStream(fluxDoneGS);
        
        fluxDoneUSC     = new FileInputStream(filUSC);
        enterDoneUSC    = new ObjectInputStream(fluxDoneUSC);
        dataDoneUSC     = new DataInputStream(fluxDoneUSC);

         textDoneShow_Sql   = (String) enterDoneShow_Sql.readObject();
         textDoneFormat_Sql = (String) enterDoneFor_Sql.readObject();
         textDoneGS         = (String) enterDoneGS.readObject();
         textDoneUSC        = (String) enterDoneUSC.readObject();
  
         
            System.out.println(textDoneShow_Sql);
        enterDoneShow_Sql.close();
        dataDoneShow_Sql.close();
        
        enterDoneFor_Sql.close();
        dataDoneFor_Sql.close();
        
        enterDoneGS.close();
        dataDoneGS.close();
        
        enterDoneUSC.close();
        dataDoneUSC.close();

        }
        catch(Exception e)
        {
        }

        

}
   
   public static void leituraFilesC3pO(){
        
         
        File fileC3p0_max_size          =   new File ("./dist/c3p0_max_size.nbx");
        File filC3p0_min_size           =   new File ("./dist/c3p0_min_size.nbx");
        File filC3p0_timeout            =   new File ("./dist/c3p0_timeout.nbx");
        File filC3p0_max_statements     =   new File ("./dist/c3p0_max_statements.nbx");
        File filC3p0_idle_test_period   =   new File ("./dist/c3p0_idle_test_period.nbx");
        File filC3p0_acquire_increment  =   new File ("./dist/c3p0_acquire_increment.nbx");




           FileInputStream    fluxDoneC3p0_max_size     = null;
         ObjectInputStream  enterDoneC3p0_max_size    = null;
         DataInputStream    dataDoneC3p0_max_size     = null;
          
          
         FileInputStream    fluxDoneC3p0_min_size     = null;
         ObjectInputStream  enterDoneC3p0_min_size    = null;
         DataInputStream    dataDoneC3p0_min_size     = null;

         FileInputStream    fluxDoneC3p0_timeout          = null;
         ObjectInputStream  enterDoneC3p0_timeout         = null;
         DataInputStream    dataDoneC3p0_timeout          = null;

         FileInputStream    fluxDoneC3p0_max_statemen        = null;
         ObjectInputStream  enterDoneC3p0_max_statemen       = null;
         DataInputStream    dataDoneC3p0_max_statemen        = null;

         FileInputStream    fluxDoneC3p0_idle_test_period       = null;
         ObjectInputStream  enterDoneC3p0_idle_test_period      = null;
         DataInputStream    dataDoneC3p0_idle_test_period       = null;

         FileInputStream    fluxDoneC3p0_acquire_increment        = null;
         ObjectInputStream  enterDoneC3p0_acquire_increment       = null;
         DataInputStream    dataDoneC3p0_acquire_increment       = null;

        try{
            
        fluxDoneC3p0_max_size   = new FileInputStream(fileC3p0_max_size);
       enterDoneC3p0_max_size  = new ObjectInputStream(fluxDoneC3p0_max_size);
        dataDoneC3p0_max_size   = new DataInputStream(fluxDoneC3p0_max_size);
            
        fluxDoneC3p0_min_size   = new FileInputStream(filC3p0_min_size);
        enterDoneC3p0_min_size  = new ObjectInputStream(fluxDoneC3p0_min_size);
        dataDoneC3p0_min_size   = new DataInputStream(fluxDoneC3p0_min_size);

        fluxDoneC3p0_timeout        = new FileInputStream(filC3p0_timeout);
        enterDoneC3p0_timeout       = new ObjectInputStream(fluxDoneC3p0_timeout);
        dataDoneC3p0_timeout       = new DataInputStream(fluxDoneC3p0_timeout);

        fluxDoneC3p0_max_statemen      = new  FileInputStream(filC3p0_max_statements);
        enterDoneC3p0_max_statemen      = new  ObjectInputStream(fluxDoneC3p0_max_statemen);
        dataDoneC3p0_max_statemen      = new  DataInputStream(fluxDoneC3p0_max_statemen);

        fluxDoneC3p0_idle_test_period     = new  FileInputStream(filC3p0_idle_test_period);
        enterDoneC3p0_idle_test_period    = new  ObjectInputStream(fluxDoneC3p0_idle_test_period);
        dataDoneC3p0_idle_test_period     = new  DataInputStream(fluxDoneC3p0_idle_test_period);

        fluxDoneC3p0_acquire_increment      = new  FileInputStream(filC3p0_acquire_increment);
        enterDoneC3p0_acquire_increment     = new  ObjectInputStream(fluxDoneC3p0_acquire_increment);
        dataDoneC3p0_acquire_increment       = new  DataInputStream(fluxDoneC3p0_acquire_increment);

//        fluxDoneLogin         = new  FileInputStream(doneLogin);
//        enterDoneLogin        = new  ObjectInputStream(fluxDoneLogin);
//        dataDoneLogin         = new  DataInputStream(fluxDoneLogin);
//
//        fluxDoneSenha         = new  FileInputStream(doneSenha);
//        enterDoneSenha        = new  ObjectInputStream(fluxDoneSenha);
//        dataDoneSenha         = new  DataInputStream(fluxDoneSenha);

        textDoneC3p0_max_size     =   (String) enterDoneC3p0_max_size.readObject();
        textDoneC3p0_min_size   =   (String) enterDoneC3p0_min_size.readObject();
        textDoneC3p0_timeout     =   (String)enterDoneC3p0_timeout.readObject();
        textDoneC3p0_max_statements    =   (String) enterDoneC3p0_max_statemen.readObject();
        textDoneC3p0_idle_test_period   =   (String) enterDoneC3p0_idle_test_period.readObject();
        textDoneC3p0_acquire_increment   =   (String) enterDoneC3p0_acquire_increment.readObject();

  
        
        enterDoneC3p0_max_size.close();
        dataDoneC3p0_max_size.close();
        
        enterDoneC3p0_min_size.close();
        dataDoneC3p0_min_size.close();
        
        enterDoneC3p0_timeout.close();
        dataDoneC3p0_timeout.close();
        
        enterDoneC3p0_max_statemen.close();
        dataDoneC3p0_max_statemen.close();
        
        enterDoneC3p0_idle_test_period.close();
        dataDoneC3p0_idle_test_period.close();
        
        enterDoneC3p0_acquire_increment.close();
        dataDoneC3p0_acquire_increment.close();
       
        }
        catch(Exception e)
        {
        }
             System.out.println(textDoneC3p0_idle_test_period);
        

}
     public static HashMap<String, String> getMapa() { 
 
    HashMap<String, String> map = new HashMap<>(); 
    map.put("javax.persistence.jdbc.driver.value", textDoneParDriverDb);
    
    
    map.put("hibernate.dialect.value", textDoneParDialetoDb);
    
    
    map.put("javax.persistence.jdbc.url",  textDoneDriverJdbc+textDoneUrlServidor+":"+textDoneParPortDb+"/"+textDoneParDatabase);
    
    
    
    map.put("javax.persistence.jdbc.user.value", textDoneParLogin);
    map.put("javax.persistence.jdbc.password.value", textDoneParSenha);
    
    if(textDoneShow_Sql.equals("true"))
    {
    map.put("hibernate.show_sql.value","true" );
    } 
    else if(textDoneShow_Sql.equals("false"))
    {
    map.put("hibernate.show_sql.value", "false" );
    }
    
    
       if(textDoneFormat_Sql.equals("true"))
    {
       map.put(textDoneFormat_Sql, "true");

    } 
    else if(textDoneFormat_Sql.equals("false"))
    {
        map.put(textDoneFormat_Sql, "false");

    }
    
    
  //  map.put("hibernate.format_sql.value", "true");

    
    
      if(textDoneddl.equals("<-Nao Declarado->") && textDoneopddl.equals("<-Nao Declarado->") ||
          textDoneddl.equals("hibernate.hbm2ddl.auto") && textDoneopddl.equals("<-Nao Declarado->")  || 
          textDoneddl.equals("<-Nao Declarado->") && 
          textDoneopddl.equals("update")    ||
          textDoneopddl.equals("validate")  ||
          textDoneopddl.equals("update")    ||
          textDoneopddl.equals("create")    ||
          textDoneopddl.equals("createdrop"))
        {

        }
        else if(textDoneddl.equals("hibernate.hbm2ddl.auto") && textDoneopddl.equals("update"))
        {
            map.put(textDoneddl, textDoneopddl);
        }
        else if(textDoneddl.equals("hibernate.hbm2ddl.auto") && textDoneopddl.equals("validate"))
        {
                 map.put(textDoneddl, textDoneopddl);
        }
        else if(textDoneddl.equals("hibernate.hbm2ddl.auto") && textDoneopddl.equals("create"))
        {
                  map.put(textDoneddl, textDoneopddl);
        }
        else  if(textDoneddl.equals("hibernate.hbm2ddl.auto") && textDoneopddl.equals("createdrop"))
        {
                   map.put(textDoneddl, textDoneopddl);
        }
        
    
  if(textDoneC3p0_max_size.isEmpty() || textDoneC3p0_max_size.equals("0") || textDoneC3p0_max_size.equals("") || textDoneC3p0_max_size.equals(null))
  {
   
   
  }
  else if(!textDoneC3p0_max_size.isEmpty() || !textDoneC3p0_max_size.equals("0") || !textDoneC3p0_max_size.equals("") || !textDoneC3p0_max_size.equals(null))
  {
    map.put("hibernate.c3p0.min_size",textDoneC3p0_min_size);
    map.put("hibernate.c3p0.max_size",textDoneC3p0_max_size);
    map.put("hibernate.c3p0.timeout",textDoneC3p0_timeout);
    map.put("hibernate.c3p0.max_statements",textDoneC3p0_max_statements);
    map.put("hibernate.c3p0.idle_test_period",textDoneC3p0_idle_test_period);
   } 
    
    
    return map; 
    }
     
//     
//    //destino persistence.xml
//    public static HashMap<String, String> getMapa() { 
//    HashMap<String, String> map = new HashMap<>(); 
//    map.put("javax.persistence.jdbc.url", textDoneDriverJdbc+textDoneUrlServidor+":"+textDoneParPortDb+"/"+textDoneParDatabase);
//    map.put("javax.persistence.jdbc.user.value", textDoneParLogin);
//    map.put("javax.persistence.jdbc.driver.value", textDoneParDriverDb);
//    map.put("javax.persistence.jdbc.password.value", textDoneParSenha);
//    map.put("hibernate.dialect.value", textDoneParDialetoDb);
//    map.put("hibernate.show_sql.value", "true");
//    map.put("hibernate.format_sql.value", "true");
//    
//    return map; 
//    }
//
//    //destino adutoria Ti.
//    public static HashMap<String, String> getMapaTi() {     
//    HashMap<String, String> mapTi = new HashMap<>();
//    mapTi.put("javax.persistence.jdbc.user.value", textDoneParLogin);
//    mapTi.put("javax.persistence.jdbc.driver.value", textDoneParDriverDb);
//    mapTi.put("javax.persistence.jdbc.password.value", textDoneParSenha);
//    mapTi.put("hibernate.dialect.value", textDoneParDialetoDb);
//    mapTi.put("hibernate.show_sql.value", "true");
//    mapTi.put("hibernate.format_sql.value", "true");
//    mapTi.put("portaServidor", textDoneParPortDb);
//    mapTi.put("dataBase", textDoneParDatabase);
//    mapTi.put("hibernate.show_sql.value", "true");
//    mapTi.put("hibernate.format_sql.value", "true");
//    mapTi.put("portaServidor", textDoneParPortDb);
//    mapTi.put("dataBase", textDoneParDatabase);
//    mapTi.put("driverJdbc", "mysql");
//    mapTi.put("hibernate.show_sql.value", "true");
//    mapTi.put("hibernate.format_sql.value", "true");
//    return mapTi; 
//    }
//  
    
}