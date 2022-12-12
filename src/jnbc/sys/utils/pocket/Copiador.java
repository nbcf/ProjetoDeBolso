 /**
 *
* @author NILDO BUENO CORREIA FILHO 
 * NB- DESENVOLVIMENTO DE SISTEMAS
 * EMAIL: nildojava@gmail.com    
 *        nildin82@hotmail.com
 * CEL: 8115-7490
 * Created on 25/10/2011, 16:36:48
 */

package br.com.exl.util;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

  
   
public class Copiador {   
  
   private byte[] buffer;   
   
   public Copiador(int tamanhoBuffer) {   
          if (tamanhoBuffer < 1) {   
             throw new IllegalArgumentException("O tamanho do buffer precisa ser maior que zero!");   
          }   
          buffer = new byte[tamanhoBuffer];   
       }   

   public void copiaArquivo(File origem, File destino) throws IOException {   
          if (origem.isDirectory() || destino.isDirectory()) {   
             throw new IllegalArgumentException("Tanto a origem quanto o destino precisam ser arquivos!");   
          }   

          InputStream entrada = new FileInputStream(origem);   
          OutputStream saida = new FileOutputStream(destino);   

          int maximo = buffer.length;   
          int lidos = -1;   
          while ((lidos = entrada.read(buffer, 0, maximo)) != -1) {   
             saida.write(buffer, 0, lidos);   
          }   
          saida.flush();   
          entrada.close();   
          saida.close();   
       }   
    
   public void copiaDiretorio(File origem, File destino) throws IOException {   
          copiaDiretorio(origem, destino, null);   
       }   

   public void copiaDiretorio(File origem, File destino, FileFilter filtro)   
             throws IOException {   
          if (origem.isFile()) {   
             throw new IllegalArgumentException("A origem precisa ser um diretório!");   
          }   
          if (destino.exists() && destino.isFile()) {   
             throw new IllegalArgumentException("O destino precisa ser um diretório!");   
          }   
          destino.mkdirs();   
          File[] filhos = origem.listFiles(filtro);   
          File atual = null;   
          int quantidade = filhos.length;   
          for (int i = 0; i < quantidade; i++) {   
             atual = filhos[i];   
             if (atual.isDirectory()) {   
                copiaDiretorio(atual, new File(destino, atual.getName()), filtro);   
             } else {   
                copiaArquivo(atual, new File(destino, atual.getName()));   
             }   
          }   
       }   
}  