package p1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Prac2b extends JFrame implements ActionListener, Runnable {

    JButton b1, b2, b3;
    JLabel tf1;
    int cnt = 0, seconds = 0, minutes = 0, hours = 0;
    String sec = String.format("%02d", seconds);
    String min = String.format("%02d", minutes);
    String hrs = String.format("%02d", hours);

    Thread t;
    boolean val = true;
    int start = 1, reset = 0, stop = 0;

    Prac2b() {

        t = new Thread(this);
        tf1 = new JLabel();
        tf1.setBounds(160, 80, 250, 30);
        tf1.setText("00:00:00");
        tf1.setFont(new Font("Courier New", Font.BOLD, 24));
        add(tf1);

        b1 = new JButton("Start");
        b1.setBounds(20, 30, 100, 20);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Stop");
        b2.setBounds(170, 30, 100, 20);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Reset");
        b3.setBounds(320, 30, 100, 20);
        b3.addActionListener(this);
        add(b3);

        setLayout(null);
        setBounds(450, 320, 470, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            if (start == 1) {
                t.start();
                start = 0;
            }
            if (reset == 1) {
                t.resume();
                reset = 0;
            }

            if (stop == 1) {
                t.resume();
                stop = 0;
            }

        } else if (ae.getSource() == b2) {
            t.suspend();
            stop = 1;
        } else if (ae.getSource() == b3) {
            cnt = 0;
            hours = 0;
            minutes = 0;
            seconds = 0;
            sec = String.format("%02d", seconds);
            min = String.format("%02d", minutes);
            hrs = String.format("%02d", hours);
            tf1.setText(hrs + ":" + min + ":" + sec);
            reset = 1;
            t.suspend();
        }

    }

    @Override
    public void run() {

        try {
            while (val) {
                cnt += 1;
                System.out.print("h");
                hours = cnt / 3600;
                minutes = (cnt / 60) % 60;
                seconds = cnt % 60;

                sec = String.format("%02d", seconds);
                min = String.format("%02d", minutes);
                hrs = String.format("%02d", hours);
                tf1.setText(hrs + ":" + min + ":" + sec);
                tf1.setFont(new Font("Courier New", Font.BOLD, 24));
                Thread.sleep(1000);

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        new Prac2b().setVisible(true);

    }
}
