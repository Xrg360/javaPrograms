//this is a auto generated code (ignore)


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Marks Reader");
    frame.setLayout(new FlowLayout());
    frame.setSize(500, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel labelRoll = new JLabel("Enter Roll No.");
    JTextField fieldRoll = new JTextField(10);
    JButton button = new JButton("Get Marks");

    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          int roll = Integer.parseInt(fieldRoll.getText());
          int marks[] = getMarks(roll);
          if (marks == null) {
            JOptionPane.showMessageDialog(frame, "Roll No. not found!");
            return;
          }
          int sum = marks[0] + marks[1] + marks[2];
          float avg = (float) sum / 3;
          JOptionPane.showMessageDialog(frame, "Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2] + "\nSum: " + sum + "\nAvg: " + avg);
        } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(frame, "Invalid Roll No.!");
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(frame, "Error reading file!");
        }
      }
    });

    frame.add(labelRoll);
    frame.add(fieldRoll);
    frame.add(button);

    frame.setVisible(true);
  }

  private static int[] getMarks(int roll) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("marks.txt"));
    String line;
    while ((line = br.readLine()) != null) {
      String parts[] = line.split("\t");
      if (Integer.parseInt(parts[0]) == roll) {
        int marks[] = new int[3];
        marks[0] = Integer.parseInt(parts[2]);
        marks[1] = Integer.parseInt(parts[3]);
        marks[2] = Integer.parseInt(parts[4]);
        br.close();
        return marks;
      }
    }
    br.close();
    return null;
  }
}
