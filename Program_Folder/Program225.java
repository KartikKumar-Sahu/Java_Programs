// Program225.java
import java.awt.*;
import java.awt.event.*;

public class Program225 extends Frame {

    public Program225() {
        // Set title
        setTitle("AWT Choice with FlowLayout");

        // Set layout manager
        setLayout(new FlowLayout());

        // Create a label
        Label label = new Label("Select your favorite programming language:");

        // Create a Choice (drop-down menu)
        Choice choice = new Choice();
        choice.add("Java");
        choice.add("Python");
        choice.add("C++");
        choice.add("JavaScript");
        choice.add("Go");

        // Add components to the frame
        add(label);
        add(choice);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set frame size and visibility
        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program225();
    }
}
