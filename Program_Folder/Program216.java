// Program216.java
import java.awt.*;
import java.awt.event.*;

public class Program216 extends Frame {

    public Program216() {
        // Set title and layout
        setTitle("AWT Button Example - FlowLayout");
        setLayout(new FlowLayout());

        // Create a Button
        Button btn = new Button("Click Me");

        // Add button to the frame
        add(btn);

        // Add window closing functionality
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
        new Program216();
    }
}
