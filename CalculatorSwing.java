import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorSwing extends JFrame implements ActionListener {

    JTextField num1, num2, result;
    JButton add, subtract, multiply, divide, modulus;

    CalculatorSwing() {

        setTitle("Calculator");

        setLayout(new FlowLayout());

        JLabel label1 = new JLabel("First Number:");
        num1 = new JTextField(10);

        JLabel label2 = new JLabel("Second Number:");
        num2 = new JTextField(10);

        JLabel label3 = new JLabel("Result:");
        result = new JTextField(10);
        result.setEditable(false);

        add = new JButton("Add");
        subtract = new JButton("Subtract");
        multiply = new JButton("Multiply");
        divide = new JButton("Divide");
        modulus = new JButton("Modulus");

        add(label1);
        add(num1);

        add(label2);
        add(num2);

        add(add);
        add(subtract);
        add(multiply);
        add(divide);
        add(modulus);

        add(label3);
        add(result);

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        modulus.addActionListener(this);

        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double number1 = Double.parseDouble(num1.getText());
        double number2 = Double.parseDouble(num2.getText());

        double answer = 0;

        if (e.getSource() == add) {
            answer = number1 + number2;
        }
        else if (e.getSource() == subtract) {
            answer = number1 - number2;
        }
        else if (e.getSource() == multiply) {
            answer = number1 * number2;
        }
        else if (e.getSource() == divide) {
            answer = number1 / number2;
        }
        else if (e.getSource() == modulus) {
            answer = number1 % number2;
        }

        result.setText(String.valueOf(answer));
    }

    public static void main(String[] args) {

        new CalculatorSwing();
    }
}