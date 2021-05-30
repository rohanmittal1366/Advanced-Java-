
package p1;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
Create a swing program that displays a window containing four buttons and a label. The first button says “Click here”, and the other three buttons say “Not here”. 
If one of the “Not here” buttons is clicked, the label displays the message “Wrong, try again”. If the “click here” button is clicked, then the label displays “Good job. 
Do it again”. Also, each time the “Click here” button is clicked, a new button is randomly chosen and given the text “Click here” and the other three buttons are given the 
text “Not here”. The application quits when user clicks 10 times “Click here” button.
*/




public class swingpractical2 {

    
    
    public static void main(String[] args) {
       
        JFrame jf = new JFrame("Practical 2");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(470,220,400,400);
        
     
        JButton jb1 = new JButton("Click Here");
        JButton jb2 = new JButton("Not Here");
        JButton jb3 = new JButton("Not Here");
        JButton jb4 = new JButton("Not Here");
        
        JLabel j1 = new JLabel("Click button to start");
        
        jf.setLayout(new BorderLayout());
        
        jf.add(jb1,BorderLayout.NORTH);
        jf.add(jb2,BorderLayout.SOUTH);
        jf.add(jb3,BorderLayout.WEST);
        jf.add(jb4,BorderLayout.EAST);
        
        jf.add(j1,BorderLayout.CENTER);
        final c int count=0;
        System.out.println(count);
        jb1.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
                       count++;
                       String str  = jb1.getText();
                       if(str.equals("Click Here"))
                       {
                           j1.setText("Good job, do it again");
                           int x = (int)((Math.random())*4);
                           //System.out.println(x);
                           if(x==2)
                           {
                               jb2.setText("Click Here");
                               jb1.setText("Not Here");
                           }
                           if(x==3)
                           {
                               jb3.setText("Click Here");
                               jb1.setText("Not Here");
                           }
                           if(x==4)
                           {
                               jb4.setText("Click Here");
                               jb1.setText("Not Here");
                           }
                         
                       }
                           else
                               j1.setText("Wrong , Try Again");
                   } 
        });
        
        jb2.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
                       count++;
                       String str  = jb2.getText();
                       if(str.equals("Click Here"))
                       {
                           j1.setText("Good job, do it again");
                           int x = (int)((Math.random())*4);
                           //System.out.println(x);
                           if(x==1)
                           {
                               jb1.setText("Click Here");
                               jb2.setText("Not Here");
                           }
                           if(x==3)
                           {
                               jb3.setText("Click Here");
                               jb2.setText("Not Here");
                           }
                           if(x==4)
                           {
                               jb4.setText("Click Here");
                               jb2.setText("Not Here");
                           }
                         
                       }
                           else
                               j1.setText("Wrong , Try Again");
                   } 
        });
        
        
        jb3.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
                       count++;
                       String str  = jb3.getText();
                       if(str.equals("Click Here"))
                       {
                           j1.setText("Good job, do it again");
                           int x = (int)((Math.random())*4);
                           //System.out.println(x);
                           if(x==2)
                           {
                               jb2.setText("Click Here");
                               jb3.setText("Not Here");
                           }
                           if(x==1)
                           {
                               jb1.setText("Click Here");
                               jb3.setText("Not Here");
                           }
                           if(x==4)
                           {
                               jb4.setText("Click Here");
                               jb3.setText("Not Here");
                           }
                         
                       }
                           else
                               j1.setText("Wrong , Try Again");
                   } 
        });
        
        jb4.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
                       count++;
                       String str  = jb4.getText();
                       if(str.equals("Click Here"))
                       {
                           j1.setText("Good job, do it again");
                           int x = (int)((Math.random())*4);
                           //System.out.println(x);
                           if(x==2)
                           {
                               jb2.setText("Click Here");
                               jb4.setText("Not Here");
                           }
                           if(x==3)
                           {
                               jb3.setText("Click Here");
                               jb4.setText("Not Here");
                           }
                           if(x==1)
                           {
                               jb1.setText("Click Here");
                               jb4.setText("Not Here");
                           }
                       }
                           else
                               j1.setText("Wrong , Try Again");
                   } 
        });
        
        jf.setVisible(true);
    }    
}
