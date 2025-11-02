import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program188 extends JFrame implements KeyListener {
    JTextField textField;
    JLabel label;

    public Program188() {
        // Frame title
        super("Number Validation Example");

        // Components
        label = new JLabel("Enter only numbers:");
        textField = new JTextField(15);

        // Add KeyListener to text field
        textField.addKeyListener(this);

        // Layout setup
        setLayout(new FlowLayout());
        add(label);
        add(textField);

        // Frame settings
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // --- KeyListener methods ---
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        // Allow only digits and backspace
        if (!Character.isDigit(c) && c != '\b') {
            e.consume(); // ignore event
            JOptionPane.showMessageDialog(this, "Only numbers are allowed!", "Invalid Input", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new Program188();
    }
}
