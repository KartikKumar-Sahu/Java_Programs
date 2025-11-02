// Program226.java
import java.awt.*;
import java.awt.event.*;

public class Program226 extends Frame {

    public Program226() {
        // Set title
        setTitle("AWT Choice with Custom Layout");

        // Disable layout manager for custom positioning
        setLayout(null);

        // Create a label
        Label label = new Label("Select your favorite programming language:");
        label.setBounds(50, 80, 280, 25);

        // Create a Choice (dropdown menu)
        Choice choice = new Choice();
        choice.add("Java");
        choice.add("Python");
        choice.add("C++");
        choice.add("JavaScript");
        choice.add("Go");
        choice.setBounds(100, 120, 150, 25);

        // Add components to frame
        add(label);
        add(choice);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set frame size and visibility
        setSize(400, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program226();
    }
}
