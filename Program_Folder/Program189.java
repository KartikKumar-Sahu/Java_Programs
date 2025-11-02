import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;

public class Program189 extends JFrame {
    JTextField emailField;
    JLabel instructionLabel, statusLabel;

    public Program189() {
        // Frame title
        super("Email Validation Example");

        // Components
        instructionLabel = new JLabel("Enter your Email ID:");
        emailField = new JTextField(20);
        statusLabel = new JLabel("");

        // Add KeyAdapter for real-time validation
        emailField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String email = emailField.getText();
                if (isValidEmail(email)) {
                    statusLabel.setText("✅ Valid Email");
                    statusLabel.setForeground(Color.GREEN);
                } else {
                    statusLabel.setText("❌ Invalid Email");
                    statusLabel.setForeground(Color.RED);
                }
            }
        });

        // Layout setup
        setLayout(new FlowLayout());
        add(instructionLabel);
        add(emailField);
        add(statusLabel);

        // Frame setup
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Method to validate email using regex
    private boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        new Program189();
    }
}
