/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra.ti;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;


/**
 *
 * @author Nildo
 */
public class lerDadosTi {

public static String textDriver = null;    
public static String textDoneUrlServidor = null;
public static String textDoneParPortDb = null;
public static String textDoneParDriverDb = null;
public static String textDoneParDialetoDb = null;
public static String textDoneParDatabase = null;
public static String textDoneParLogin = null;
public static String textDoneParSenha = null;
    
    public static void confirmaTi(){
    String str = "";
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

        textDriver             =   (String) enterDoneDriverJdbc.readObject();    
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
         System.gc();
        }
        catch(Exception e)
        {
        }
        
        int confirmar;
        Object[] bot = {" SIM "};
        confirmar = JOptionPane.showOptionDialog(null, 
           "driver:    "+textDriver+"\n"+     
           "Servidor:   "+textDoneUrlServidor+"\n"+
           "Porta:      "+textDoneParPortDb+"\n"+ 
           "Driver:     "+textDoneParDriverDb+"\n"+ 
           "Dialeto:    "+textDoneParDialetoDb+"\n"+ 
           "DataBase:   "+textDoneParDatabase+"\n"+ 
           "Login:      "+textDoneParLogin +"\n"+        
           "Senha:      "+textDoneParSenha+"\n"+
           "Url:        "+textDriver+textDoneUrlServidor+":"+textDoneParPortDb+"/"+textDoneParDatabase+"\n",
           "AVISO DO SISTEMA", 
          
           JOptionPane.OK_OPTION, 
           JOptionPane.PLAIN_MESSAGE,
           null,
           bot,
           bot[0]);
                 if (confirmar ==  JOptionPane.OK_OPTION) {
                    // System.exit(0);
                    }
                    
    }
}
