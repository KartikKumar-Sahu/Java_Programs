// Program227.java
import java.awt.*;
import java.awt.event.*;

public class Program227 extends Frame {

    public Program227() {
        // Set title
        setTitle("AWT CheckboxGroup with FlowLayout");

        // Set layout manager
        setLayout(new FlowLayout());

        // Create label
        Label label = new Label("Select your gender:");

        // Create CheckboxGroup (Radio button style)
        CheckboxGroup genderGroup = new CheckboxGroup();

        // Create checkboxes that belong to the group
        Checkbox male = new Checkbox("Male", genderGroup, false);
        Checkbox female = new Checkbox("Female", genderGroup, false);
        Checkbox other = new Checkbox("Other", genderGroup, false);

        // Add components to frame
        add(label);
        add(male);
        add(female);
        add(other);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set frame size and make visible
        setSize(350, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program227();
    }
}
