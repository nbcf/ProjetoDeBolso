/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfraTi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Nildo
 */
public class escritaDadosDebug {
        
    public static void SalvaConfDebug
                        (
                        String bolShow_Sql,
                        String bolFormat_Sql,
                        String bolGS,
                        String bolUSC 
                        )
                        {

        File fileShow_Sql   =   new File ("./dist/show_Sql.nbx");
        File filFormat_Sql  =   new File ("./dist/format_Sql.nbx");
        File filGS          =   new File ("./dist/gS.nbx");
        File filUSC         =   new File ("./dist/uSC.nbx");

      FileOutputStream fluxInShow_Sql    = null;
      FileOutputStream fluxInFormat_Sql  = null;
      FileOutputStream fluxInGS          = null;
      FileOutputStream fluxInUSC         = null;

      ObjectOutputStream fluxOutShow_Sql    = null;
      ObjectOutputStream fluxOutFormat_Sql  = null;
      ObjectOutputStream fluxOutGS          = null;
      ObjectOutputStream fluxOutUSC         = null;

      String debugShow_Sql1     = (String)bolShow_Sql;
      String debugFormat_Sql2   = (String)bolFormat_Sql;
      String debugGS3           = (String)bolGS;
      String debugUSC4          = (String)bolUSC;

      try
      {
      fluxInShow_Sql    =   new FileOutputStream(fileShow_Sql);
      fluxInFormat_Sql  =   new FileOutputStream(filFormat_Sql);
      fluxInGS          =   new FileOutputStream(filGS);
      fluxInUSC         =   new FileOutputStream(filUSC);

      fluxOutShow_Sql    = new ObjectOutputStream(fluxInShow_Sql); 
      fluxOutFormat_Sql  = new ObjectOutputStream(fluxInFormat_Sql);
      fluxOutGS          = new ObjectOutputStream(fluxInGS);
      fluxOutUSC         = new ObjectOutputStream(fluxInUSC);

      fluxOutShow_Sql.writeObject(debugShow_Sql1);
      fluxOutFormat_Sql.writeObject(debugFormat_Sql2);
      fluxOutGS.writeObject(debugGS3);
      fluxOutUSC.writeObject(debugUSC4);

      fluxOutShow_Sql.close();
      fluxOutFormat_Sql.close();
      fluxOutGS.close();
      fluxOutUSC.close();
       }
       catch(Exception e)
       {  
 
       }    
    }  
}
