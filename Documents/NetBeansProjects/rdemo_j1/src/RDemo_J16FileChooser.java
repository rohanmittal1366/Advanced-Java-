/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdemo_j1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.io.File;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class RDemo_J16FileChooser {

    public RDemo_J16FileChooser() {
    
    JFrame f = new JFrame("FileChooser");
    f.setSize(500,500);
    f.setLayout(new FlowLayout());
    
    JFileChooser jfc = new JFileChooser();
    int x = jfc.showOpenDialog(null);
    File fil = jfc.getSelectedFile();
    JLabel l = new JLabel(String.valueOf(fil));
    f.add(l);
    
        JColorChooser jcc = new JColorChooser();
        Color cl = JColorChooser.showDialog(null, "Color Selection", Color.yellow);
        JLabel l2 = new JLabel(String.valueOf(cl));
        f.add(l2);
            
    
    f.setVisible(true);
    }

    public static void main(String[] args) {
        new RDemo_J16FileChooser();
    }
}
