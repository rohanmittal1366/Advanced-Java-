
package rdemo_j1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class Rdemo_J9PanelTab {

    public Rdemo_J9PanelTab() {
        JFrame j = new JFrame();
        j.setSize(200,300);
        
        
        JTabbedPane jtp = new JTabbedPane();
        JPanel jp1 = new JPanel();
        JButton jb1 = new JButton("Button 1");
        jp1.add(jb1);
        
        JPanel jp2 = new JPanel();
        JButton jb2 = new JButton("Button 2");
        jp2.add(jb2);
        
        jtp.addTab("Tab 1", jp1);
        jtp.addTab("Tab 2", jp2);
        
        j.add(jtp);
        
        j.revalidate();
        j.repaint();
        j.setVisible(true);
        
        
        
    }
    public static void main(String[] args) {
        new Rdemo_J9PanelTab();
    }
}
;