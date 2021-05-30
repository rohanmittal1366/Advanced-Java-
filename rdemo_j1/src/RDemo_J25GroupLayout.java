
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class RDemo_J25GroupLayout {
 
    RDemo_J25GroupLayout()
    {
        JFrame jf = new JFrame();
        jf.setSize(500,500);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        
        
        GroupLayout gl = new GroupLayout(jf);
        gl.setAutoCreateGaps(true);
        gl.setAutoCreateContainerGaps(true);
        
        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(b1).addGap(5,5,5).addComponent(b4).addContainerGap(10, 10));
        
        gl.setVerticalGroup(gl.createParallelGroup().addComponent(b1).addGap(5,5,5).addComponent(b4).addGap(10));
        
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new RDemo_J25GroupLayout();
    }
    
}
