package p1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Practical2a extends JFrame implements ActionListener {

    JButton jb1, jb2, jb3, jb4;
    JLabel j1;
    int count = 0;

    Practical2a() {

        jb1 = new JButton("Click Here");
        jb1.addActionListener(this);

        jb2 = new JButton("Not Here");
        jb2.addActionListener(this);

        jb3 = new JButton("Not Here");
        jb3.addActionListener(this);

        jb4 = new JButton("Not Here");
        jb4.addActionListener(this);

        j1 = new JLabel("Click button to start");

        setLayout(new BorderLayout());

        add(jb1, BorderLayout.NORTH);
        add(jb2, BorderLayout.SOUTH);
        add(jb3, BorderLayout.WEST);
        add(jb4, BorderLayout.EAST);
        add(j1, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(470, 220, 400, 400);
        setVisible(true);
    }

    public static void main(String args[]) {
        new Practical2a().setVisible(true);
    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == jb1) {

            count++;
            String str = jb1.getText();

            if (count >= 10) {
                this.setVisible(false);
            } else if (str.equals("Click Here")) {
                j1.setText("Good job, do it again");
                int x = (int) ((Math.random()) * 4);
                //System.out.println(x);
                if (x == 2) {
                    jb2.setText("Click Here");
                    jb1.setText("Not Here");
                }
                if (x == 3) {
                    jb3.setText("Click Here");
                    jb1.setText("Not Here");
                }
                if (x == 4) {
                    jb4.setText("Click Here");
                    jb1.setText("Not Here");
                }

            } else {
                j1.setText("Wrong , Try Again");
            }

        } else if (a.getSource() == jb2) {

            count++;
            String str = jb2.getText();
            if (count >= 10) {
                this.setVisible(false);
            } else if (str.equals("Click Here")) {
                j1.setText("Good job, do it again");
                int x = (int) ((Math.random()) * 4);
                //System.out.println(x);
                if (x == 1) {
                    jb1.setText("Click Here");
                    jb2.setText("Not Here");
                }
                if (x == 3) {
                    jb3.setText("Click Here");
                    jb2.setText("Not Here");
                }
                if (x == 4) {
                    jb4.setText("Click Here");
                    jb2.setText("Not Here");
                }

            } else {
                j1.setText("Wrong , Try Again");
            }

        } else if (a.getSource() == jb3) {

            count++;
            String str = jb3.getText();
            if (count >= 10) {
                this.setVisible(false);
            } else if (str.equals("Click Here")) {
                j1.setText("Good job, do it again");
                int x = (int) ((Math.random()) * 4);
                //System.out.println(x);
                if (x == 2) {
                    jb2.setText("Click Here");
                    jb3.setText("Not Here");
                }
                if (x == 1) {
                    jb1.setText("Click Here");
                    jb3.setText("Not Here");
                }
                if (x == 4) {
                    jb4.setText("Click Here");
                    jb3.setText("Not Here");
                }

            } else {
                j1.setText("Wrong , Try Again");
            }

        } else if (a.getSource() == jb4) {

            count++;
            String str = jb4.getText();
            if (count >= 10) {
                this.setVisible(false);
            } else if (str.equals("Click Here")) {
                j1.setText("Good job, do it again");
                int x = (int) ((Math.random()) * 4);
                //System.out.println(x);
                if (x == 2) {
                    jb2.setText("Click Here");
                    jb4.setText("Not Here");
                }
                if (x == 3) {
                    jb3.setText("Click Here");
                    jb4.setText("Not Here");
                }
                if (x == 1) {
                    jb1.setText("Click Here");
                    jb4.setText("Not Here");
                }
            } else {
                j1.setText("Wrong , Try Again");
            }
        }
    }

}
