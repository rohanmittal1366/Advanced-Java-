
package rdemo_j1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class RDemo_J15OptionPane {

    public RDemo_J15OptionPane() {
    
    JFrame f = new JFrame("Option Pane");
    f.setSize(500,500);
    f.setLayout(new FlowLayout());
    
    JButton b1 = new JButton("Message");
    JButton b2 = new JButton("Confirm");
    JButton b3 = new JButton("Input");
    JButton b4 = new JButton("Option");
    JLabel l = new JLabel();
    
    f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(l);
    
    b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
      //JOptionPane.showMessageDialog(f, "This is a message dialog");
      JOptionPane.showMessageDialog(f,"Message Dialog 2", "Message Example", JOptionPane.WARNING_MESSAGE);
        }
    });
    
    b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
  //          int x = JOptionPane.showConfirmDialog(f, "Are you sure?");
            int x2 = JOptionPane.showConfirmDialog(f, "Are you sure?","Confirm Example", JOptionPane.OK_CANCEL_OPTION);
            
            l.setText(String.valueOf(x2));
        }
    });
    
    b3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        String str = JOptionPane.showInputDialog(f, "Enter your data");
          
        Object opt[] = {"A","B","C"};
        String str2 = (String) JOptionPane.showInputDialog(f, "Input Dialog Type 2"," Input Example",JOptionPane.PLAIN_MESSAGE,null,opt, "A");
       l.setText(str2);
            
        }
    });
    
    b4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          
            Object[] options = {"Yes, please",
                    "No, thanks",
                    "Nothing","abc"};

         int n = JOptionPane.showOptionDialog(f, "Enter option", "Abc", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
           l.setText(String.valueOf(n));
        }
    });
    
    
    f.setVisible(true);
    
    }
    
    public static void main(String[] args) {
        new RDemo_J15OptionPane();
    }
    
}
