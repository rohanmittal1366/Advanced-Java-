package practical3a;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import javax.swing.text.MaskFormatter;

public class insert extends JPanel implements ActionListener {

    JTextField jtf1, jtf2, jtf3, jtf4, jtf6;
    JLabel jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8, jl9, jl10;
    JPasswordField jtf5;
    MaskFormatter mf1;
    JFormattedTextField jft1;
    JRadioButton r1, r2;
    JComboBox cb;
    JCheckBox jc1, jc2, jc3, jc4;
    JSpinner jlst1;
    JButton jb1, jb2, b1, b2;
    ButtonGroup bg, bg2;

    insert() {

        setPreferredSize(new Dimension(1000, 800));
        setFocusable(true);

        JLabel jl0 = new JLabel("INSERT");
        jl0.setBounds(550, 10, 300, 90);
        add(jl0);

        jl1 = new JLabel("Name");
        jl1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jl1.setBounds(20, 50, 120, 30);
        add(jl1);

        jtf1 = new JTextField();
        jtf1.setBounds(180, 50, 150, 20);
        add(jtf1);

        jl2 = new JLabel("Age");
        jl2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jl2.setBounds(20, 90, 120, 30);
        add(jl2);

        jtf2 = new JTextField();
        jtf2.setBounds(180, 90, 150, 20);
        add(jtf2);

        jl3 = new JLabel("Roll No");
        jl3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jl3.setBounds(20, 140, 120, 30);
        add(jl3);

        jtf3 = new JTextField();
        jtf3.setBounds(180, 140, 150, 20);
        add(jtf3);

        jl4 = new JLabel("Email");
        jl4.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jl4.setBounds(20, 190, 120, 30);
        add(jl4);

        try {
            mf1 = new MaskFormatter("##UUU###@gmail.com");
        } catch (Exception e) {
        }

        jft1 = new JFormattedTextField(mf1);
        jft1.setBounds(180, 190, 150, 20);
        add(jft1);

        jl5 = new JLabel("Gender");
        jl5.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jl5.setBounds(20, 240, 120, 30);
        add(jl5);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        r1.setBackground(Color.white);
        r1.setBounds(180, 240, 70, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        r2.setBackground(Color.white);
        r2.setBounds(250, 240, 70, 30);
        add(r2);

        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        jl6 = new JLabel("Language");
        jl6.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jl6.setBounds(20, 290, 120, 30);
        add(jl6);

        jc1 = new JCheckBox("English");
        jc1.setBounds(180, 290, 80, 30);
        add(jc1);
        jc2 = new JCheckBox("Hindi");
        jc2.setBounds(290, 290, 80, 30);
        add(jc2);
        jc3 = new JCheckBox("Gujarati");
        jc3.setBounds(400, 290, 80, 30);
        add(jc3);
        jc4 = new JCheckBox("French");
        jc4.setBounds(510, 290, 80, 30);
        add(jc4);

        bg2 = new ButtonGroup();
        bg2.add(jc1);
        bg2.add(jc2);
        bg2.add(jc3);
        bg2.add(jc4);

        jl7 = new JLabel("Semester");
        jl7.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jl7.setBounds(20, 340, 120, 30);
        add(jl7);

        String[] str = {"1", "2", "3", "4", "5", "6", "7", "8"};
        jlst1 = new JSpinner(new SpinnerListModel(str));
        jlst1.setBounds(180, 340, 150, 20);
        add(jlst1);

        jl8 = new JLabel("Username");
        jl8.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jl8.setBounds(20, 390, 120, 30);
        add(jl8);

        jtf4 = new JTextField();
        jtf4.setBounds(180, 390, 150, 20);
        add(jtf4);

        jl9 = new JLabel("Password");
        jl9.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jl9.setBounds(20, 440, 120, 30);
        add(jl9);

        jtf5 = new JPasswordField();
        jtf5.setBounds(180, 440, 150, 20);
        add(jtf5);

        jl10 = new JLabel("Address");
        jl10.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jl10.setBounds(20, 490, 120, 35);
        add(jl10);

        jtf6 = new JTextField();
        jtf6.setBounds(180, 490, 150, 20);
        add(jtf6);

        jb1 = new JButton("Submit");
        jb1.setBackground(Color.black);
        jb1.setForeground(Color.white);
        jb1.setBounds(40, 560, 120, 30);
        jb1.addActionListener(this);
        add(jb1);

        jb2 = new JButton("Cancel");
        jb2.setBackground(Color.black);
        jb2.setForeground(Color.white);
        jb2.setBounds(210, 560, 120, 30);
        jb2.addActionListener(this);
        add(jb2);

//        ImageIcon i1 = new ImageIcon(getClass().getResource("practical3a/images.png"));
//        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel jl10 = new JLabel(i3);
//        jl10.setBounds(160, 2, 200, 200);
//        add(jl10);
        setBackground(Color.white);
        setLayout(null);
        revalidate();
        repaint();
        setVisible(true);
    }

    public static void main(String args[]) {
        new insert();
    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == jb1) {

            try {
                System.out.println("hi");

                conn c = new conn();
                String name = jtf1.getText();
                String age = jtf2.getText();
                String roll = jtf3.getText();
                String email = jft1.getText();
                String gender = null;

                if (r1.isSelected()) {
                    gender = "Male";
                } else if (r2.isSelected()) {
                    gender = "Female";
                }

                String lang = null;
                if (jc1.isSelected()) {
                    lang = "English";
                } else if (jc2.isSelected()) {
                    lang = "Hindi";
                } else if (jc3.isSelected()) {
                    lang = "Gujarat";
                } else if (jc4.isSelected()) {
                    lang = "French";
                }

                String sem = (String) jlst1.getValue();
                String user = jtf4.getText();
                String pass = jtf5.getText();
                String add = jtf6.getText();
                //System.out.println(sem);

                String str = "insert into student value('" + name + "','" + roll + "','" + email + "','" + gender + "','" + lang + "','" + sem + "','" + user + "','" + pass + "','" + add + "','" + age + "');";

                try {

                    int x = JOptionPane.showConfirmDialog(null, "Please Confirm ", "Confirm", JOptionPane.OK_CANCEL_OPTION);

                    if (x == 0) {
                        c.s.executeUpdate(str);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (a.getSource() == jb2) {

            jtf1.setText("");
            jtf2.setText("");
            jtf3.setText("");
            jtf4.setText("");
            jtf5.setText("");
            jtf6.setText("");

        }
    }

}
