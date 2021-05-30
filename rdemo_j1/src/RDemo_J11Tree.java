
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class RDemo_J11Tree {

    public RDemo_J11Tree() {
        JFrame f = new JFrame("JLabel Demo");

        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tree : Root, Branch Node & Leaf Nodes; Hidden or Collapsed
        // Two Models: TreeModel & TreeSelectionModel
        // 3 used Events: TreeExpansionEvent, TreeSelectionEvent & TreeModelEvent ( when tree structure or data changes)
        // TreeNode Interface : stores all info. about tree
        // MutableTreeNode: methods to insert or remove childs or change parent nodes
        /*DefaultMutableTreeNode: To represent a single node in tree
    provides operations for examining and modifying a node's parent and children
    and also operations for examining the tree that the node is a part of.*/
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Alphabet");
        // Create subtree of "A".
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        a.add(a2);

        JTree jt = new JTree(top);
        f.add(jt);

        JLabel jl = new JLabel("Selection : ");
        f.add(jl, BorderLayout.SOUTH);

        jt.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                JTree jt1 = (JTree) e.getSource();
                DefaultMutableTreeNode df = (DefaultMutableTreeNode) jt1.getLastSelectedPathComponent();
                //jl.setText("Selection: "+e.getPath().toString());
                if (df != null) {
                    jl.setText("Selection: " + df.toString());
                }
                //jl.setText("Selection: "+df.toString()+df.isLeaf());
                if (df.isLeaf()) {
                    DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("A3");
                    df.add(a3);
                }

            }
        });

        jt.addTreeExpansionListener(new TreeExpansionListener() {
            @Override
            public void treeExpanded(TreeExpansionEvent event) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                jl.setText(jl.getText() + " Expanded");
            }

            @Override
            public void treeCollapsed(TreeExpansionEvent event) {
                jl.setText(jl.getText() + " Collapsed");
                jt.putClientProperty("JTree.lineStyle", "Horizontal");
            }
        });

        f.setVisible(true);

    }

    public static void main(String[] args) {
        new RDemo_J11Tree();
    }
}
