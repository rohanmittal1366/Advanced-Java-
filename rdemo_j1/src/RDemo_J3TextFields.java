package rdemo_j1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.MaskFormatter;

public class RDemo_J3TextFields {

    public RDemo_J3TextFields() throws ParseException {

        JFrame j = new JFrame("TextComponents-3");
        j.setSize(275, 100);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);

        JTextField jf = new JTextField("Username");
        JPasswordField jpf = new JPasswordField("abc");
        j.add(jf);
        j.add(jpf);
        jpf.setEditable(false);
        jpf.setEchoChar('#');
        j.setLayout(new GridLayout());
        JTextArea jta = new JTextArea(5, 5);
        j.add(jta);
        //jta.setLineWrap(true);

        jta.append(String.valueOf(jta.getCaretPosition()));

        JScrollPane p = new JScrollPane(jta);
        p.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        // p.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        j.add(p);

        jf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    jta.append(jf.getText());
                    jta.append(" " + jta.getCaretPosition());
                    jf.setText(jf.getSelectedText());
                }
            }
        });

        DateFormat df = new SimpleDateFormat("dd-MM-yy");
        //JFormattedTextField jftf = new JFormattedTextField(df);
        //j.add(jftf);

        MaskFormatter mask = new MaskFormatter("L-U");
        mask.setPlaceholderCharacter('_');
        JFormattedTextField jftf = new JFormattedTextField(mask);
        j.add(jftf);
        /* NumberFormat nf = new DecimalFormat("##.#");
        JFormattedTextField jftf = new JFormattedTextField(nf);
         j.add(jftf);*/
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    new RDemo_J3TextFields();
                } catch (ParseException ex) {
                    Logger.getLogger(RDemo_J3TextFields.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
