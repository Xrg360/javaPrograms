//this pgm lets the user to save and retrieve data from a file using swing classes

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;

class Fileimp implements ActionListener {
    static JTextField t;
    static JButton save, view;
    static JFrame f;

    public static void main(String[] args) {
        f = new JFrame("Files Java");
        t = new JTextField();
        save = new JButton("save");
        view = new JButton("view");

        t.setBounds(10, 10, 200, 50);
        save.setBounds(10, 70, 75, 50);
        view.setBounds(100, 70, 75, 50);

        Fileimp obj = new Fileimp();
        save.addActionListener(obj);
        view.addActionListener(obj);

        f.add(t);
        f.add(save);
        f.add(view);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500, 500);
    }
    public void actionPerformed(java.awt.event.ActionEvent ae) {
        try {
            String str;
            if (ae.getSource() == save) {
                str = t.getText();
                File f = new File("hai.txt");
                FileWriter fw = new FileWriter(f);
                fw.write(str);
                fw.close();
            } else {
                str = "";
                File f = new File("hai.txt");
                FileReader fr = new FileReader(f);
                int i;
                while ((i = fr.read()) != -1) {
                    str += (char) i;
                }
                t.setText(str);
                fr.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
