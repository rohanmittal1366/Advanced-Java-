
package rdemo_j1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;


public class JT_Practical2b implements ActionListener,Runnable
{
 JLabel disp;
 JButton btn;
 boolean stop=false;
 int i,j,k,l;
 public JT_Practical2b()
 {
  disp=new JLabel();
  btn=new JButton("Start");
  //disp.setFont(new Font("Helvetica",Font.PLAIN,20));
  //disp.setBackground(Color.cyan);
  //disp.setForeground(Color.red);
  JFrame c= new JFrame();
   c.setSize(500,100);
  c.setVisible(true);
  c.setTitle("StopWatch");
  c.setDefaultCloseOperation(EXIT_ON_CLOSE);
  
  //Container c=getContentPane();
  c.setLayout(new FlowLayout());
  c.add(disp); c.add(btn);
  btn.addActionListener(this);
 }
 public void run()
 {
  for(i=0;;i++)
  {
   for(j=0;j< 60;j++)
   {
    for(k=0;k< 60;k++)
    {
     for(l=0;l< 100;l++)
     {
      if(stop)
      {
       break;
      }
      NumberFormat nf = new DecimalFormat("00");
      disp.setText(nf.format(i)+":"+nf.format(j)+":"+nf.format(k)+":"+nf.format(l));
      try{
       Thread.sleep(10);
      }catch(Exception e){}
     }
    }
   }
  }
 }
 public void actionPerformed(ActionEvent ae)
 {
  Thread t=new Thread(this);
  if(ae.getActionCommand().equals("Start"))
  {
   t.start();
   btn.setText("Stop");
  }
  else
  {
   stop=true;
  }
 }
 public static void main(String[] args) 
 {
  JT_Practical2b s=new JT_Practical2b();
 
 }
}