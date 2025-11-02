// Program222.java
import java.awt.*;
import java.awt.event.*;

public class Program222 extends Frame {

    Checkbox checkbox1, checkbox2, checkbox3;
    Label label;

    public Program222() {
        // Set title
        setTitle("AWT Checkbox with Custom Layout");

        // Disable default layout manager
        setLayout(null);

        // Create label and checkboxes
        label = new Label("Select your skills:");
        checkbox1 = new Checkbox("Java");
        checkbox2 = new Checkbox("Python");
        checkbox3 = new Checkbox("C++");

        // Set manual positions and sizes
        label.setBounds(50, 60, 150, 30);
        checkbox1.setBounds(50, 100, 100, 30);
        checkbox2.setBounds(50, 140, 100, 30);
        checkbox3.setBounds(50, 180, 100, 30);

        // Add components to frame
        add(label);
        add(checkbox1);
        add(checkbox2);
        add(checkbox3);

        // Add window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set frame size and visibility
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program222();
    }
}
