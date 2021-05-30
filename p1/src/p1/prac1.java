package p1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class prac1 extends JFrame implements ActionListener {

    JLabel jl4, jl1, jl2, jl3;
    JTextField jt1, jt2, jt3;
    JButton jb;

    prac1() {
        FlowLayout f1 = new FlowLayout();
        setLayout(f1);

        jl1 = new JLabel("Enter the first Number : ");
        jl1.setBounds(10, 10, 150, 30);
        add(jl1);

        jt1 = new JTextField(15);
        jt1.setBounds(200, 10, 150, 20);
        add(jt1);

        jl2 = new JLabel("Enter the second Number : ");
        jl2.setBounds(10, 60, 170, 30);
        add(jl2);

        jt2 = new JTextField(15);
        jt2.setBounds(200, 60, 150, 20);
        add(jt2);

        jl3 = new JLabel("Enter the operator : ");
        jl3.setBounds(10, 110, 150, 30);
        add(jl3);

        jt3 = new JTextField(15);
        jt3.setBounds(200, 110, 150, 20);
        add(jt3);

        jb = new JButton("Calculate");
        jb.setBounds(100, 180, 150, 30);
        jb.addActionListener(this);
        add(jb);

        jl4 = new JLabel();
        jl4.setBounds(300, 180, 150, 30);
        add(jl4);

        setBounds(500, 300, 500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prac1().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(jt1.getText());
        int n2 = Integer.parseInt(jt2.getText());
        Integer result = 0;
        String s = jt3.getText();

        if (s.compareTo("+") == 0) {
            result = n1 + n2;
        } else if (s.compareTo("-") == 0) {
            result = n1 - n2;
        } else if (s.compareTo("/") == 0) {
            result = n1 / n2;
        } else if (s.compareTo("*") == 0) {
            result = n1 * n2;
        } else if (s.compareTo("%") == 0) {
            result = n1 % n2;
        } else {
            result = 0;
        }

        if (e.getSource() == jb) {

            JOptionPane.showMessageDialog(null, "The result is  " + result);
        }

        jl4.setText("The result is : " + result.toString());
        System.out.println(result);
        add(jl4);

    }
}
