/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jnbc.sys.etl.excelread;


import jnbc.sys.etl.data.ETLEntradaDados;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 /**
* @author NILDO BUENO CORREIA FILHO 
 * CPF: 10333054725
 * EMAIL: nil_bueno@hotmail.com    
 * JAVA VERSION - 14
 * NETBEANS     - 12
 * 
 * Created on 24/12/2021, 03:20:27
 */
public class ImportarExcelParaJtable<N> {
public int valorJProgressBar = 0;
public String nomeDados;
public String localArquivo;
public ArrayList<N> dadosCarregados = new ArrayList();
  ETLEntradaDados etl = new ETLEntradaDados();
    public ImportarExcelParaJtable importExcelToJtableJava( 
            String dirPadrao,
            FileNameExtensionFilter objetoFileNameExtensionFilter, 
            String tituloJFileChooser) 
            throws InterruptedException {
    
        File                    excelFile;
        FileInputStream         excelFIS            = null;
        BufferedInputStream     excelBIS            = null;
        XSSFWorkbook            excelImportToJTable = null;
        String defaultCurrentDirectoryPath          = dirPadrao;
        
        JFileChooser excelFileChooser = 
        new JFileChooser(defaultCurrentDirectoryPath);
        excelFileChooser.setDialogTitle(tituloJFileChooser);
        FileNameExtensionFilter filtoDeNomesDeExtensaoDeArquivos = objetoFileNameExtensionFilter;
        excelFileChooser.setFileFilter(filtoDeNomesDeExtensaoDeArquivos);
        int excelChooser = excelFileChooser.showOpenDialog(null);
        localArquivo = excelFileChooser.getSelectedFile().getPath();
    
            try {
                excelFile = excelFileChooser.getSelectedFile();
                excelFIS = new FileInputStream(excelFile);
                excelBIS = new BufferedInputStream(excelFIS);
                excelImportToJTable = new XSSFWorkbook(excelBIS);
                XSSFSheet excelSheet = excelImportToJTable.getSheetAt(0);
                    for (int row = 0; row <= excelSheet.getLastRowNum(); row++) 
                    {      
                    XSSFRow excelRow = excelSheet.getRow(row);
                    XSSFCell excelName = excelRow.getCell(0);
                    nomeDados = excelName.toString();
                      String str = etl.RemoverEspacosEmBrancoStringSubistituirVazio(nomeDados);
                    if(nomeDados.isEmpty() || str.equals("") || nomeDados == null){
                            }else{
                            dadosCarregados.add((N) nomeDados);
                    }
                    
                    }     
                } catch (IOException iOException) {
                     JOptionPane.showMessageDialog(null,"Erro ao fazer a leitura da planilha de dados");
                        } finally {
                            try{
                                if (excelFIS != null) {
                                    excelFIS.close();
                                }
                                if (excelBIS != null) {
                                    excelBIS.close();
                                }
                                if (excelImportToJTable != null) {
                                    excelImportToJTable.close();
                                }
                            } catch (IOException iOException) {
                                        JOptionPane.showMessageDialog(null, 
                                        iOException.getMessage());
                            }
                        }
            return this;
        }

    }  