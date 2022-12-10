/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZipUtil;

import java.io.FileOutputStream;
import java.io.*;   
import java.util.*;   
import java.util.zip.*;   
/**
 *
 * @author nil_b
 */
public class ZipUtilitario {

   public static void CompactaArquivosByNildo(final File objeto_entrada, final File diretorio_saida) throws IOException {   
      if (!objeto_entrada.exists()) {   
         throw new IOException(objeto_entrada.getName() + " nexiste!");   
      }   
      if (diretorio_saida.exists()) {   
         if (diretorio_saida.isDirectory()) {   
            throw new IllegalArgumentException("\"" + diretorio_saida.getAbsolutePath() + "\" NUM ARQUIVO!");   
         }   
      } else {   
         final File parent = diretorio_saida.getParentFile();   
         if (parent != null) {   
            parent.mkdirs();   
         }   
         diretorio_saida.createNewFile();   
      }   
      final ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(diretorio_saida));   
      zip.setLevel(Deflater.BEST_COMPRESSION);   
      compress("", objeto_entrada, zip);   
      zip.finish();   
      zip.flush();   
      zip.close();   
   }   

   public static void extract(final File input, final File output) throws IOException {   
      if (input.exists()) {   
         if (input.isDirectory()) {   
            throw new IllegalArgumentException("\"" + input.getAbsolutePath() + "\" num arquivo!");   
         }   
      } else {   
         throw new IllegalArgumentException("\"" + input.getAbsolutePath() + "\" nao existe!");   
      }   
      if (output.exists()) {   
         if (output.isFile()) {   
            throw new IllegalArgumentException("\"" + output.getAbsolutePath() + "\" nenhum diretorio");   
         }   
      }   
      final ZipFile zip = new ZipFile(input);   
      extract(zip, output);   
      zip.close();   
   }   
     
   private static void compress(final String caminho,   
                                final File arquivo,   
                                final ZipOutputStream saida) throws IOException {   
      final boolean dir = arquivo.isDirectory();   
      final String nome = arquivo.getName();   
      final ZipEntry elemento = new ZipEntry(caminho + '/' + nome + (dir   
              ? "/"  
              : ""));   
      elemento.setSize(arquivo.length());   
      elemento.setTime(arquivo.lastModified());   
      saida.putNextEntry(elemento);   
      if (dir) {   
         final File[] arquivos = arquivo.listFiles();   
         for (int i = 0; i < arquivos.length; i++) {   
            // recursivamente adiciona outro arquivo ao ZIP   
            compress(caminho + '/' + nome, arquivos[i], saida);   
         }   
      } else {   
         final FileInputStream entrada = new FileInputStream(arquivo);   
         copy(entrada, saida);   
         entrada.close();   
      }   
   }   
  
   // Copia o contedo stream de entrada para o stream de sa  
   private static void copy(final InputStream in, final OutputStream out) throws IOException {   
      final int n = 4096;   
      final byte[] b = new byte[n];   
      for (int r = -1; (r = in.read(b, 0, n)) != -1; out.write(b, 0, r)) {}   
      out.flush();   
   }   
  
   // Retira determinado elemento do arquivo ZIP   
   private static void extract(final ZipFile zip, final File pasta) throws IOException {   
      InputStream entrada = null;   
      OutputStream saida = null;   
      String nome = null;   
      File arquivo = null;   
      ZipEntry elemento = null;   
      final Enumeration<?> elementos = zip.entries();   
      while (elementos.hasMoreElements()) {   
         elemento = (ZipEntry) elementos.nextElement();   
         nome = elemento.getName();   
         nome = nome.replace('/', File.separatorChar);   
         nome = nome.replace('\\', File.separatorChar);   
         arquivo = new File(pasta, nome);   
         if (elemento.isDirectory()) {   
            arquivo.mkdirs();   
         } else {   
            if (!arquivo.exists()) {   
               final File parent = arquivo.getParentFile();   
               if (parent != null) {   
                  parent.mkdirs();   
               }   
               arquivo.createNewFile();   
            }   
            saida = new FileOutputStream(arquivo);   
            entrada = zip.getInputStream(elemento);   
            copy(entrada, saida);   
            saida.flush();   
            saida.close();   
            entrada.close();   
         }   
         arquivo.setLastModified(elemento.getTime());   
      }   
   }   
    
   private ZipUtilitario() {}   
   
}
