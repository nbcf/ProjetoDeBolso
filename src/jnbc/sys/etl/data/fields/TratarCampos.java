
package nildo.infra.engine.campos;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
 /**
* @author NILDO BUENO CORREIA FILHO 
 * CPF: 10333054725
 * EMAIL: nil_bueno@hotmail.com    
 * JAVA VERSION - 14
 * NETBEANS     - 12
 * 
 * Created on 24/12/2021, 03:20:27
 */
public class TratarCampos {
    
        public  void limparSelecaoButtonGroup(ButtonGroup nomeGrupo){
            nomeGrupo.clearSelection();
            }
        
        public  void limparNullIdJtextField(JTextField id){
                id.setText("");
                id.setText(null);
                id.setEnabled(false);
            }

        
        
        public  void hailitaCampos(Container container){
           for(Component component : container.getComponents()) {
            if((component instanceof JTextField) ||
                    (component instanceof JFormattedTextField)) {
                ((JTextComponent)component).setEditable(true);
            }
           }
        }

        public  void desailitaCampos(Container container){
           for(Component component : container.getComponents()) {
            if((component instanceof JTextField) ||
                    (component instanceof JFormattedTextField)) {
                ((JTextComponent)component).setEditable(false);
            }
           }
        }
      
        public  void limparNullJtextField(Container container){
           for(Component component : container.getComponents()) {
            if((component instanceof JTextField) ||
                    (component instanceof JFormattedTextField)) {
                ((JTextComponent)component).setText(null);
            }
           }
        }
        public  void limparStringVaziaJtextField(Container container){
           for(Component component : container.getComponents()) {
            if((component instanceof JTextField) ||
                    (component instanceof JFormattedTextField)) {
                ((JTextComponent)component).setText("");
            }
           }
        }
 
        public void desabilitaEdicaoJTextField(Container container){
           for(Component component : container.getComponents()) {
            if((component instanceof JTextField) ||
                    (component instanceof JFormattedTextField)) {
                ((JTextComponent)component).setEditable(false);
            }
           }
        }
          public  void hailitaEdicaoJTextField(Container container){
           for(Component component : container.getComponents()) {
            if((component instanceof JTextField) ||
                    (component instanceof JFormattedTextField)) {
                ((JTextComponent)component).setEditable(true);
            }
           }
        }
 
        public  void setarNullJDateChoseJcalendar(Container container){
           for(Component component : container.getComponents()) {
            if((component instanceof JDateChooser)) {
                ((JDateChooser)component).setDate(null);
            }
           }
        }
        
        public  void desabilitarJDateChoseJcalendar(Container container){
               for(Component component : container.getComponents()) {
                if((component instanceof JDateChooser)) {
                    ((JDateChooser)component).setEnabled(false);
                }
               }
            }

        public  void hailitaCampoJDateChoseJcalendar(Container container){
               for(Component component : container.getComponents()) {
                if((component instanceof JDateChooser)) {
                    ((JDateChooser)component).setEnabled(true);
                }
               }
            }


        public  void selecaoJRadioButtonFalse(Container container){
               for(Component component : container.getComponents()) {              
                if((component instanceof JRadioButton)) {
                    ((JRadioButton)component).setSelected(false);
 
                }
               }
            }
   }


