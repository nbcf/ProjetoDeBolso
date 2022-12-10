
package projetodebolso;


import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class ImageIconCellRenderer extends DefaultTableCellRender {

JLabel label = new JLabel();
ImageIcon icone;

 
  @Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) 
        {
             Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
           
            setBackground(row % 2 == 0 ? Color.LIGHT_GRAY : Color.WHITE);
            setForeground(new Color(51, 51, 51)); 
            String str = (String) value;
            
            if ("PAGO".equals(str)) {
                
                setHorizontalAlignment(SwingConstants.CENTER);
                setVerticalAlignment(SwingConstants.CENTER);
                setIcon( new ImageIcon(getClass().getResource("/infra/image/greenDot.png")));
                setText("");
           
            
            } else if ("APAGAR".equals(str)) {
                
                setHorizontalAlignment(SwingConstants.CENTER);
                setVerticalAlignment(SwingConstants.CENTER);                
                setIcon( new ImageIcon(getClass().getResource("/infra/image/redDot.png")));   
                setText("");

            }
         
            
                
            return c;
            }
}