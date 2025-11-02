// Program220.java
import java.awt.*;
import java.awt.event.*;

public class Program220 extends Frame {

    TextField textField;

    public Program220() {
        // Set title
        setTitle("AWT TextField with Custom Layout");

        // Disable layout manager (we'll use custom positioning)
        setLayout(null);

        // Create label and text field
        Label label = new Label("Enter your email:");
        label.setBounds(50, 80, 120, 30); // x, y, width, height

        textField = new TextField();
        textField.setBounds(180, 80, 180, 30);

        // Add components to frame
        add(label);
        add(textField);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set frame properties
        setSize(450, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program220();
    }
}
