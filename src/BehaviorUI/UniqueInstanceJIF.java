package BehaviorUI;

import java.beans.PropertyVetoException;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
 /**
* @author NILDO BUENO CORREIA FILHO 
 * CPF: 10333054725
 * EMAIL: nil_bueno@hotmail.com    
 * JAVA VERSION - 14
 * NETBEANS     - 12
 * 
 * Created on 25/12/2021, 03:20:27
 */
public class UniqueInstanceJIF{
    
    private static JDesktopPane jdesktopPane;
    
    public UniqueInstanceJIF(JDesktopPane jdesktopPane){
    UniqueInstanceJIF.jdesktopPane = jdesktopPane;
    
    }

    public void callJInternalFrame(JInternalFrame jInternalFrame, Boolean maximizado, String titulo){
    if(jInternalFrame.isVisible()){
    jInternalFrame.toFront();
    jInternalFrame.requestFocus();
     JOptionPane.showMessageDialog(jInternalFrame,"Janela "+jInternalFrame.getTitle().toString()+" já se encotra aberta","Aviso do Sistema",JOptionPane.OK_OPTION);
    }else{
    jdesktopPane.add(jInternalFrame);
    
           int distanciamento = 25;
        int jdi =  jdesktopPane.getAllFrames().length;
        for (JInternalFrame jif :  jdesktopPane.getAllFrames()) {
            jif.setLocation(jdi * distanciamento, jdi * distanciamento);
            jdi--;
            if (jdi == 0) {
                try {
                    jif.setSelected(true);
                } catch (PropertyVetoException e) {
                    e.printStackTrace();
                }
            }
        }

    
    jInternalFrame.setVisible(true);
      if(maximizado == true){
        try {
            jInternalFrame.setMaximum(true);
        } catch (PropertyVetoException ex) {
           
        }
      }
    setPosicao(jdesktopPane, jInternalFrame);
    setTitle(jInternalFrame, titulo);
    }
    
    }
  
   public void setPosicao(JDesktopPane jdesktopPane, JInternalFrame janela) {
   int wJDesk = jdesktopPane.getWidth();
   int hJDesk =  jdesktopPane.getHeight();
   int wJInt  = janela.getWidth();
   int hJInt = janela.getHeight();
   janela.setLocation((wJDesk - wJInt) / 2, (hJDesk - hJInt) / 2); 
    
}
   
     public void setPosicaoJDialog(JDesktopPane jdesktopPane, JDialog janela) {
   int wJDesk = jdesktopPane.getWidth();
   int hJDesk =  jdesktopPane.getHeight();
   int wJInt  = janela.getWidth();
   int hJInt = janela.getHeight();
   janela.setLocation((wJDesk - wJInt) / 2, (hJDesk - hJInt) / 2); 
    
}
     
  public void setTitle(JInternalFrame jInternalFrame, String titulo){
         jInternalFrame.setTitle(titulo);
     }
   
}
