
package rdemo_j1;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class RDemo_J13Slider {

    public RDemo_J13Slider() {
    
     JFrame f = new JFrame("Spinner Demo");
    
    f.setSize(500, 500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(new FlowLayout());
    JLabel jl = new JLabel();
    
    JSlider jslid = new JSlider();
    f.add(jslid);
    
    JSlider jslid1 = new JSlider(100,200,170);
    f.add(jslid1);
    
    JSlider jslid2 = new JSlider(JSlider.VERTICAL,100,200,170);
    f.add(jslid2);
    
   jslid.setMajorTickSpacing(10);
    jslid.setMinorTickSpacing(5);
    jslid.setPaintTicks(true);
    jslid.setPaintLabels(true);
    
    f.add(jl);
    
    jslid.addChangeListener(new ChangeListener() {
         @Override
         public void stateChanged(ChangeEvent e) {
             jl.setText("Slider 1 : "+String.valueOf(jslid.getValue()));
      //       jl.setText( jl.getText()+" Slider 2 : "+String.valueOf(jslid1.getValue()));
         }
     });
    
    f.setVisible(true);
    
    }
    
    public static void main(String[] args) {
        new RDemo_J13Slider();
    }
}
