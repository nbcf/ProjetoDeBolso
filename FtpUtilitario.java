 /**
 *
 * @author NILDO BUENO CORREIA FILHO 
 * NB- DESENVOLVIMENTO DE SISTEMAS
 * EMAIL: nildojava@gmail.com    
 *        nildin82@hotmail.com
 * CEL: 8115-7490
 * Created on 25/10/2011, 16:45:22
 */
package br.com.exl.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;


public class FtpUtilitario {
    

    
 public static void FtpbyNildo(String servidor, String usuario, String senha, int porta, String localArquivo){
     
    
        String nomeArquivo = null;
        FTPClient ftp = new FTPClient();
         try {
            ftp.connect( servidor,porta);

            if( FTPReply.isPositiveCompletion( ftp.getReplyCode() ) ) {
                ftp.login( usuario, senha );
            //    ta_logs.append("CONECTOU COM SUCESSO"+" "+server_ftp.getText());
            
            } else {        
              
                ftp.disconnect();
            
            }
           
            String e = localArquivo;
            InputStream is = new FileInputStream( e );
            int idx = e.lastIndexOf(File.separator);
            if( idx < 0 ) idx = 0;
            else idx++;
            nomeArquivo = e.substring( idx, e.length() );
                
              if( e.endsWith(".txt") ) {
                    ftp.setFileType( FTPClient.ASCII_FILE_TYPE );
                } else if( e.endsWith(".jpg") ) {
                    ftp.setFileType( FTPClient.BINARY_FILE_TYPE );
                }
                 else if( e.endsWith(".mp3") ) {
                    ftp.setFileType( FTPClient.BINARY_FILE_TYPE );
                }
                  else if( e.endsWith(".rar") ) {
                    ftp.setFileType( FTPClient.BINARY_FILE_TYPE);
                }
                   else if( e.endsWith(".zip") ) {
                    ftp.setFileType( FTPClient.BINARY_FILE_TYPE);
                }
                   else if( e.endsWith(".tgz") ) {
                    ftp.setFileType( FTPClient.BINARY_FILE_TYPE );
                }
                      else if( e.endsWith(".doc") || e.endsWith(".xls") ||
                              e.endsWith(".ppt") || e.endsWith(".docx") || 
                              e.endsWith(".xlsx") || e.endsWith(".pptx") ) {
                    ftp.setFileType( FTPClient.BINARY_FILE_TYPE );
                }
                   else {
                    ftp.setFileType( FTPClient.ASCII_FILE_TYPE );
                }
             
                ftp.storeFile( nomeArquivo, is ); 
//                ta_logs.append("ARQUIVO "+nomeArquivo+"\n"+"ENVIANDO COM SUCESSO."+"\n");
//                ta_logs.append("\n");
//                ta_logs.append("***DESCONECTANDO DO SERVIDOR..."+"\n");    
//                ftp.disconnect();
//                ta_logs.append("***CONEXÃO ENCERRADA***"+"\n");
             } catch( Exception e ) 
             {   
           //   ta_logs.append("CONEXÃO RECUSADA DO FTP:"+" "+server_ftp.getText()+"\n"+"SERVIDOR FTP INDISPONÍVEL !" +"\n");
              JOptionPane.showMessageDialog(null, "CONEXÃO RECUSADA DO FTP:"+" "+servidor+"\n"+"SERVIDOR FTP INDISPONÍVEL", "ALERTAR DO SISTEMA", JOptionPane.WARNING_MESSAGE);
                
             }
  }   
}
