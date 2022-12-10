
package InfraTi;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

 /**
* @author NILDO BUENO CORREIA FILHO 
 * CPF: 10333054725
 * EMAIL: nil_bueno@hotmail.com    
 * JAVA VERSION - 8;14;17
 * NETBEANS     - 8;12;16  >> 
 * 
 * não tenho celular, 
 * por gentileza entrem 
 * em contato pelo email acima. 
 * ;)
 * Created on 10/12/2022, 14:35
 */
public class lerDadosDebug {
 
  public static  String textDoneShow_Sql   = ""; 
  public static  String textDoneFormat_Sql = ""; 
  public static  String textDoneGS         = ""; 
  public static  String textDoneUSC        = ""; 
 
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
    
    
}