//this pgm lets the user to get the factorial of a input number using swing

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;

public class factorial implements ActionListener{
    static JFrame f1;
    static JTextField t1,t2,t3;
    static JButton b1;
    public static void main(String []args){
        f1 = new JFrame("getting input from the user");
        t1 = new JTextField();
        // t2 = new JTextField();
        t3 =  new JTextField();
        b1 = new JButton("click me");

        t1.setBounds(10,10,100,40);
        // t2.setBounds(120,10,100,40);
        t3.setBounds(60,55,100,40);
        b1.setBounds(60,110,100,40);
        t3.setEditable(false);

        f1.add(t1);
        // f1.add(t2);
        f1.add(t3);
        f1.add(b1);

        factorial obj = new factorial();
        b1.addActionListener(obj);

        f1.setLayout(null);
        f1.setVisible(true);
        f1.setSize(500,500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num =  Integer.parseInt(t1.getText());
        
        int c=1;
        for (int i = 1; i <= num; i++) {
            c=c*i;
        }
        t3.setText(Integer.toString(c));    
        
    }
}
