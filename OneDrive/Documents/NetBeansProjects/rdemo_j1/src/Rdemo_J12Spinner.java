
package rdemo_j1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Rdemo_J12Spinner {

    public Rdemo_J12Spinner() {
        
    JFrame f = new JFrame("Spinner Demo");
    
    f.setSize(500, 500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(new FlowLayout());
       
    JLabel jlab = new JLabel();
    
    JSpinner js = new JSpinner();
    f.add(js);
    f.add(jlab);
    
    JSpinner js1 = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1));
    f.add(js1);
    
    String[] spinlist = {"CE","IT","EC","EE","ME"};
    JSpinner js2 = new JSpinner(new SpinnerListModel(spinlist));
    f.add(js2);
    
    Calendar c = Calendar.getInstance();
    Date d  = c.getTime();
    c.add(Calendar.YEAR,-100);
    
    c.add(Calendar.SECOND, 1);
    Date d1 = c.getTime();
    c.add(Calendar.YEAR,200);
    Date d2 = c.getTime();
    
    JSpinner js3 = new JSpinner(new SpinnerDateModel(d ,d1 , d2, Calendar.YEAR));
    f.add(js3);
    
    
    js.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
       
            jlab.setText("Spinner value is "+js.getValue());
        }
    });
    
    f.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Rdemo_J12Spinner();
    }
    
}
