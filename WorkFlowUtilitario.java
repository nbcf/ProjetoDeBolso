 /**
 *
* @author NILDO BUENO CORREIA FILHO 
 * NB- DESENVOLVIMENTO DE SISTEMAS
 * EMAIL: nildojava@gmail.com    
 *        nildin82@hotmail.com
 * CEL: 8115-7490
 * Created on 25/10/2011, 16:25:19
 */
package br.com.exl.util;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


public class WorkFlowUtilitario {
    
    
     public static void EnviaEmailbyNildo(String servidorSMTP, 
                                          String login, String senha, int portaSMTP, 
                                          String destinatario, String nomeDestinatario, 
                                          String remetende, String nomeRemetente , 
                                          String assunto, String mensagem  ) throws EmailException {

   SimpleEmail email = new SimpleEmail();
   email.setHostName(servidorSMTP);
   email.setSmtpPort( portaSMTP);
   email.addTo(destinatario, nomeDestinatario);
   email.setFrom(remetende, nomeRemetente);
   email.setSubject(assunto);

   email.setMsg(mensagem);

   email.setSSL(true);
   email.setAuthentication(login, senha);
   //ta_logs.append("ENVIANDO EMAIL ALERTA..."+"\n");
   //ta_logs.append("AUTENTICANDO..."+" "); 
   email.send();                 
   //ta_logs.append("EMAIL DE ALERTA ENVIANDO COM SUCESSO"+"\n");                
   }
}
