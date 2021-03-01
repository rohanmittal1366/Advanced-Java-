

package practical3a;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class view extends JPanel implements ActionListener{
   
    JTable t1;
    JButton b1, b2;
    view()
    {
        
        setPreferredSize(new Dimension(1000, 600));
        setFocusable(true);
        t1 = new JTable();
        t1.setBounds(0, 40, 1000, 400);
        add(t1);
        
        JLabel jl2 = new JLabel("Name");
        jl2.setBounds(15, 10, 100, 20);
        jl2.setForeground(Color.black);
        jl2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(jl2);

        JLabel jl4 = new JLabel("Roll no");
        jl4.setBounds(125, 10, 70, 20);
        jl4.setForeground(Color.black);
        jl4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(jl4);

        JLabel jl5 = new JLabel("Email");
        jl5.setBounds(225, 10, 100, 20);
        jl5.setForeground(Color.black);
        jl5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(jl5);

        JLabel jl6 = new JLabel("Gender");
        jl6.setBounds(325, 10, 100, 20);
        jl6.setForeground(Color.black);
        jl6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(jl6);

        JLabel jl7 = new JLabel("Language");
        jl7.setBounds(420, 10, 100, 20);
        jl7.setForeground(Color.black);
        jl7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(jl7);

        JLabel jl8 = new JLabel("Semester");
        jl8.setBounds(520, 10, 100, 20);
        jl8.setForeground(Color.black);
        jl8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(jl8);

        JLabel jl9 = new JLabel("Username");
        jl9.setBounds(620, 10, 100, 20);
        jl9.setForeground(Color.black);
        jl9.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(jl9);
        
        JLabel jl3 = new JLabel("Password");
        jl3.setBounds(715, 10, 100, 20);
        jl3.setForeground(Color.black);
        jl3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(jl3);
        
        JLabel jl13 = new JLabel("Address");
        jl13.setBounds(820, 10, 100, 20);
        jl13.setForeground(Color.black);
        jl13.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(jl13);
        
        JLabel jl10 = new JLabel("Age");
        jl10.setBounds(920, 10, 70, 20);
        jl10.setForeground(Color.black);
        jl10.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(jl10);

        
        b1 = new JButton("Load Data");
        b1.setBounds(400, 500, 120, 30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

       
        setBackground(Color.white);
        setLayout(null);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        
        
    }

    public static void main(String args[]) {
        new view();
    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == b1) {
            try {
                conn c = new conn();
                String str = "select * from student";
                ResultSet rs = c.s.executeQuery(str);

                t1.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception e) {
                System.out.println(e);
            }
        
        }
    }
    
}
