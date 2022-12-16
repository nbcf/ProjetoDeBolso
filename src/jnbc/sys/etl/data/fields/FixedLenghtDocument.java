/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jnbc.sys.etl.data.fields;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
*
* @author Paulo Alonso
*/
public class FixedLenghtDocument extends DocumentFilter {
    private int iMaxLength;

    public FixedLenghtDocument(int maxlen) {
        super();
        iMaxLength = maxlen;
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) return;

        // aceitara qualquer número de caracteres
        if (iMaxLength <= 0) {
            fb.insertString(offset, str, attr);
            return;
        }

        int ilen = (fb.getDocument().getLength() + str.length());

        // se o comprimento final for menor, aceita str
        if (ilen <= iMaxLength) {
            fb.insertString(offset, str, attr);
        } else {
            // se o comprimento for igual ao máximo, não faz nada
            if (fb.getDocument().getLength() == iMaxLength) return;

            // se ainda resta espaço na String, pega os caracteres aceitos
            String newStr = str.substring(0, (iMaxLength - fb.getDocument().getLength()));

            fb.insertString(offset, newStr, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) return;

        // aceitara qualquer número de caracteres
        if (iMaxLength <= 0) {
            fb.insertString(offset, str, attr);
            return;
        }

        int ilen = (fb.getDocument().getLength() + str.length());

        // se o comprimento final for menor, aceita str
        if (ilen <= iMaxLength) {
            fb.insertString(offset, str, attr);
        } else {
            // se o comprimento for igual ao máximo, não faz nada
            if (fb.getDocument().getLength() == iMaxLength) return;

            // se ainda resta espaço na String, pega os caracteres aceitos
            String newStr = str.substring(0, (iMaxLength - fb.getDocument().getLength()));

            fb.insertString(offset, newStr, attr);
        }
    }
}