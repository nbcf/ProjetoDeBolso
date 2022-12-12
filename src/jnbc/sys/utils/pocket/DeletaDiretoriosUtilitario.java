 /**
 *
* @author NILDO BUENO CORREIA FILHO 
 * NB- DESENVOLVIMENTO DE SISTEMAS
 * EMAIL: nildojava@gmail.com    
 *        nildin82@hotmail.com
 * CEL: 8115-7490
 * Created on 25/10/2011, 16:13:12
 */
package br.com.exl.util;

import java.io.File;


public class DeletaDiretoriosUtilitario {
    
    
      public static void ExcluirDiretoriobyNildo(String pasta) {

        try
        {
      
            File arquivo = new File (pasta);
            remover(arquivo);
            arquivo.delete();
            System.out.println("Concluido com sucesso");
            System.gc();
        }
             catch(Exception e){
    
              System.out.println(e.toString());
    }
 }

         public static void remover (File pasta){

         if(pasta.exists())
          {

             File[] arquivos  = pasta.listFiles();
             for(File f : arquivos)
             {
                  if(f.isDirectory())
                  {
                     remover(f);
                     f.delete();
                     System.gc();
             }
             else
             {
                System.out.println(f);
                f.delete();
             }
           }
        }
  }
    
}
