package rdemo_j1;
import javax.swing.*;

public class RDemo_J1 {

    
    public RDemo_J1() {
        JFrame j = new JFrame("First Swing Program");
        j.setSize(275, 100);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       /* JLabel jlab = new JLabel("Hello Swing");
        j.add(jlab);
        */
       j.setVisible(true);
    }
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                new RDemo_J1();
            }
        });
    }
    
}
