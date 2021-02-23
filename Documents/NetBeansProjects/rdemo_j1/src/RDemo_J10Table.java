
package rdemo_j1;

import java.util.Enumeration;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableColumnModelListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;


public class RDemo_J10Table {

    public RDemo_J10Table() {
    
    JFrame f = new JFrame("JLabel Demo");
    
    f.setSize(500, 500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    String[] u_col = {"No" , "Name" , "Present"};
    Object u_data[][] = {
        {new Integer(5),"abc",new Boolean(true)},
        {new Integer(2),"def",new Boolean(false)}
    };
    
    DefaultTableModel tm = new DefaultTableModel(u_data, u_col);
    JTable jtab = new JTable(tm);
    jtab.setRowSelectionAllowed(true);
    jtab.enableInputMethods(false);
      
   // f.add(jtab);
    TableColumn tc = jtab.getColumnModel().getColumn(1);
    System.out.println(tc.getWidth());    
    jtab.setAutoCreateRowSorter(true);
            
    JScrollPane js = new JScrollPane(jtab);
    jtab.setFillsViewportHeight(true);
    f.add(js);
    
    
    
    jtab.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            int row = jtab.getSelectedRow();

            if(row!=-1)
            tm.removeRow(jtab.convertRowIndexToModel(jtab.getSelectedRow()));
 
        }
    });
    
    jtab.getModel().addTableModelListener(new TableModelListener() {
        @Override
        public void tableChanged(TableModelEvent e) {
            
        }
    });
    
    f.setVisible(true);
    }
 
    public static void main(String[] args) {
        
        new RDemo_J10Table();
    }
    
}
