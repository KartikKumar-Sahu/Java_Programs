// Program217.java
import java.awt.*;
import java.awt.event.*;

public class Program217 extends Frame {

    public Program217() {
        // Set title
        setTitle("AWT Button Example - Custom Layout");

        // Disable layout manager (use null layout)
        setLayout(null);

        // Create a Button
        Button btn = new Button("Click Me");

        // Set button position (x, y) and size (width, height)
        btn.setBounds(100, 80, 100, 40);

        // Add button to the frame
        add(btn);

        // Add window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set frame size and make it visible
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program217();
    }
}
