import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swing_calculator implements ActionListener {
    static JFrame f;
    static JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, dot,
            star, clr, div, plus, minus, eq, del;
    static JTextField t;
    static String msg1 = "", msg2 = "", op = "";

    public static void main(String args[]) {
        swing_calculator c = new swing_calculator();
        f = new JFrame("swing_calculator");
        t = new JTextField();
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        dot = new JButton(".");
        clr = new JButton("C");
        star = new JButton("*");
        plus = new JButton("+");
        minus = new JButton("-");
        div = new JButton("/");
        eq = new JButton("=");
        del = new JButton("DEL");
        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(t);
        f.add(plus);
        f.add(minus);
        f.add(star);
        f.add(div);
        f.add(eq);
        f.add(dot);
        f.add(clr);
        f.add(del);
        b1.setBounds(70, 70, 50, 50);
        b2.setBounds(130, 70, 50, 50);
        b3.setBounds(190, 70, 50, 50);
        b4.setBounds(70, 130, 50, 50);
        b5.setBounds(130, 130, 50, 50);
        b6.setBounds(190, 130, 50, 50);
        b7.setBounds(70, 190, 50, 50);
        b8.setBounds(130, 190, 50, 50);
        b9.setBounds(190, 190, 50, 50);
        b0.setBounds(70, 250, 50, 50);
        plus.setBounds(250, 10, 50, 50);
        minus.setBounds(250, 70, 50, 50);
        star.setBounds(250, 130, 50, 50);
        div.setBounds(250, 190, 50, 50);
        dot.setBounds(130, 250, 50, 50);
        eq.setBounds(190, 250, 50, 50);
        clr.setBounds(250, 250, 50, 50);
        t.setBounds(70, 10, 180, 50);
        del.setBounds(70, 310, 180, 50);
        b0.addActionListener(c);
        b1.addActionListener(c);
        b2.addActionListener(c);
        b3.addActionListener(c);
        b4.addActionListener(c);
        b5.addActionListener(c);
        b6.addActionListener(c);
        b7.addActionListener(c);
        b8.addActionListener(c);
        b9.addActionListener(c);
        plus.addActionListener(c);
        minus.addActionListener(c);
        star.addActionListener(c);
        div.addActionListener(c);
        dot.addActionListener(c);
        eq.addActionListener(c);
        clr.addActionListener(c);
        del.addActionListener(c);
        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
    }

    double findop(String op, double m1, double m2) {
        char c = op.charAt(0);
        switch (c) {
            case '+':
                return m1 + m2;
            case '-':
                return m1 - m2;
            case '*':
                return m1 * m2;
            case '/':
                return m1 / m2;
        }
        return 0;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b0) {
            msg2 = msg2 + "0";
            t.setText(msg2);
        } else if (e.getSource() == b1) {
            msg2 = msg2 + "1";
            t.setText(msg2);
        } else if (e.getSource() == b2) {
            msg2 = msg2 + "2";
            t.setText(msg2);
        } else if (e.getSource() == b3) {
            msg2 = msg2 + "3";
            t.setText(msg2);
        } else if (e.getSource() == b4) {
            msg2 = msg2 + "4";
            t.setText(msg2);
        } else if (e.getSource() == b5) {
            msg2 = msg2 + "5";
            t.setText(msg2);
        } else if (e.getSource() == b6) {
            msg2 = msg2 + "6";
            t.setText(msg2);
        } else if (e.getSource() == b7) {
            msg2 = msg2 + "7";
            t.setText(msg2);
        } else if (e.getSource() == b8) {
            msg2 = msg2 + "8";
            t.setText(msg2);
        } else if (e.getSource() == b9) {
            msg2 = msg2 + "9";
            t.setText(msg2);
        } else if (e.getSource() == dot) {
            msg2 = msg2 + ".";
            t.setText(msg2);
        } else if (e.getSource() == clr) {
            msg2 = "";
            msg1 = "";
            op = "";
            t.setText(msg2);
        } else if (e.getSource() == plus) {
            msg1 = msg2;
            msg2 = "";
            op = "+";
            t.setText(msg1 + op);
        } else if (e.getSource() == minus) {
            msg1 = msg2;
            msg2 = "";
            op = "-";
            t.setText(msg1 + op);
        } else if (e.getSource() == star) {
            msg1 = msg2;
            msg2 = "";
            op = "*";
            t.setText(msg1 + op);
        } else if (e.getSource() == div) {
            msg1 = msg2;
            msg2 = "";
            op = "/";
            t.setText(msg1 + op);
        } else if (e.getSource() == eq) {
            double m1 = Double.parseDouble(msg1);
            double m2 = Double.parseDouble(msg2);
            m1 = findop(op, m1, m2);
            msg2 = Double.toString(m1);
            t.setText(msg2);
        } else if (e.getSource() == del) {
            String s = t.getText();
            t.setText("");
            for (int i = 0; i < s.length() - 1; i++)
                t.setText(t.getText() + s.charAt(i));
            msg2 = t.getText();
        }
    }
}