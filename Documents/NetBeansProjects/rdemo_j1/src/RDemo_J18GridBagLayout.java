

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;;

public class RDemo_J18GridBagLayout {

    public RDemo_J18GridBagLayout() {
        
        JFrame jf = new JFrame("Grid-Bag Layout");
        jf.setSize(500, 500);
        jf.setLayout(new GridBagLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton jb1  = new JButton("Button 1");
        JButton jb2  = new JButton("Button 2");
        JButton jb3  = new JButton("Button 3");
        JButton jb4  = new JButton("Button 4");
        JButton jb5  = new JButton("Button 5");
        
        GridBagConstraints gbc1 = new GridBagConstraints();
        //Weights are used to determine how to distribute space among columns (weightx) and among rows (weighty)
        //gbc1.insets = new Insets(0, 10, 0, 10); // External Padding
        //gbc1.fill = GridBagConstraints.HORIZONTAL; // if components display area > requested what to do ?
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        
        //gbc1.gridheight = 2;
        
        jf.add(jb1, gbc1);
        
        gbc1.gridheight = 4;
        gbc1.gridx = 1;
        gbc1.gridy = 0;
        jf.add(jb2, gbc1);
        
         gbc1.gridx = 2;
        gbc1.gridy = 0;
        
        jf.add(jb3, gbc1);
        
         gbc1.gridx = 3;  // 3 1 
        gbc1.gridy = 0;   // 0 1
        gbc1.ipady = 40;
       
        jf.add(jb4, gbc1);
        
        gbc1.ipady = 0;
        gbc1.gridx = 0;  // gbc1.gridx = 4  0  1  2
        gbc1.gridy = 1;   // gbc1.gridx = 0  1  1 1 
        //gbc1.gridwidth = 3; // Specify the width of the component; it is also dependent on gridx and gridy
//        gbc1.weighty = 0.2;
//        gbc1.insets = new Insets(10,0,0,0);
        gbc1.anchor = GridBagConstraints.LAST_LINE_END;
        jf.add(jb5, gbc1);
      
        jf.setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        new RDemo_J18GridBagLayout();
        
                
    }
    
}
