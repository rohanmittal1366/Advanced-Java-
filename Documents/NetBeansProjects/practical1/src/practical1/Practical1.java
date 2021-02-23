package practical1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Practical1 extends JFrame implements ActionListener {

    JLabel jl4, jl1, jl2, jl3;
    JTextField jt1, jt2, jt3;
    JButton jb;

    Practical1() {
        FlowLayout f1 = new FlowLayout();
        setLayout(f1);

        jl1 = new JLabel("Enter the first Number : ");
        add(jl1);

        jt1 = new JTextField(15);
        add(jt1);

        jl2 = new JLabel("Enter the second Number : ");
        add(jl2);

        jt2 = new JTextField(15);
        add(jt2);

        jl3 = new JLabel("Enter the operator : ");
        add(jl3);

        jt3 = new JTextField(15);
        add(jt3);

        jb = new JButton("Calculate");
        jb.addActionListener(this);
        add(jb);

        jl4 = new JLabel();
        add(jl4);
        
        setBounds(500, 300, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Practical1().setVisible(true);
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

        jl4.setText("The result is : " + result.toString());
        System.out.println(result);
        add(jl4);

    }
}
