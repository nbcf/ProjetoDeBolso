package projetodebolso;
import javax.swing.JFrame;

 /**
* @author NILDO BUENO CORREIA FILHO 
 * CPF: 10333054725
 * EMAIL: nil_bueno@hotmail.com    
 * JAVA VERSION - 14
 * NETBEANS     - 12
 * 
 * Created on 24/12/2021, 03:20:27
 */
public class BehaviorJFrame {

    public BehaviorJFrame openFormCrud(JFrame jframe,int width,int heigth,String titulo){
        jframe.setSize(width, heigth);
        jframe.setLocationRelativeTo(null);
        jframe.pack();
        jframe.setResizable(false);
        jframe.setVisible(true);
        jframe.setTitle(titulo);

        return this;
    }

    public BehaviorJFrame closeFormCrud(JFrame jframe) {
        jframe.dispose();
        
        
        return this;
    }
    
}
