/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jnbc.sys.control.fontsize;

import javax.swing.JTable;

/**
 *
 * @author nil_b
 */
public class ControleTamanhoFonte {
    public static Integer retornoposicao = 0 ;
       public ControleTamanhoFonte aumentarFonte(JTable jTableDadosModel, JTable jTableDadosPesquisa, Integer posicaoTamanhoFonte){
        retornoposicao = posicaoTamanhoFonte;
           if(posicaoTamanhoFonte == 1 ){
     
      retornoposicao ++;

      jTableDadosModel.setFont(new java.awt.Font( "Tahoma", 0,  14 )); // NOI18N  
      jTableDadosModel.setRowHeight(16);
      jTableDadosPesquisa.setFont(new java.awt.Font( "Tahoma", 0,  14 )); // NOI18N  
      jTableDadosPesquisa.setRowHeight(16);

        }
      else if(posicaoTamanhoFonte == 2 ){
       retornoposicao++;
      jTableDadosModel.setFont(new java.awt.Font( "Tahoma", 0,  16 )); 
      jTableDadosModel.setRowHeight(18);
      jTableDadosPesquisa.setFont(new java.awt.Font( "Tahoma", 0,  16 ));  
      jTableDadosPesquisa.setRowHeight(18);
        }
      else if (posicaoTamanhoFonte ==3 ){
       retornoposicao ++;
      jTableDadosModel.setFont(new java.awt.Font( "Tahoma", 0,  18 ));  
      jTableDadosModel.setRowHeight(24);      
      jTableDadosPesquisa.setFont(new java.awt.Font( "Tahoma", 0,  18 ));  
      jTableDadosPesquisa.setRowHeight(24);
        }
      else if (posicaoTamanhoFonte ==4 ){
      jTableDadosModel.setFont(new java.awt.Font( "Tahoma", 0,  24 ));  
      jTableDadosModel.setRowHeight(30);
      jTableDadosPesquisa.setFont(new java.awt.Font( "Tahoma", 0,  24 )); 
      jTableDadosPesquisa.setRowHeight(30);
     
        }
            return this;
    }

    public ControleTamanhoFonte reduzirFonte(JTable jTableDadosModel, JTable jTableDadosPesquisa, Integer posicaoTamanhoFonte){
        if(posicaoTamanhoFonte == 1 ){
            jTableDadosModel.setFont(new java.awt.Font( "Tahoma", 0,  12 )); 
            jTableDadosModel.setRowHeight(16);
            jTableDadosPesquisa.setFont(new java.awt.Font( "Tahoma", 0,  12 ));  
            jTableDadosPesquisa.setRowHeight(16);
        }
        else if(posicaoTamanhoFonte == 2 ){
         retornoposicao  --;
            jTableDadosModel.setFont(new java.awt.Font( "Tahoma", 0,  14 )); 
            jTableDadosModel.setRowHeight(16);
            jTableDadosPesquisa.setFont(new java.awt.Font( "Tahoma", 0,  14 ));  
            jTableDadosPesquisa.setRowHeight(16);
        }
        else if (posicaoTamanhoFonte == 3){
         retornoposicao --;
            jTableDadosModel.setFont(new java.awt.Font( "Tahoma", 0,  16 ));   
            jTableDadosModel.setRowHeight(18);
            jTableDadosPesquisa.setFont(new java.awt.Font( "Tahoma", 0,  16 ));  
            jTableDadosPesquisa.setRowHeight(18);
        }
        else if (posicaoTamanhoFonte == 4){
          retornoposicao--;
            jTableDadosModel.setFont(new java.awt.Font( "Tahoma", 0,  18 )); // NOI18N  
            jTableDadosModel.setRowHeight(24);
            jTableDadosPesquisa.setFont(new java.awt.Font( "Tahoma", 0,  18 )); // NOI18N  
            jTableDadosPesquisa.setRowHeight(24);
        }
        return this;
    }

}
