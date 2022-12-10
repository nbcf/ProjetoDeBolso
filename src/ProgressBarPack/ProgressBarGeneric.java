/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgressBarPack;

import javax.swing.JProgressBar;

/**
 *
 * @author nil_b
 */
public class ProgressBarGeneric {
String item = "";

    public String RunProgress(
            JProgressBar jProgressBar,
            int minimoValorExclusao,
            int maximoValorExclusao,
            int valorEntradaExclusao,
            String valorNomeEntradaExclusao){
                int acumuladorExclusao = 1;
                acumuladorExclusao = acumuladorExclusao + valorEntradaExclusao;
               
                 jProgressBar.setStringPainted(true);
                 jProgressBar.setMinimum(minimoValorExclusao);
                 jProgressBar.setMaximum(maximoValorExclusao);
                 jProgressBar.setValue(acumuladorExclusao);
             item = valorNomeEntradaExclusao;
                 if(acumuladorExclusao == jProgressBar.getMaximum()){
                  acumuladorExclusao = 1;
                 } 
              return item;
    }
}
