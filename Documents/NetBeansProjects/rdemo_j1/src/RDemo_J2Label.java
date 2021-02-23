package rdemo_j1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;

public class RDemo_J2Label {

    public RDemo_J2Label() {
    
    JFrame f = new JFrame("JLabel Demo");
    f.setVisible(true);
    f.setSize(500, 500);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel jl1 = new JLabel();
    JLabel jl2 = new JLabel("Label 2", SwingConstants.CENTER);
    ImageIcon image = new ImageIcon("C:\\Users\\ME95\\Documents\\NetBeansProjects\\RDemo_J1\\src\\rdemo_j1\\Stop.png");
    JLabel jl3 = new JLabel("Image Label",image,SwingConstants.RIGHT);
    
    BevelBorder b = new BevelBorder(1);
    jl1.setBorder(b);
    jl2.setBorder(b);
    jl3.setBorder(b);
    jl3.setIconTextGap(150);
    
    //jl3.setVerticalTextPosition(JLabel.BOTTOM);
    //jl3.setHorizontalTextPosition(JLabel.LEFT);
    
    jl3.setToolTipText("Image with a labels");
    
    f.add(jl1); 
    f.add(jl2);
    f.add(jl3);
    
    f.setLayout(new GridLayout(3,1));
   
    }

    
    
    public static void main(String[] args) {
        
    SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                new RDemo_J2Label();
            }
        });    
    }
    
}
