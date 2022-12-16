/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jnbc.sys.etl.data.fields;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter.FilterBypass;
import javax.swing.text.PlainDocument;

public class IeValidator extends FixedLenghtDocument {

    public IeValidator(int maxLenght) {
        super(maxLenght);
    }  

    @Override
    public void insertString(FilterBypass fb, int offset, String str, AttributeSet attr) throws BadLocationException {
        char c;
        byte n = 1;

        // percorre a string
        for (byte i=0;i<str.length();i++){

            // armazena o caracter
            c = str.charAt(i);

            // se não for número ou ponto
            if(!Character.isDigit(c) & c != '.')
                    n = 0;
        }

        // se n não for igual a zero, todos os caracteres são numéricos
        if(n != 0)
            super.insertString(fb, offset, str, attr);
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String str, AttributeSet attr) throws BadLocationException {
        char c;
        byte n = 1;

        // percorre a string
        for (byte i=0;i<str.length();i++){

            // armazena o caracter
            c = str.charAt(i);

            // se não for número ou ponto
            if(!Character.isDigit(c) & c != '.')
                    n = 0;
        }

        // se n não for igual a zero, todos os caracteres são numéricos
        if(n != 0)
            super.insertString(fb, offset, str, attr);
    }
}