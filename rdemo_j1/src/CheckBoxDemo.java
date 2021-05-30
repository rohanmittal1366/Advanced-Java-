/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdemo_j1;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxDemo  implements ItemListener{
    JLabel jlabChange;
    JLabel jlabSupported;
    
    JCheckBox cbWin;
    JCheckBox cbLinux;
    JCheckBox cbMac;
    
    public CheckBoxDemo() {
        JFrame j = new JFrame("JCheckBox Example");
        j.setLayout(new FlowLayout());
        j.setSize(320, 200);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        cbWin = new JCheckBox("Windows");
        cbWin.addItemListener(this);
        //j.add(cbWin);
        
        cbLinux = new JCheckBox("Linux");
        cbLinux.addItemListener(this);
        //j.add(cbLinux);
        
        cbMac = new JCheckBox("Mac");
        cbMac.addItemListener(this);
        //j.add(cbMac);
        //ButtonGroup bg = new ButtonGroup();
        //bg.add(cbWin);
        //bg.add(cbLinux);
        //bg.add(cbMac);
        j.add(cbWin);
        j.add(cbLinux);
        j.add(cbMac);
        jlabChange = new JLabel("Select Supported Operating Systems ");
        j.add(jlabChange);
        
        jlabSupported = new JLabel();
        j.add(jlabSupported);
        j.setVisible(true);
        
    }
    
    public void itemStateChanged(ItemEvent e){
        JCheckBox cb = (JCheckBox) e.getItem();
        if(cb.isSelected())
            jlabChange.setText(cb.getText() + " has been selected.");
        else
            jlabChange.setText(cb.getText() + " has been cleared.");
        String supported = "Supported Operating Systems: ";
        if(cbWin.isSelected()) supported +=" Windows ";
        if(cbLinux.isSelected()) supported +=" Linux ";
        if(cbMac.isSelected()) supported +=" Mac ";
        
        jlabSupported.setText(supported);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                new CheckBoxDemo();
            }
        });
    }
    
}
