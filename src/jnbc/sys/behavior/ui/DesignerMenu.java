package jnbc.sys.behavior.ui;

import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.RenderingHints;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 /**
* @author NILDO BUENO CORREIA FILHO 
 * CPF: 10333054725
 * EMAIL: nil_bueno@hotmail.com    
 * JAVA VERSION - 14
 * NETBEANS     - 12
 * 
 * Created on 24/12/2021, 03:20:27
 */
public class DesignerMenu {
    public static int stMenu;
    static JDesktopPane jdesktopPane;
    static int openFrameCount = 0;
    static final int xOffset = 30, yOffset = 30;

    public DesignerMenu menuTray(String dir,
            JFrame nomeFrame2,
            String nomePrograma) {

        if (!SystemTray.isSupported()) {
            JOptionPane.showMessageDialog(null,
                    "Função minimizar programa no Tray, não é suportador por este S.O",
                    "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);

        }
        final PopupMenu popup = new PopupMenu();
        final SystemTray tray = SystemTray.getSystemTray();
        try {
            InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(dir);
            BufferedImage img = ImageIO.read(inputStream);
            final TrayIcon trayIcon = new TrayIcon(img, nomePrograma, popup);
            MenuItem aboutItem   = new MenuItem("Sobre");
            MenuItem opt1        = new MenuItem("Maximizar Tela");
            CheckboxMenuItem cb2 = new CheckboxMenuItem("Set tooltip");
            Menu displayMenu     = new Menu("Funções");
            MenuItem errorItem   = new MenuItem("Error");
            MenuItem warningItem = new MenuItem("Warning");
            MenuItem infoItem = new MenuItem("Info");
            MenuItem noneItem = new MenuItem("None");
            MenuItem exitItem = new MenuItem("Exit");

            popup.add(aboutItem);
            popup.add(aboutItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

            popup.addSeparator();
            popup.add(opt1);
            popup.add(opt1).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    nomeFrame2.setVisible(true);
                    nomeFrame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    System.gc();
                }
            });
            popup.add(cb2);

            popup.addSeparator();
            popup.add(displayMenu);

            displayMenu.add(errorItem);
            displayMenu.add(warningItem);
            displayMenu.add(infoItem);
            displayMenu.add(noneItem);
            popup.add(exitItem);
            trayIcon.setPopupMenu(popup);

            displayMenu.add(exitItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Teste");
                }
            });

            displayMenu.add(errorItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Teste");
                }
            });
            displayMenu.add(warningItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Teste");
                }
            });
            displayMenu.add(infoItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Teste");
                }
            });

            displayMenu.add(noneItem).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Teste");
                }
            });
            try {
                tray.add(trayIcon);
            } catch (AWTException e) {
                System.out.println("TrayIcon could not be added.");
                JOptionPane.showMessageDialog(null,
                        "TrayIcon não pode ser adicionado \nInforme ao Suporter",
                        "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
            }
            System.gc();
        } catch (IOException e) {
        }
        return null;
    }

    public void iniciarJFrameMaximizada(JFrame nomeFrame2) {
        nomeFrame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void ImagemFundo(
            Image img,
            String dirImgBack,
            JDesktopPane jdesktopPane) {
        JDesktopPane jp = new JDesktopPane();
        jp = jdesktopPane;
        Graphics g = jp.getGraphics();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dimension = tela.getSize();
        BufferedImage bi;
        try {
            img = new ImageIcon(getClass().getResource(dirImgBack)).getImage();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,
        "Não foi possivel carregar a imagen de fundo na Janela de Menu\n+"
        + "Erro na Classe 'ImagemFundo'",
        "Aviso de Erro", JOptionPane.ERROR_MESSAGE);
        }
        if (img != null) {

            int dWidth = (int) dimension.getWidth();
            int dHeight = (int) dimension.getHeight();
            bi = new BufferedImage(dWidth, dHeight, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = bi.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.setRenderingHint(RenderingHints.KEY_RENDERING,
                    RenderingHints.VALUE_RENDER_QUALITY);
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2.drawImage(img, 0, 0, dWidth, dHeight, null);
            g2.dispose();
            g.drawImage(bi, 0, 0, null);
        }
    }

    public Dimension setSize() {
        Toolkit toolkit;
        toolkit = Toolkit.getDefaultToolkit();
        Dimension resolucao = toolkit.getScreenSize();
        return resolucao;
    }

    public ImageIcon ajustaTela(String dirwall, JLabel nomeJLabel) {
        ImageIcon myimage = null;
        try {
            myimage = new ImageIcon(dirwall);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,
                    "Imagem não pode ser econtrada \n\nContate Suporte",
                    "Aviso do Sistema", JOptionPane.WARNING_MESSAGE);
        }
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(nomeJLabel.getWidth(),
                nomeJLabel.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        return i;
    }

   

}
