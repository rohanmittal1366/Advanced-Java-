package practical3a;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.*;

public class Practical3a extends JFrame implements ActionListener {

    JMenu m1;
    JMenuItem i1, i2, i3, i4;
    JMenuBar jmb;
    JButton b1, b2;
    JPanel p1;
    JTextField jtf1, jtf2, jtf3;
    JComboBox jmb1, jmb2;
    JRadioButton jrb1, jrb2;
    JLabel jl1;

    Practical3a() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jmb = new JMenuBar();
        m1 = new JMenu("Menu");

        i1 = new JMenuItem("Insert");
        i1.addActionListener(this);
        m1.add(i1);

        i2 = new JMenuItem("View");
        i2.addActionListener(this);
        m1.add(i2);

        i3 = new JMenuItem("Update");
        i3.addActionListener(this);
        m1.add(i3);

        i4 = new JMenuItem("Delete");
        i4.addActionListener(this);
        m1.add(i4);

        jmb.add(m1);
        add(jmb);
        setJMenuBar(jmb);

//        ImageIcon i1 = new ImageIcon(getClass().getResource("images.png"));
//        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel jl10 = new JLabel(i3);
//        jl10.setBounds(0,0, 300, 200);
//        add(jl10);

        getContentPane().setBackground(Color.pink);
//        setBounds(300, 100, 700, 700);
        //LayoutManager FlowLayout = new FlowLayout();
        setLayout(new FlowLayout());
        setSize(800, 800);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Practical3a();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == i1) {

            insert i = new insert();
            add(i);
            pack();

        } else if (e.getSource() == i2) {

            view v = new view();
            add(v);
            pack();
            

        } else if (e.getSource() == i3) {

            update u = new update();
            add(u);
            pack();
        } else if (e.getSource() == i4) {

            delete d = new delete();
            add(d);
            pack();
            
        }
    }

}
