// Program223.java
import java.awt.*;
import java.awt.event.*;

public class Program223 extends Frame {

    public Program223() {
        // Set title
        setTitle("AWT Label with FlowLayout");

        // Set FlowLayout manager
        setLayout(new FlowLayout());

        // Create a label
        Label label = new Label("Welcome to Java AWT Programming!");

        // Add label to the frame
        add(label);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set frame size and visibility
        setSize(350, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program223();
    }
}
