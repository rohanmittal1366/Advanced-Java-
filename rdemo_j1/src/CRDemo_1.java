
package rdemo_j1;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CRDemo_1 {
    
    CRDemo_1()
    {
        JFrame j = new JFrame("First Swing Demo");
        j.setSize(400, 400);
        
        j.setLayout( new FlowLayout());
        
       // j.setLayout(new BoxLayout(j.getContentPane(), BoxLayout.PAGE_AXIS));
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel jl = new JLabel("1");
        j.add(jl);
        JTable jt;
        //DefaultTableModel dtm = (DefaultTableModel) jt.getModel();
        
        
        JLabel jl2 = new JLabel("2");
        j.add(jl2);
        JLabel jl3 = new JLabel("3");
        j.add(jl3);
        JLabel jl4 = new JLabel("4");
        j.add(jl4);
        JLabel jl5 = new JLabel("5");
        j.add(jl5);
  
           JLabel jl6 = new JLabel("6");
        j.add(jl6);
        
        JTextField jtf1 = new JTextField();
        Integer t = 5;
        jtf1.setText(t.toString());
        
        JTextField jtf2 = new JTextField();
        int x = 5;
        jtf2.setText(String.valueOf(x));
     
       JTextField jtf = new JTextField();
       jtf.setText("32,42,55");
       String[] s = jtf.getText().split(",");
       
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i]);
            
        }
       
        
        j.setVisible(true);
    }
    
    public static void main(String[] args) {
        
    new CRDemo_1();
}
}
