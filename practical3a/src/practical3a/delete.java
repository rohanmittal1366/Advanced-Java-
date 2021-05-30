package practical3a;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

public class delete extends JPanel implements ActionListener {

    JComboBox jtf1;
    JLabel jl1;
    JButton jb1, jb2;

    delete() {
        setPreferredSize(new Dimension(1000, 800));
        setFocusable(true);

        jl1 = new JLabel("Enter the Username to delete : ");
        jl1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jl1.setBounds(20, 50, 300, 30);
        add(jl1);

        jtf1 = new JComboBox();
        jtf1.setBounds(300, 60, 150, 20);

        try {
            conn c = new conn();
            String str = "select * from student";
            ResultSet rs = null;
            PreparedStatement pst = null;
            pst = (PreparedStatement) c.c.prepareStatement(str);
            rs = pst.executeQuery(str);
            while (rs.next()) {
                jtf1.addItem(rs.getString("username"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        add(jtf1);

        jb1 = new JButton("Delete");
        jb1.setBackground(Color.black);
        jb1.setForeground(Color.white);
        jb1.setBounds(100, 150, 120, 30);
        jb1.addActionListener(this);
        add(jb1);

        jb2 = new JButton("Check");
        jb2.setBackground(Color.black);
        jb2.setForeground(Color.white);
        jb2.setBounds(220, 150, 120, 30);
        jb2.addActionListener(this);
        add(jb2);

        setBackground(Color.white);
        setLayout(null);
        revalidate();
        repaint();
        setVisible(true);
    }

    public static void main(String args[]) {
        new delete();
    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == jb1) {
            try {
                conn c = new conn();
                String str = (String) jtf1.getSelectedItem();
                String str1 = "delete from student where username = '" + str + "'";
                PreparedStatement pst = (PreparedStatement) c.c.prepareStatement(str1);

                int x = JOptionPane.showConfirmDialog(null, "Please Confirm ", "Confirm", JOptionPane.OK_CANCEL_OPTION);

                if (x == 0) {
                    pst.executeUpdate(str1);
                    JOptionPane.showMessageDialog(null, "Deleted Succesfully");
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (a.getSource() == jb2) {

            try {
                conn c = new conn();
                jtf1.removeAllItems();
                String str = "select * from student";
                ResultSet rs = null;
                PreparedStatement pst = null;
                pst = (PreparedStatement) c.c.prepareStatement(str);
                rs = pst.executeQuery(str);
                while (rs.next()) {
                    jtf1.addItem(rs.getString("username"));
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }
}
