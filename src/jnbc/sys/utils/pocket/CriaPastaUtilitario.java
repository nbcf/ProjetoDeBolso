 /**
 *
* @author NILDO BUENO CORREIA FILHO 
 * NB- DESENVOLVIMENTO DE SISTEMAS
 * EMAIL: nildojava@gmail.com    
 *        nildin82@hotmail.com
 * CEL: 8115-7490
 * Created on 25/10/2011, 16:20:43
 */
package br.com.exl.util;

import java.io.File;
import java.io.IOException;


public class CriaPastaUtilitario {
    
    public static void criaPastabyNildo(String arqTemp)throws IOException {
        
         try
        {
           File arquivoTemp = new File (arqTemp);
           arquivoTemp.mkdir();
        }catch(Exception e){
        
        }
    
    }
    
}
