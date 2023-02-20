//this pgmn helps the user to find the sum of two input numbers in the textfields and prints the sum in the third one


import javax.swing.*;
import java.awt.event.*;

class Main implements ActionListener{
    static JFrame f1;
    static JTextField t1,t2,t3;
    static JButton b1;
    public static void main(String []args){
        f1 = new JFrame("getting input from the user");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 =  new JTextField();
        b1 = new JButton("click me");

        t1.setBounds(10,10,100,40);
        t2.setBounds(120,10,100,40);
        t3.setBounds(60,55,100,40);
        b1.setBounds(60,110,100,40);
        t3.setEditable(false);

        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(b1);

        Main obj = new Main();
        b1.addActionListener(obj);

        f1.setLayout(null);
        f1.setVisible(true);
        f1.setSize(500,500);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        int a =  Integer.parseInt(t1.getText());
        int b  = Integer.parseInt(t2.getText());
        int sum = a+b;
        t3.setText(Integer.toString(sum));    
        
    }
}