
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class RDemo_J6ComboBox {

    public RDemo_J6ComboBox() {
     
        
     JFrame j = new JFrame("JCheckBox Example");
        j.setLayout(new FlowLayout());
        j.setSize(320, 200);
     j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
     
     
     // To show a user with list of options
    String s[] = {"EL1","EL2","EL3","EL5","EL6","EL7"};
    JComboBox jcombo = new JComboBox(s);
    j.add(jcombo);
    jcombo.addItem("Java");
    //jcombo.setEditable(true);
    jcombo.setMaximumRowCount(2);
    jcombo.setSelectedIndex(1);
    JLabel jl = new JLabel();
    j.add(jl);
                    
     
     jcombo.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             JComboBox jc = (JComboBox)e.getSource();
            jl.setText(jc.getSelectedItem().toString());
            jc.addItem("EL4");
         }
     });
     j.setVisible(true);
    }
    public static void main(String[] args) {
        new RDemo_J6ComboBox();
    }
}
