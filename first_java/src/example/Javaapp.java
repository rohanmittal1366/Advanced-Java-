import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Timer;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Frame extends JFrame implements ActionListener{
  
    private int time = 1;
    private JButton jb;
    private Timer timer;
    
    Frame(int t)
    {
        time += t;
        setTitle("Timer test");
        setLayout(new FlowLayout());
        setTimer();
        setSize(700,350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void setTimer()
    {
        jb = new JButton("Waiting...");
        add(jb);
        timer = new Timer(1000,this);
        timer.start();
    }   
    
    public void actionPerformed(ActionEvent eve)
    {
        time--;
        if(time>=1)
        {
            jb.setText("Time : "+time);
        }else{
            jb.setText("Ok");
            timer.stop();
        }
    }
}

public class Javaapp {
   
    public static void main(String[] args) {
        
       Frame fr = new Frame(5);
    }
}