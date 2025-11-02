// Program221.java
import java.awt.*;
import java.awt.event.*;

public class Program221 extends Frame {

    Checkbox checkbox;

    public Program221() {
        // Set title
        setTitle("AWT Checkbox with FlowLayout");

        // Use FlowLayout manager
        setLayout(new FlowLayout());

        // Create label and checkbox
        Label label = new Label("Select your interest:");
        checkbox = new Checkbox("Java Programming");

        // Add components to the frame
        add(label);
        add(checkbox);

        // Add window close functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set frame size and make visible
        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program221();
    }
}
