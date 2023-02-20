import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class questionTwo implements ActionListener {
    static JFrame frame;
    static JTextField input1;
    static JTextField input2;
    static JTextField output;
    static JButton addButton;
    static JButton subtractButton;

    public static void main(String[] args) {
        //creating the object of the class
        questionTwo c = new questionTwo();

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Initialize the text fields
        input1 = new JTextField(10);
        input2 = new JTextField(10);
        output = new JTextField(10);
        output.setEditable(false);

        // Initialize the buttons
        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");

        // Add action listeners to the buttons
        addButton.addActionListener(c);
        subtractButton.addActionListener(c);

        // Create a panel to hold the input fields and buttons
        JPanel panel = new JPanel();
        panel.add(input1);
        panel.add(input2);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(output);

        // Add the panel to the frame
        frame.add(panel);

        // Display the frame
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {

        String str = event.getActionCommand();
        System.out.println(str);
        if (str.equals("Add")) {

            // Get the input values
            String input1Text = input1.getText();
            String input2Text = input2.getText();
            // Parse the input values as doubles
            double input1Value = Double.parseDouble(input1Text);
            double input2Value = Double.parseDouble(input2Text);
            // Calculate the result
            double result = input1Value + input2Value;
            // Set the result as the output text
            output.setText(Double.toString(result));
        } else if (str.equals("Subtract")) {
            // Get the input values
            String input1Text = input1.getText();
            String input2Text = input2.getText();
            // Parse the input values as doubles
            double input1Value = Double.parseDouble(input1Text);
            double input2Value = Double.parseDouble(input2Text);
            // Calculate the result
            double result = input1Value - input2Value;
            // Set the result as the output text
            output.setText(Double.toString(result));
        }
    }
}
