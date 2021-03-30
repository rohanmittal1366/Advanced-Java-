
package rdemo_j1;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.SwingUtilities;

public class RDemo_J4Button {

     JButton jb1;
    public RDemo_J4Button() {
        
        JFrame f = new JFrame("JLabel Demo");
        
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        
        jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button2");
        ImageIcon image = new ImageIcon("C:\\Users\\ME95\\Documents\\NetBeansProjects\\RDemo_J1\\src\\rdemo_j1\\Stop.png");
        JButton jb3 = new JButton("Icon Button ");
        
        jb3.setIcon(image);;
        
        
        
        f.add(jb1);
        f.add(jb2);
        f.add(jb3);
        
        jb2.setMnemonic('h');
        
        JToggleButton jtb = new JToggleButton("OFF");
        f.add(jtb);
        JLabel jl = new JLabel("");
        f.add(jl);
        jtb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
        
                if(jtb.isSelected())
                {
                    jl.setText("Selected");
                    jtb.setText("ON");
                }
                else
                {
                    jl.setText("Not Selected");
                jtb.setText("OFF");
            }

                
            }
        });
        
        
        f.setVisible(true);
       jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jb1.setText("Selected");
       jb1.setFont(new Font("Arial", Font.BOLD, 30));
                    jb2.setEnabled(false);


            }
        });
        
        
    }
    
  
    
    public static void main(String[] args) {
        
         try {
             UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
             
         } catch (UnsupportedLookAndFeelException ex) {
             Logger.getLogger(RDemo_J4Button.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(RDemo_J4Button.class.getName()).log(Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             Logger.getLogger(RDemo_J4Button.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             Logger.getLogger(RDemo_J4Button.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        SwingUtilities.invokeLater(new Runnable() {
            
                    @Override
            public void run() {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                new RDemo_J4Button();
            }
        }); 
    }
    
}
