package prac3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prac3 extends JFrame implements ActionListener{

    JMenu m;
    JMenuItem mi1, mi2, mi3, mi4;
    
    Prac3(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar mb = new JMenuBar();
        m = new JMenu("File");
        
        mi1 = new JMenuItem("Insert");
        m.add(mi1);
        mi1.addActionListener(this);
        
        mi2 = new JMenuItem("Update");
        m.add(mi2);
        mi2.addActionListener(this);
        
        mi3 = new JMenuItem("View");
        m.add(mi3);
        mi3.addActionListener(this);
        
        mi4 = new JMenuItem("Delete");
        m.add(mi4);
        mi4.addActionListener(this);
        
        //m.setBounds(0, 10, 400, 30);
        mb.add(m);
        add(mb);
        
        setLayout(new FlowLayout());
        setSize(400, 300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        
        new Prac3();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==mi1){
            System.out.println("hii");
            insert I = new insert();
            add(I);
            pack();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}