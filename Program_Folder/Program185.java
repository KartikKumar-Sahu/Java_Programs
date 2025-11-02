import javax.swing.*;
import java.awt.*;

public class Program185 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Change Background Color to Cyan");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Get the content pane and set background color
        frame.getContentPane().setBackground(Color.CYAN);

        JLabel label = new JLabel("Background Color is Cyan", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(label);

        frame.setVisible(true);
    }
}
