/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exl.infraWrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import javax.swing.JOptionPane;

/**
* @author NILDO BUENO CORREIA FILHO 
 * NB- DESENVOLVIMENTO DE SISTEMAS
 * EMAIL: nildojava@gmail.com    
 *        nildin82@hotmail.com
 * CEL: 8115-7490
 */
public class CopiaBackupRealizado {
    
    public static void OpcaoCpBckup(String bckpLocal, String bckpStorage ){
   
    try {

      FileInputStream fisbckp = null;
      fisbckp = new FileInputStream(bckpLocal);
      FileChannel or_storage = null;
      or_storage = fisbckp.getChannel();
      FileOutputStream fosbckp = null;
      fosbckp = new FileOutputStream(bckpStorage);
      FileChannel destino_bckp = null;
      destino_bckp = fosbckp.getChannel();

      destino_bckp.transferFrom(or_storage, 0, or_storage.size());
      or_storage.close();
      destino_bckp.close();
   //   ta_logs.append("CÓPIA SEGURANÇA DO BACKUP SALVA EM"+"\n"+tf_dir_copia.getText()+"\n");
      }
      catch(Exception exc){
      JOptionPane.showMessageDialog(null, "ERRO AO REALIZAR CÓPIA DE SEGURANÇA","AVISO DO SISTEMA",JOptionPane.ERROR_MESSAGE);
      }
   }

}
