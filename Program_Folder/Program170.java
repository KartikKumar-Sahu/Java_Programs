import java.awt.Frame;
import java.awt.Label;

public class Program170 {

    public static void main(String[] args) {
        // Create a new Frame
        Frame frame = new Frame("Display Text Using Label");

        // Create a Label with text
        Label label = new Label("Hello, Welcome to Java Programming!");

        // Set the position and size of the label
        label.setBounds(60, 100, 300, 30);

        // Add label to frame
        frame.add(label);

        // Set frame size, layout, and visibility
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
