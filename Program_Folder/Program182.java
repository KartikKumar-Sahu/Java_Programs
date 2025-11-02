import javax.swing.*;
import java.awt.event.*;

public class Program182 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Close Frame using WindowAdapter");
        frame.setSize(400, 200);
        frame.setLayout(null);

        JLabel label = new JLabel("Close this window to exit the program.");
        label.setBounds(70, 70, 300, 30);
        frame.add(label);

        // Using WindowAdapter to handle window closing event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(frame, "Window is closing...");
                frame.dispose(); // Close the frame
                System.exit(0);  // Exit the program
            }
        });

        frame.setVisible(true);
    }
}
