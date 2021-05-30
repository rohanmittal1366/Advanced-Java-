package rdemo_j1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class extra {

    public extra() {
    
     JFrame j = new JFrame("JLabel and ImageIcon Example");
        j.setSize(320, 320);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon goIcon = new ImageIcon("C:\\Users\\ME95\\Documents\\NetBeansProjects\\RDemo_J1\\src\\rdemo_j1\\Stop.png");
        JLabel jlabgo = new JLabel(" GO ", goIcon, SwingConstants.LEFT);
       // ImageIcon cautionIcon = new ImageIcon("Caution.png");
        JLabel jlabcaution = new JLabel(" Caution ", goIcon, SwingConstants.CENTER);
        //ImageIcon stopIcon = new ImageIcon("Stop.png");
        JLabel jlabstop = new JLabel(" Stop ", goIcon, SwingConstants.RIGHT);
        j.setLayout(new FlowLayout());
        
        j.add(jlabgo);
        j.add(jlabcaution);
        j.add(jlabstop);
        j.setVisible(true);
    }

    
    
    public static void main(String[] args) {
        
    SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                new extra();
            }
        });    
    }
    
}
