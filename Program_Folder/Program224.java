// Program224.java
import java.awt.*;
import java.awt.event.*;

public class Program224 extends Frame {

    public Program224() {
        // Set title
        setTitle("AWT Label with Custom Layout");

        // Disable layout manager (Custom Layout)
        setLayout(null);

        // Create a label
        Label label = new Label("Welcome to Custom Layout Example!");
        label.setBounds(60, 100, 250, 30); // x, y, width, height

        // Add label to frame
        add(label);

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
        new Program224();
    }
}
