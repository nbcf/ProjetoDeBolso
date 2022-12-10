/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodebolso;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Nildo
 */
public class escritaDadosC3pO {
    
    public static void SalvaConfC3po
                        (
                        String parC3p0_max_size,
                        String parC3p0_min_size,
                        String parC3p0_timeout,
                        String parC3p0_max_statements,
                        String parC3p0_idle_test_period,
                        String parC3p0_acquire_increment      
                        )
                        {
//  int opcao;
//    Object[] botoes = {" SIM "," NÃO "};
//    opcao = JOptionPane.showOptionDialog(
//       null, 
//       "O Programa será fechado, para aplicar novas configurações", 
//       "AVISO DO SISTEMA", 
//       JOptionPane.YES_NO_OPTION, 
//       JOptionPane.QUESTION_MESSAGE,
//       null,
//       botoes,
//       botoes[0]);
//
//    if (opcao ==  JOptionPane.YES_OPTION) 
//    {

File fileC3p0_max_size          =   new File ("./dist/c3p0_max_size.nbx");
File filC3p0_min_size           =   new File ("./dist/c3p0_min_size.nbx");
File filC3p0_timeout            =   new File ("./dist/c3p0_timeout.nbx");
File filC3p0_max_statements     =   new File ("./dist/c3p0_max_statements.nbx");
File filC3p0_idle_test_period   =   new File ("./dist/c3p0_idle_test_period.nbx");
File filC3p0_acquire_increment  =   new File ("./dist/c3p0_acquire_increment.nbx");

  FileOutputStream fluxInc3p0_max_size          = null;
  FileOutputStream fluxInc3p0_min_size          = null;
  FileOutputStream fluxInc3p0_timeout           = null;
  FileOutputStream fluxInc3p0_max_statements    = null;
  FileOutputStream fluxInc3p0_idle_test_period  = null;
  FileOutputStream fluxInc3p0_acquire_increment = null;

  ObjectOutputStream fluxOutc3p0_max_size            = null;
  ObjectOutputStream fluxOutc3p0_min_size            = null;
  ObjectOutputStream fluxOutc3p0_timeout             = null;
  ObjectOutputStream fluxOutc3p0_max_statements      = null;
  ObjectOutputStream fluxOutc3p0_idle_test_period    = null;
  ObjectOutputStream fluxOutc3p0_acquire_increment   = null;

  Object c3po1 = (Object)  parC3p0_max_size;
  Object c3po2 = (Object)  parC3p0_min_size;
  Object c3po3 = (Object)  parC3p0_timeout;
  Object c3po4 = (Object)  parC3p0_max_statements;
  Object c3po5 = (Object)  parC3p0_idle_test_period;
  Object c3po6 = (Object)  parC3p0_acquire_increment;

       try
       {
   fluxInc3p0_max_size          =   new FileOutputStream(fileC3p0_max_size);
   fluxInc3p0_min_size          =   new FileOutputStream(filC3p0_min_size);
   fluxInc3p0_timeout           =   new FileOutputStream(filC3p0_timeout);
   fluxInc3p0_max_statements    =   new FileOutputStream(filC3p0_max_statements);
   fluxInc3p0_idle_test_period  =   new FileOutputStream(filC3p0_idle_test_period);
   fluxInc3p0_acquire_increment =   new FileOutputStream(filC3p0_acquire_increment);

   fluxOutc3p0_max_size         = new ObjectOutputStream(fluxInc3p0_max_size); 
   fluxOutc3p0_min_size         = new ObjectOutputStream(fluxInc3p0_min_size);
   fluxOutc3p0_timeout          = new ObjectOutputStream(fluxInc3p0_timeout);
   fluxOutc3p0_max_statements   = new ObjectOutputStream(fluxInc3p0_max_statements);
   fluxOutc3p0_idle_test_period = new ObjectOutputStream(fluxInc3p0_idle_test_period);
   fluxOutc3p0_acquire_increment= new ObjectOutputStream(fluxInc3p0_acquire_increment);

   fluxOutc3p0_max_size.writeObject(c3po1);
   fluxOutc3p0_min_size.writeObject(c3po2);
   fluxOutc3p0_timeout.writeObject(c3po3);
   fluxOutc3p0_max_statements.writeObject(c3po4);
   fluxOutc3p0_idle_test_period.writeObject(c3po5);
   fluxOutc3p0_acquire_increment.writeObject(c3po6);

   fluxOutc3p0_max_size.close();
   fluxOutc3p0_min_size.close();
   fluxOutc3p0_timeout.close();
   fluxOutc3p0_max_statements.close();
   fluxOutc3p0_idle_test_period.close();
   fluxOutc3p0_acquire_increment.close();
       }
       catch(Exception e)
       {  
 
       }    
    }
  }   
    

