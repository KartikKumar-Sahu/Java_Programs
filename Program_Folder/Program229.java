// Program229.java
import java.awt.*;
import java.awt.event.*;

public class Program229 extends Frame {

    public Program229() {
        // Set title
        setTitle("AWT List with FlowLayout");

        // Use FlowLayout manager
        setLayout(new FlowLayout());

        // Create a label
        Label label = new Label("Select your favorite fruits:");

        // Create a List with 4 visible rows and multiple selection enabled
        List fruitList = new List(4, true);
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Mango");
        fruitList.add("Orange");
        fruitList.add("Grapes");
        fruitList.add("Pineapple");

        // Add components to frame
        add(label);
        add(fruitList);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set size and make visible
        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program229();
    }
}
