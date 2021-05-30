
package rdemo_j1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class RDemo_J7RadioButton implements ActionListener{
JLabel jlab;
    
    public RDemo_J7RadioButton(){
        JFrame j = new JFrame("JCheckBox Example");
        j.setLayout(new FlowLayout());
        j.setSize(320, 200);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JRadioButton b1 = new JRadioButton("Debug");
        b1.addActionListener(this);
      j.add(b1);
        JRadioButton b2 = new JRadioButton("Maximum Speed");
        b2.addActionListener(this);
        j.add(b2);
        JRadioButton b3 = new JRadioButton("Minimize Size");
        b3.addActionListener(this);
        j.add(b3);
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        JLabel jlab = new JLabel("Select one");
        j.add(jlab);
        
        j.setVisible(true);        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        jlab.setText("You Selected : " + ae.getActionCommand());
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
    
                new RDemo_J7RadioButton();
            }
        });
    }

}
