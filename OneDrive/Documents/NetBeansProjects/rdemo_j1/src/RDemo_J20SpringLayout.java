
package rdemo_j1;

import java.awt.Container;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class RDemo_J20SpringLayout {
    
    RDemo_J20SpringLayout()
    {
        JFrame frame = new JFrame("Spring Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Set up the content pane.
        Container contentPane = frame.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);

        //Create and add the components.
        JLabel label = new JLabel("Label: ");
        JTextField textField = new JTextField("Text field", 15);
        contentPane.add(label);
        contentPane.add(textField);

        //Adjust constraints for the label so it's at (5,5).
        layout.putConstraint(SpringLayout.WEST, label,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, label,
                             5,
                             SpringLayout.NORTH, contentPane);

        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        layout.putConstraint(SpringLayout.WEST, textField,
                             5,
                             SpringLayout.EAST, label);
        layout.putConstraint(SpringLayout.NORTH, textField,
                             5,
                             SpringLayout.NORTH, contentPane);

       /* layout.putConstraint(SpringLayout.EAST, contentPane,
                             5,
                             SpringLayout.EAST, textField);
        layout.putConstraint(SpringLayout.SOUTH, contentPane,
                             5,
                              SpringLayout.SOUTH, textField);*/
        
PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
for (int i = 0; i < services.length; i++) {
System.out.println(services[i].getName());
}        

//Display the window.

        frame.pack();
        frame.setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        
        
        new RDemo_J20SpringLayout();
    }
    
}
