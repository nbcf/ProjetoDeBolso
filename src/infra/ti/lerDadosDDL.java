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

/**
 *
 * @author Nildo
 */
public class lerDadosDDL {
    


  public static  String textDoneddl = ""; 
  public static  String textDoneopddl = ""; 
 

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
}

