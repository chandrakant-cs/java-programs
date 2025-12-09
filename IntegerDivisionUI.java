import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerDivisionUI extends JFrame implements ActionListener {

    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;

    public IntegerDivisionUI() {
        setTitle("Integer Division");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10)); // Rows, Cols, HGap, VGap

        // Create components
        JLabel num1Label = new JLabel("Num1:");
        num1Field = new JTextField(10);
        JLabel num2Label = new JLabel("Num2:");
        num2Field = new JTextField(10);
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField(10);
        resultField.setEditable(false); // Result field should not be editable by user
        divideButton = new JButton("Divide");

        // Add components to the frame
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(new JLabel()); // Empty label for spacing
        add(divideButton);

        // Add action listener to the button
        divideButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == divideButton) {
            try {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());

                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }

                int result = num1 / num2;
                resultField.setText(String.valueOf(result));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input: Please enter integers only.", "Input Error", JOptionPane.ERROR_MESSAGE);
                resultField.setText(""); // Clear result field on error
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                resultField.setText(""); // Clear result field on error
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(IntegerDivisionUI::new);
    }
}