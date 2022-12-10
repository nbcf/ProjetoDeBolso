/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfraTi;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import javax.swing.JOptionPane;
 /**
* @author NILDO BUENO CORREIA FILHO 
 * CPF: 10333054725
 * EMAIL: nil_bueno@hotmail.com    
 * JAVA VERSION - 14
 * NETBEANS     - 12
 * 
 * Created on 24/12/2021, 03:20:27
 */
public class LerMapPersistenceXml {

public static String textDoneUrlServidor = "";
public static String textDoneParPortDb = "";
public static String textDoneParDriverDb = "";
public static String textDoneParDialetoDb = "";
public static String textDoneParDatabase = "";
public static String textDoneParLogin = "";
public static String textDoneParSenha = "";
public static String textDoneSchema ="";
    public static void confirmaTi(String dirFileConf){
 
          File doneUrlServidor   =   new File (dirFileConf+"urlServidor.nbx");
          File donePortDb        =   new File (dirFileConf+"portDb.nbx");
          File doneDriverDb      =   new File (dirFileConf+"driverDb.nbx");
          File doneDialetoDb     =   new File (dirFileConf+"dialetoDb.nbx");
          File doneDatabase      =   new File (dirFileConf+"database.nbx");
          File doneLogin         =   new File (dirFileConf+"usuarioBd.nbx");
          File doneSenha         =   new File (dirFileConf+"senhaDb.nbx");
          File doneSchema        =   new File (dirFileConf+"schemaDb.nbx");
          
          
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
         
         FileInputStream    fluxDoneSchema          = null;
         ObjectInputStream  enterDoneSchema          = null;
         DataInputStream    dataDoneSchema          = null;

        try{
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
        
        fluxDoneSchema        = new  FileInputStream(doneSenha);
        enterDoneSchema        = new  ObjectInputStream(fluxDoneSenha);
        dataDoneSchema         = new  DataInputStream(fluxDoneSenha);
       
        textDoneUrlServidor    =  (String)enterDoneUrlServidor.readObject();
        textDoneParPortDb      =    (String) enterDonePortDb.readObject();
        textDoneParDriverDb    =    (String) enterDoneDriverDb.readObject();
        textDoneParDialetoDb   =   (String) enterDoneDialetoDb.readObject();
        textDoneParDatabase    =   (String) enterDoneDatabase.readObject();
        textDoneParLogin       =    (String) enterDoneLogin.readObject();
        textDoneParSenha       =   (String) enterDoneSenha.readObject();
        
       

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

}
            public static HashMap<String, String> getMapa() { 
                
            HashMap<String, String> map = new HashMap<>(); 

            //map.put("javax.persistence.jdbc.url", textDoneUrlServidor); //Essa propriedade vai substituir aquela que está no arquivo.
            map.put("javax.persistence.jdbc.url", "//"+textDoneUrlServidor+":"+textDoneParPortDb+"/"+textDoneParDatabase);
            map.put("javax.persistence.jdbc.user.value", textDoneParLogin);
            map.put("javax.persistence.jdbc.driver.value", textDoneParDriverDb);
            map.put("javax.persistence.jdbc.password.value", textDoneParSenha);
            map.put("hibernate.dialect.value", textDoneParDialetoDb);
            map.put("hibernate.default_schema", textDoneSchema);
            map.put("hibernate.show_sql.value", "true");
            map.put("hibernate.format_sql.value", "true");
            return map; 
            }

}