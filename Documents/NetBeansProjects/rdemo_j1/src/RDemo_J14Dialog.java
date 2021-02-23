


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class RDemo_J14Dialog {

    public RDemo_J14Dialog() {
        
    JFrame f = new JFrame("JDialog Demo");
    
    f.setSize(500, 500);
    f.setLayout(new FlowLayout());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JDialog jd = new JDialog(f,"Dialog 1");
    jd.setSize(50, 50);
    
    JButton jb1 = new JButton("Click for Dialog");
    f.add(jb1);
    
    jb1.addActionListener(new ActionListener() {
        @Override
        
        
        public void actionPerformed(ActionEvent e) {
                    JLabel jl = new JLabel("From Dialog");
            jd.add(jl);
            jd.setVisible(true);
        }
    });
    
    
    f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new RDemo_J14Dialog();
    }
}
;