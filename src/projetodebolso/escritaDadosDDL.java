/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodebolso;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Nildo
 */
public class escritaDadosDDL {
 public static void SalvaDadosDDL
                        (
                        String strDDL,
                        String strOPDDL
                        )
                        {

    File fileDdl     =   new File ("./dist/ddl.nbx");
    File filOpDdl    =   new File ("./dist/opddl.nbx");

  FileOutputStream fluxInddl      = null;
  FileOutputStream fluxInOpddl    = null;

  ObjectOutputStream fluxOutddl    = null;
  ObjectOutputStream fluxOutopddl  = null;

  Object ddl1 = (Object) strDDL;
  Object ddl2 = (Object) strOPDDL;


   try
   {
   fluxInddl    =   new FileOutputStream(fileDdl);
   fluxInOpddl  =   new FileOutputStream(filOpDdl);

   fluxOutddl     = new ObjectOutputStream(fluxInddl); 
   fluxOutopddl   = new ObjectOutputStream(fluxInOpddl);

   fluxOutddl.writeObject(ddl1);
   fluxOutopddl.writeObject(ddl2);

   fluxOutddl.close();
   fluxOutopddl.close();

   }
       catch(Exception e)
       {  
 
       }    
    }
  }   
    

