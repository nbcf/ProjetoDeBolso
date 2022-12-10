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
import java.util.Base64;
import javax.swing.JTextField;


/**
 *
 * @author Nildo
 */
public class getUnMash {
public static String descStr1 = "";
public static String descStr2 = "";

    public void unJtextFieldStyle( 
            String dirFileConf0,
            String dirFileConf01, 
            String nameFileConf0,
            String nameFileConf01){
        
        
            File doneConf0   =   new File   (dirFileConf01+nameFileConf0);
            File doneConf1   =   new File   (dirFileConf01+nameFileConf01);
        
            FileInputStream    fluxDoneConf0     = null;
            ObjectInputStream  enterDoneConf0    = null;
            DataInputStream    dataDoneConf0     = null;
            
            FileInputStream    fluxDoneConf1     = null;
            ObjectInputStream  enterDoneConf1    = null;
            DataInputStream    dataDoneConf1     = null;
         
            try{
            fluxDoneConf0   = new FileInputStream(doneConf0);
            enterDoneConf0  = new ObjectInputStream(fluxDoneConf0);
            dataDoneConf0   = new DataInputStream( fluxDoneConf0);
            
            fluxDoneConf1   = new FileInputStream(doneConf1);
            enterDoneConf1  = new ObjectInputStream(fluxDoneConf1);
            dataDoneConf1   = new DataInputStream(fluxDoneConf1);
        
            
            String d1 = (String) enterDoneConf0.readObject();
            String d2 = (String) enterDoneConf1.readObject();

            enterDoneConf0.close();
            dataDoneConf0.close();
        
            enterDoneConf1.close();
            dataDoneConf1.close();
        
        
            System.gc();
        }catch(Exception e){
        }
        
     
 }
  
}
