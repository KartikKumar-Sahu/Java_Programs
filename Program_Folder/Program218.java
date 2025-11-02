// Program218.java
import java.awt.*;
import java.awt.event.*;

public class Program218 extends Frame {

    public Program218() {
        // Set title
        setTitle("AWT BorderLayout Example");

        // Set layout manager
        setLayout(new BorderLayout());

        // Create buttons for each region
        Button btnNorth = new Button("North");
        Button btnSouth = new Button("South");
        Button btnEast = new Button("East");
        Button btnWest = new Button("West");
        Button btnCenter = new Button("Center");

        // Add buttons to frame with BorderLayout positions
        add(btnNorth, BorderLayout.NORTH);
        add(btnSouth, BorderLayout.SOUTH);
        add(btnEast, BorderLayout.EAST);
        add(btnWest, BorderLayout.WEST);
        add(btnCenter, BorderLayout.CENTER);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Set frame size and make it visible
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program218();
    }
}
