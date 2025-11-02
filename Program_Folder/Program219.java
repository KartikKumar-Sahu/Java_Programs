// Program219.java
import java.awt.*;
import java.awt.event.*;

public class Program219 extends Frame {

    public Program219() {
        // Set title
        setTitle("AWT TextField Example - FlowLayout");

        // Set layout manager
        setLayout(new FlowLayout());

        // Create a label and text field
        Label lbl = new Label("Enter your name:");
        TextField txt = new TextField(20);

        // Add components to frame
        add(lbl);
        add(txt);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set frame size and make it visible
        setSize(400, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program219();
    }
}
