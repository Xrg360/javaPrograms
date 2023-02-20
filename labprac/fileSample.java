//this pgm lets the user to save the string inside a textfield to a file

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;

class fileSample implements ActionListener {
    static JTextField t;
    static JButton save;
    static JFrame f;

    public static void main(String[] args) {
        f = new JFrame("Files Java");
        t = new JTextField();
        save = new JButton("save");

        t.setBounds(10, 10, 200, 50);
        save.setBounds(10, 70, 75, 50);

        fileSample obj = new fileSample();
        save.addActionListener(obj);

        f.add(t);
        f.add(save);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500, 500);
    }

    public void actionPerformed(java.awt.event.ActionEvent ae) {
        try {
            String str;

            str = t.getText();
            File f = new File("hello.txt");

            FileWriter fw = new FileWriter(f);
            fw.write(str);
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}