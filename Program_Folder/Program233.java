// Program233.java
import java.awt.*;
import java.awt.event.*;

public class Program233 extends Frame implements ActionListener {

    TextField display;
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public Program233() {
        // Frame title
        setTitle("AWT Calculator");

        // Set layout as BorderLayout
        setLayout(new BorderLayout());

        // Create display TextField
        display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Create panel for buttons
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Button labels
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        // Add buttons to panel
        for (String text : buttons) {
            Button b = new Button(text);
            b.addActionListener(this);
            panel.add(b);
        }

        add(panel, BorderLayout.CENTER);

        // Frame setup
        setSize(300, 400);
        setVisible(true);

        // Close window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
            display.setText(display.getText() + s);
        } 
        else if (s.charAt(0) == 'C') {
            display.setText("");
            num1 = num2 = result = 0;
        } 
        else if (s.charAt(0) == '=') {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': 
                    if (num2 == 0)
                        display.setText("Error");
                    else
                        result = num1 / num2; 
                    break;
            }
            display.setText(String.valueOf(result));
        } 
        else { // Operator
            num1 = Double.parseDouble(display.getText());
            operator = s.charAt(0);
            display.setText("");
        }
    }

    public static void main(String[] args) {
        new Program233();
    }
}

