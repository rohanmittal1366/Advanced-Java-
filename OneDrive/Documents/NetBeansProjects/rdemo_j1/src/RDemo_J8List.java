
package rdemo_j1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class RDemo_J8List {

    JList w;
    public RDemo_J8List() {
    JFrame j = new JFrame("JCheckBox Example");
    j.setLayout(new FlowLayout());
    j.setSize(320, 200);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //ListModel Interface - Access & ListSelectionModel - Item Selection
     String week[]= { "Mon","Tues","Wednes", 
                         "Thurs","Fri","Satur","Sun"}; 

     w= new JList(week);
     w.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
     
     //w.setLayoutOrientation(JList.VERTICAL_WRAP);
     
     
     j.add(w);
     
     JLabel jl = new JLabel();
     j.add(jl);
     
     w.addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            int[] sel =  w.getSelectedIndices();
            for (int i = 0; i < sel.length; i++) {
                jl.setText(""+ w.getSelectedValuesList());
            }
//throw new Unsu;pportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });
     
     
     /*JScrollPane p = new JScrollPane(w);
     p.setPreferredSize(new Dimension(120, 90));
     j.add(p);*/
    
    j.setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        new RDemo_J8List();
    }
}
