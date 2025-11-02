// Program230.java
import java.awt.*;
import java.awt.event.*;

public class Program230 extends Frame {

    public Program230() {
        // Set title
        setTitle("AWT List with Custom Layout");

        // Disable layout manager (use absolute positioning)
        setLayout(null);

        // Create a label
        Label label = new Label("Select your favorite programming languages:");
        label.setBounds(30, 50, 300, 30);

        // Create a List (with 5 visible rows, multiple selection allowed)
        List langList = new List(5, true);
        langList.add("Java");
        langList.add("Python");
        langList.add("C++");
        langList.add("JavaScript");
        langList.add("Go");
        langList.add("Kotlin");
        langList.setBounds(30, 100, 150, 100);

        // Add components
        add(label);
        add(langList);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set size and make visible
        setSize(350, 280);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program230();
    }
}
