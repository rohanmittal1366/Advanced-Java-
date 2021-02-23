
package rdemo_j1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;


public class RDemo_J5CheckBox implements ItemListener {

    JCheckBox jc1,jc2,jc3;
    JLabel jl1;
    
    public RDemo_J5CheckBox() {
    
     JFrame j = new JFrame("JCheckBox Example");
     //j.setLayout(new GridLayout(4,1));
     j.setLayout(new BoxLayout(j.getContentPane(),BoxLayout.Y_AXIS));
     
     j.setSize(1000, 1000);
     j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     j.setVisible(true);
     
     jc1 = new JCheckBox("English");
     jc2 = new JCheckBox("Hindi");
     jc3 = new JCheckBox("Gujarati");
     jl1 = new JLabel("");
     
     j.add(jc1);
     j.add(jc2);
     j.add(jc3);
     j.add(jl1);
     
     
  
     
     jc1.addItemListener(this);
     jc2.addItemListener(this);
     jc3.addItemListener(this);
     
     j.revalidate();
     j.repaint();
     
     ButtonGroup bg = new ButtonGroup();
     bg.add(jc1);
     bg.add(jc2);
     bg.add(jc3);
    
    }
    
    public static void main(String[] args) {
        
        new RDemo_J5CheckBox();
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
        //if(e.getStateChange() == ItemEvent.SELECTED)
       JCheckBox jb = (JCheckBox)e.getItem();
        
        if(jb.isSelected())
        jl1.setText(jl1.getText()+" "+jb.getText()+" is selected ");
        else
        jl1.setText(jl1.getText()+" "+jb.getText()+" is cleared ");
        


//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
