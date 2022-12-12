 /**
 *
 * @author NILDO BUENO CORREIA FILHO 
 * NB- DESENVOLVIMENTO DE SISTEMAS
 * EMAIL: nildojava@gmail.com    
 *        nildin82@hotmail.com
 * CEL: 8115-7490
 * Created on 25/10/2011, 16:05:57
 */
package br.com.exl.util;

import java.io.File;
import java.io.FileFilter;

public class FilterCopiador {
    
    
          public static void CopiaArquivosbyNildo(String pasta_origem, String pasta_destino){
         
              
          try {     
         File origem = new File(pasta_origem);    
         File destino = new File(pasta_destino);   
         FileFilter filtro = new FileFilter() {   
  
            public boolean accept(File arquivo) {   
               if (arquivo.isDirectory()) {   
                  return true;   
               }   
               return arquivo.getName().toUpperCase().endsWith(".TXT") || arquivo.getName().toUpperCase().endsWith(".XML") || arquivo.getName().toUpperCase().endsWith(".CSV") || arquivo.getName().toUpperCase().endsWith(".SQL") || 
                       arquivo.getName().toUpperCase().endsWith(".JPG") || arquivo.getName().toUpperCase().endsWith(".PNG") || arquivo.getName().toUpperCase().endsWith(".BAT") || arquivo.getName().toUpperCase().endsWith(".EXE") ||
                       arquivo.getName().toUpperCase().endsWith(".DOC") || arquivo.getName().toUpperCase().endsWith(".RTF") ||
                       arquivo.getName().toUpperCase().endsWith(".PDF") || arquivo.getName().toUpperCase().endsWith(".XLS") || arquivo.getName().toUpperCase().endsWith(".CLASS") || arquivo.getName().toUpperCase().endsWith(".DWG") ||
                        arquivo.getName().toUpperCase().endsWith(".NRG") || arquivo.getName().toUpperCase().endsWith(".OCX") || arquivo.getName().toUpperCase().endsWith(".LSX") || arquivo.getName().toUpperCase().endsWith(".PPT") ||
                        arquivo.getName().toUpperCase().endsWith(".SWF") || arquivo.getName().toUpperCase().endsWith(".PTX") || arquivo.getName().toUpperCase().endsWith(".MDB") || arquivo.getName().toUpperCase().endsWith(".DBX") ||
                        arquivo.getName().toUpperCase().endsWith(".BMP") || arquivo.getName().toUpperCase().endsWith(".RM")  || arquivo.getName().toUpperCase().endsWith(".GIF") || arquivo.getName().toUpperCase().endsWith(".JRXML") || 
                        arquivo.getName().toUpperCase().endsWith(".MP3") || arquivo.getName().toUpperCase().endsWith(".AVI") || arquivo.getName().toUpperCase().endsWith(".QXD") || arquivo.getName().toUpperCase().endsWith(".WAV") ||
                        arquivo.getName().toUpperCase().endsWith(".VOB") || arquivo.getName().toUpperCase().endsWith(".MPG") || arquivo.getName().toUpperCase().endsWith(".ICO") || arquivo.getName().toUpperCase().endsWith(".PMG") ||
                        arquivo.getName().toUpperCase().endsWith(".NBX") || arquivo.getName().toUpperCase().endsWith(".RPM") || arquivo.getName().toUpperCase().endsWith(".HTM") || arquivo.getName().toUpperCase().endsWith(".HTML") ||
                        arquivo.getName().toUpperCase().endsWith(".MOV") || arquivo.getName().toUpperCase().endsWith(".MVB") || arquivo.getName().toUpperCase().endsWith(".JAVA") || arquivo.getName().toUpperCase().endsWith(".DBC") || 
                        arquivo.getName().toUpperCase().endsWith(".ASS") || arquivo.getName().toUpperCase().endsWith(".ISO") || arquivo.getName().toUpperCase().endsWith(".JAR") || arquivo.getName().toUpperCase().endsWith(".PER") ||
                        arquivo.getName().toUpperCase().endsWith(".MF")  || arquivo.getName().toUpperCase().endsWith(".XLSX")|| arquivo.getName().toUpperCase().endsWith(".AL8") || arquivo.getName().toUpperCase().endsWith(".DXF")||
                        arquivo.getName().toUpperCase().endsWith(".DAT") || arquivo.getName().toUpperCase().endsWith(".BAK") || arquivo.getName().toUpperCase().endsWith(".ASF") || arquivo.getName().toUpperCase().endsWith(".JSP")|| 
                        arquivo.getName().toUpperCase().endsWith(".EPS") || arquivo.getName().toUpperCase().endsWith(".PPTX")|| arquivo.getName().toUpperCase().endsWith(".MDBX") || arquivo.getName().toUpperCase().endsWith(".BIN") || 
                        arquivo.getName().toUpperCase().endsWith(".DOCX")|| arquivo.getName().toUpperCase().endsWith(".ORM") || arquivo.getName().toUpperCase().endsWith(".JS")  || arquivo.getName().toUpperCase().endsWith(".DLL") || 
                        arquivo.getName().toUpperCase().endsWith(".FLA") || arquivo.getName().toUpperCase().endsWith(".MID") || arquivo.getName().toUpperCase().endsWith(".MAX") || arquivo.getName().toUpperCase().endsWith(".CGI") || 
                        arquivo.getName().toUpperCase().endsWith(".LOG") || arquivo.getName().toUpperCase().endsWith(".PIC") || arquivo.getName().toUpperCase().endsWith(".OLE") || arquivo.getName().toUpperCase().endsWith(".OGG") ||
                        arquivo.getName().toUpperCase().endsWith(".RAR") || arquivo.getName().toUpperCase().endsWith(".TIF") || arquivo.getName().toUpperCase().endsWith(".TTF") || arquivo.getName().toUpperCase().endsWith(".WRI") ||
                        arquivo.getName().toUpperCase().endsWith(".JAVA")|| arquivo.getName().toUpperCase().endsWith(".JS")||  arquivo.getName().toUpperCase().endsWith(".JSP") ||  arquivo.getName().toUpperCase().endsWith(".KIX") ||  arquivo.getName().toUpperCase().endsWith(".LSP") || 
                        arquivo.getName().toUpperCase().endsWith(".LISP")|| arquivo.getName().toUpperCase().endsWith(".LUA") ||  arquivo.getName().toUpperCase().endsWith(".MAK") ||  arquivo.getName().toUpperCase().endsWith(".M") ||  arquivo.getName().toUpperCase().endsWith(".NFO") || 
                        arquivo.getName().toUpperCase().endsWith(".NSI") || arquivo.getName().toUpperCase().endsWith(".NSH  ") || arquivo.getName().toUpperCase().endsWith(".PAS  ") || arquivo.getName().toUpperCase().endsWith(".INC") || arquivo.getName().toUpperCase().endsWith(".PL")||
                        arquivo.getName().toUpperCase().endsWith(".PM")  || arquivo.getName().toUpperCase().endsWith(".PLX") || arquivo.getName().toUpperCase().endsWith(".PHP") || arquivo.getName().toUpperCase().endsWith(".PHP3") || arquivo.getName().toUpperCase().endsWith(".PHTML") ||
                        arquivo.getName().toUpperCase().endsWith(".PS")  || arquivo.getName().toUpperCase().endsWith(".PS1") || arquivo.getName().toUpperCase().endsWith(".PROPERTIES") || arquivo.getName().toUpperCase().endsWith(".PY") || arquivo.getName().toUpperCase().endsWith(".PYW ") ||
                        arquivo.getName().toUpperCase().endsWith(".R")   || arquivo.getName().toUpperCase().endsWith(".RC") ||  arquivo.getName().toUpperCase().endsWith(".RB") || arquivo.getName().toUpperCase().endsWith(".RBW") || arquivo.getName().toUpperCase().endsWith(".SCM") ||
                        arquivo.getName().toUpperCase().endsWith(".SCMD")|| arquivo.getName().toUpperCase().endsWith(".SS") ||  arquivo.getName().toUpperCase().endsWith(".SD") || arquivo.getName().toUpperCase().endsWith(".TCL") || arquivo.getName().toUpperCase().endsWith(".TEX") || 
                        arquivo.getName().toUpperCase().endsWith(".VB")  || arquivo.getName().toUpperCase().endsWith("_BUILD") ||  arquivo.getName().toUpperCase().endsWith(".VBSX") || arquivo.getName().toUpperCase().endsWith(".V") || arquivo.getName().toUpperCase().endsWith(".VHD ") ||
                        arquivo.getName().toUpperCase().endsWith(".VHDL")|| arquivo.getName().toUpperCase().endsWith(".XSML") ||  arquivo.getName().toUpperCase().endsWith(".XSL") || arquivo.getName().toUpperCase().endsWith(".XSD") || arquivo.getName().toUpperCase().endsWith(".KML") ||
                        arquivo.getName().toUpperCase().endsWith(".WSDL")|| arquivo.getName().toUpperCase().endsWith(".YML") ||  arquivo.getName().toUpperCase().endsWith(".AS") || arquivo.getName().toUpperCase().endsWith(".MX") || arquivo.getName().toUpperCase().endsWith(".ADA") ||
                        arquivo.getName().toUpperCase().endsWith(".ADS") || arquivo.getName().toUpperCase().endsWith(".ADB") ||  arquivo.getName().toUpperCase().endsWith(".ASM") || arquivo.getName().toUpperCase().endsWith(".ASP") || arquivo.getName().toUpperCase().endsWith(".ASPX") ||
                        arquivo.getName().toUpperCase().endsWith(".AU3") || arquivo.getName().toUpperCase().endsWith(".SH") ||  arquivo.getName().toUpperCase().endsWith(".BSH") || arquivo.getName().toUpperCase().endsWith(".CMD") || arquivo.getName().toUpperCase().endsWith(".NT") ||
                        arquivo.getName().toUpperCase().endsWith(".C")   || arquivo.getName().toUpperCase().endsWith(".ML") ||  arquivo.getName().toUpperCase().endsWith(".MLI") || arquivo.getName().toUpperCase().endsWith(".SML") || arquivo.getName().toUpperCase().endsWith(".THY") ||
                        arquivo.getName().toUpperCase().endsWith(".CMAKE") ||  arquivo.getName().toUpperCase().endsWith(".CBL") ||  arquivo.getName().toUpperCase().endsWith(".CBD") || arquivo.getName().toUpperCase().endsWith(".CDB") || arquivo.getName().toUpperCase().endsWith(".CDC") ||
                        arquivo.getName().toUpperCase().endsWith(".COB") ||  arquivo.getName().toUpperCase().endsWith(".H") ||  arquivo.getName().toUpperCase().endsWith(".HPP") || arquivo.getName().toUpperCase().endsWith(".HXX") || arquivo.getName().toUpperCase().endsWith(".CPP") ||
                        arquivo.getName().toUpperCase().endsWith(".CXX") ||  arquivo.getName().toUpperCase().endsWith(".CC") ||  arquivo.getName().toUpperCase().endsWith(".CS") || arquivo.getName().toUpperCase().endsWith(".CSS") || arquivo.getName().toUpperCase().endsWith(".D") ||
                        arquivo.getName().toUpperCase().endsWith(".DIFF ") ||  arquivo.getName().toUpperCase().endsWith(".PACTH") ||  arquivo.getName().toUpperCase().endsWith(".F") || arquivo.getName().toUpperCase().endsWith(".FOR") || arquivo.getName().toUpperCase().endsWith(".F90") ||
                        arquivo.getName().toUpperCase().endsWith(".F95") ||  arquivo.getName().toUpperCase().endsWith(".F2K") ||  arquivo.getName().toUpperCase().endsWith(".HS") || arquivo.getName().toUpperCase().endsWith(".LHS") || arquivo.getName().toUpperCase().endsWith(".AS") ||
                        arquivo.getName().toUpperCase().endsWith(".LAS") ||  arquivo.getName().toUpperCase().endsWith(".SHTML") ||  arquivo.getName().toUpperCase().endsWith(".SHTM") || arquivo.getName().toUpperCase().endsWith(".XHTML") || arquivo.getName().toUpperCase().endsWith(".INF") ||
                        arquivo.getName().toUpperCase().endsWith(".REG") ||  arquivo.getName().toUpperCase().endsWith(".URL") ||  arquivo.getName().toUpperCase().endsWith(".ISS") || arquivo.getName().toUpperCase().endsWith(".EMF") || arquivo.getName().toUpperCase().endsWith(".WMF") ||
                        arquivo.getName().toUpperCase().endsWith(".BMP") ||  arquivo.getName().toUpperCase().endsWith(".DIB") ||  arquivo.getName().toUpperCase().endsWith(".RLE") || arquivo.getName().toUpperCase().endsWith(".CGM") || arquivo.getName().toUpperCase().endsWith(".PCT") ||
                        arquivo.getName().toUpperCase().endsWith(".TIF") ||  arquivo.getName().toUpperCase().endsWith(".VML") ||  arquivo.getName().toUpperCase().endsWith(".AVI") || arquivo.getName().toUpperCase().endsWith(".ASF") || arquivo.getName().toUpperCase().endsWith(".ASX") ||
                        arquivo.getName().toUpperCase().endsWith(".MI") ||  arquivo.getName().toUpperCase().endsWith(".WMA") ||  arquivo.getName().toUpperCase().endsWith(".WAX") || arquivo.getName().toUpperCase().endsWith(".WAV") ||arquivo.getName().toUpperCase().endsWith(".ODT") ||
                        arquivo.getName().toUpperCase().endsWith(".ODS") ||  arquivo.getName().toUpperCase().endsWith(".ODP") ||  arquivo.getName().toUpperCase().endsWith(".ODB") || arquivo.getName().toUpperCase().endsWith(".ODD")  ||  arquivo.getName().toUpperCase().endsWith(".JC") ||
                        arquivo.getName().toUpperCase().endsWith(".INI") || arquivo.getName().toUpperCase().endsWith(".MDF") || arquivo.getName().toUpperCase().endsWith(".MDS") || arquivo.getName().toUpperCase().endsWith(".FORM")  || arquivo.getName().toUpperCase().endsWith(".JCCFG3") ||
                        arquivo.getName().toUpperCase().endsWith(".TIME") || arquivo.getName().toUpperCase().endsWith(".CONF") ||  arquivo.getName().toUpperCase().endsWith(".WAB") || arquivo.getName().toUpperCase().endsWith(".MF")  || arquivo.getName().toUpperCase().endsWith(".ZIP") ;
               
            }   
         };    
         Copiador copiador = new Copiador(4096);   
         copiador.copiaDiretorio(origem, destino, filtro);  
         
      } catch (Throwable t) {   
         t.printStackTrace();   
      }         
 }
    
}
