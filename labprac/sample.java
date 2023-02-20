//finding sum


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main implements ActionListener{
    static JFrame f1;
    static JTextField t1,t2;
    static JButton b1;
    public static void main(String []args){
        f1 = new JFrame("getting input from the user");
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("click me");

        t1.setBounds(10,10,100,40);
        t2.setBounds(120,10,100,40);
        b1.setBounds(80,60,100,40);

        f1.add(t1);
        f1.add(t2);
        f1.add(b1);

        b1.addActionListener(null);
        
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setSize(500,500);
    }

    public void actionPerformed(ActionEvent ae){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        int sum = a+b;
        t1.setText(Integer.toString(sum));

    }
}