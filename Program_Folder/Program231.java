// Program231.java
import java.awt.*;
import java.awt.event.*;

public class Program231 extends Frame {

    public Program231() {
        // Set title
        setTitle("AWT TextArea with FlowLayout");

        // Use FlowLayout manager
        setLayout(new FlowLayout());

        // Create a label
        Label label = new Label("Enter your feedback:");

        // Create a TextArea (rows = 5, columns = 30)
        TextArea textArea = new TextArea(5, 30);

        // Add components to the frame
        add(label);
        add(textArea);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set size and visibility
        setSize(400, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program231();
    }
}
