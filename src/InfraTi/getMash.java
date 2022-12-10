
package InfraTi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;
import javax.swing.JTextField;

/**
 *
 * @author Nildo
 */
public class getMash {
    public static String encStr1;
    public static String encStr2;
    public void encJtextFieldStyle(
            String dirFileConf0,
            String dirFileConf01,
            String nameFileConf0,
            String nameFileConf01,
    
            JTextField str1, 
            JTextField str2){
        
        String a = str1.getText().trim();
        String b = str2.getText().trim();
        
            
        File doneConf0   =   new File   (dirFileConf0+nameFileConf0);
        File doneConf1   =   new File   (dirFileConf01+nameFileConf01);
          
        FileOutputStream fluxInConf0   = null;
        FileOutputStream fluxInConf1   = null;

        ObjectOutputStream fluxOutConf0   = null;
        ObjectOutputStream fluxOutConf1   = null;
          
 
//        System.out.println(cpt.mash(a.getBytes().toString()));
//        System.out.println(cpt.mash(b.getBytes().toString()));
        
        
        try{
        fluxInConf0    =   new FileOutputStream(doneConf0);
        fluxInConf1    =   new FileOutputStream(doneConf1);
       
        fluxOutConf0   =   new ObjectOutputStream(fluxInConf0);
        fluxOutConf1   =   new ObjectOutputStream(fluxInConf1);
        
   
        
        
        fluxOutConf0.close();
        fluxOutConf1.close();
 }
       catch(Exception e)
       {  
       
       }
 }
     
}
