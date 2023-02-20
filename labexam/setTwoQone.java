import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

class Calculator {
  private JFrame frame;
  private JTextField input1;
  private JTextField input2;
  private JTextField output;
  private JButton addButton;
  private JButton subtractButton;

  public Calculator() {
    // Initialize the frame
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
    addButton.addActionListener(new AdditionListener());
    subtractButton.addActionListener(new SubtractListener());

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

  // Action listener for the add button
  class AdditionListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
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
    }
  }

  // Action listener for the subtract button
  class SubtractListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
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

  public static void main(String[] args) {
    new Calculator();
  }
}