//some error in the code (ignore this file)

import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class readingFile implements ActionListener {
    static JFrame f;
    static JTextField roll, name, mark1, mark2, mark3,finaField;
    static JButton b, retriveData;

    public static void main(String[] args) {
        f = new JFrame("calculate total");
        roll = new JTextField(10);
        name = new JTextField(10);
        mark1 = new JTextField(10);
        mark2 = new JTextField(10);
        mark3 = new JTextField(10);
        finaField = new JTextField(10);
        b = new JButton("calculate");
        retriveData = new JButton("retrieve");

        roll.setBounds(10,10,100,40);
        name.setBounds(10,60,100,40);
        mark1.setBounds(10,110,100,40);
        mark2.setBounds(10,160,100,40);
        mark3.setBounds(10,210,100,40);
        finaField.setBounds(10,260,100,40);
        b.setBounds(140,110,100,40);
        retriveData.setBounds(140,160,100,40);

        b.addActionListener(new readingFile());
        f.add(roll);
        f.add(name);
        f.add(mark1);
        f.add(mark2);
        f.add(mark3);
        f.add(finaField);
        f.add(b);
        f.add(retriveData);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500, 500);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        int sum=0;
        if (e.getSource() == retriveData) {
            try {
                FileReader fr = new FileReader("hello.txt");
                int i;
                String line;
                int count = 0;

                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    

                    if (count < 3) {
                        count++;
                        continue;
                    } else {
                        int tokencount =0;
                        StringTokenizer st = new StringTokenizer(line, " ");
                        while (st.hasMoreTokens()) {
                            String token = st.nextToken();
                            int m1 =0, m2 =0 , m3=0;
                            if (tokencount == 0){
                                roll.setText(token);
                                System.out.println(token);
                            }else if (tokencount == 1){
                                name.setText(token);
                                System.out.println(token);
                            }else if (tokencount == 2) {
                                mark1.setText(token);
                                m1 = Integer.parseInt(token);
                            } else if (tokencount == 3) {
                                mark2.setText(token);
                                m2 = Integer.parseInt(token);
                            } else if (tokencount == 4) {
                                mark3.setText(token);
                                m3 = Integer.parseInt(token);
                            }
                            sum = m1+m2+m3;
                            tokencount++;
                        }
                        count++;
                    }
                }

            } catch (IOException ae) {
                ae.printStackTrace();
            }
        }
        else { 
            finaField.setText(Integer.toString(sum));
        }
    }
}
