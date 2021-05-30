
package rdemo_j1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;


public class RDemo_J17Menu {

    public RDemo_J17Menu() {
    JFrame jf = new JFrame("Menu Example");
    jf.setLayout(new FlowLayout());
    jf.setSize(500,500);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JMenuBar menuBar;
    JMenu menu, submenu;
    JMenuItem menuItem1,menuItem2,menuItem3;
    JRadioButtonMenuItem rbMenuItem;
    JCheckBoxMenuItem cbMenuItem;
;
    //Create the menu bar.
    menuBar = new JMenuBar();

    //Build the first menu.
    menu = new JMenu("A Menu");
    menu.setMnemonic(KeyEvent.VK_A);

    menuBar.add(menu);

    //a group of JMenuItems
    menuItem1 = new JMenuItem("A text-only menu item",
                             KeyEvent.VK_T);
    menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
    
    menu.add(menuItem1);

    menuItem1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Selected");
        }
    });
    
    menuItem2 = new JMenuItem("Item 2");
    menuItem2.setMnemonic(KeyEvent.VK_B);
    menu.add(menuItem2);

    menuItem3 = new JMenuItem("Item 3");
    menuItem3.setMnemonic(KeyEvent.VK_D);
    menu.add(menuItem3);

    //a group of radio button menu items
    menu.addSeparator();
    ButtonGroup group = new ButtonGroup();
    rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
    rbMenuItem.setSelected(true);
    rbMenuItem.setMnemonic(KeyEvent.VK_R);
    group.add(rbMenuItem);
    menu.add(rbMenuItem);

    rbMenuItem = new JRadioButtonMenuItem("Another one");
    rbMenuItem.setMnemonic(KeyEvent.VK_O);
    group.add(rbMenuItem);
    menu.add(rbMenuItem);

    //a group of check box menu items
    menu.addSeparator();
    cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
    cbMenuItem.setMnemonic(KeyEvent.VK_C);
    menu.add(cbMenuItem);

    cbMenuItem = new JCheckBoxMenuItem("Another one");
    cbMenuItem.setMnemonic(KeyEvent.VK_H);
    menu.add(cbMenuItem);

    //a submenu
    menu.addSeparator();
    submenu = new JMenu("A submenu");
    submenu.setMnemonic(KeyEvent.VK_S);

    menuItem3 = new JMenuItem("An item in the submenu");

    submenu.add(menuItem3);

    menuItem3 = new JMenuItem("Another item");
    submenu.add(menuItem3);
    menu.add(submenu);

    //Build second menu in the menu bar.
    menu = new JMenu("Another Menu");
    menu.setMnemonic(KeyEvent.VK_N);

    menuBar.add(menu);
    

    jf.setJMenuBar(menuBar);
    
 
    
    jf.setVisible(true);
    
    }
    
    public static void main(String[] args) {
        new RDemo_J17Menu();
    }
    
}
