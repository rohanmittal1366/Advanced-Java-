/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdemo_j1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class JT_Practical2 implements ActionListener{

    
    JButton b1,b2,b3,b4;
    JLabel jl;
    public JT_Practical2() {
        
        JFrame f = new JFrame("JLabel Demo");
        f.setVisible(true);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        
        b1 = new JButton("Click Here");
        b2 = new JButton("Not Here");
        b3 = new JButton("Not Here");
        b4 = new JButton("Not Here");
        jl = new JLabel("");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(jl);
        
    }
    
    public static void main(String[] args) {
        new JT_Practical2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(b1.getText().equals("Click Here"))
        {
            jl.setText("Good Job");
        }

        

//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
