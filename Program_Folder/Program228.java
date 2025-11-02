// Program228.java
import java.awt.*;
import java.awt.event.*;

public class Program228 extends Frame {

    public Program228() {
        // Set title
        setTitle("AWT CheckboxGroup with Custom Layout");

        // Disable default layout (Custom Layout)
        setLayout(null);

        // Create a label
        Label label = new Label("Select your favorite language:");
        label.setBounds(50, 50, 250, 30);

        // Create CheckboxGroup (radio button-like behavior)
        CheckboxGroup langGroup = new CheckboxGroup();

        // Create checkboxes belonging to the group
        Checkbox java = new Checkbox("Java", langGroup, true);
        java.setBounds(70, 100, 100, 30);

        Checkbox python = new Checkbox("Python", langGroup, false);
        python.setBounds(70, 140, 100, 30);

        Checkbox cpp = new Checkbox("C++", langGroup, false);
        cpp.setBounds(70, 180, 100, 30);

        // Add components to frame
        add(label);
        add(java);
        add(python);
        add(cpp);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set size and make visible
        setSize(350, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program228();
    }
}
