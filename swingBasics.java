import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;
/**
 * swingBasics
 */
public class swingBasics implements ActionListener {
    static JFrame f;
    static JTextField t1,t2,t3;
    static JButton b1,b2;
    String sum;

    public static void main(String[] args) {   
       f= new JFrame("normal calculator");
    //    t1 = new JTextField();
    //    t1.setBounds(50,50,100,50);
    //    t2 = new JTextField();
    //    t2.setBounds(250,50,100,50);
    //    t3 = new JTextField();
    //    t3.setBounds(100,100,100,50);
    //    b1 = new JButton("+");
    //    b1.setBounds(60,200,50,25);
       b2 = new JButton("+");
       b2.setBounds(60,100,50,25);
       swingBasics obj = new swingBasics();
    //    b1.addActionListener(obj);
       b2.addActionListener(obj);
    //    f.add(t1);
    //    f.add(t2);
    //    f.add(t3);
    //    f.add(b1);
       f.add(b2);
       f.setVisible(true);
       f.setLayout(null);
       f.setSize(600,600);
    }
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        int a=  Integer.parseInt(t1.getText());
        int b=  Integer.parseInt(t1.getText());
        if(str.equals("+")){
            sum = "";
            sum += (a+b);
        }
        else{
            sum = "";
            sum += (a-b);
        }
        t3.setText(sum);
    }
}