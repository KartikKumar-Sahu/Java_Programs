// Program232.java
import java.awt.*;
import java.awt.event.*;

public class Program232 extends Frame {

    public Program232() {
        // Set title
        setTitle("AWT TextArea with Custom Layout");

        // Disable layout manager for custom positioning
        setLayout(null);

        // Create a label
        Label label = new Label("Enter your comments:");
        label.setBounds(50, 70, 150, 30);

        // Create a TextArea (5 rows x 30 columns)
        TextArea textArea = new TextArea(5, 30);
        textArea.setBounds(50, 110, 300, 100);

        // Add components to the frame
        add(label);
        add(textArea);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set frame size and visibility
        setSize(420, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program232();
    }
}
