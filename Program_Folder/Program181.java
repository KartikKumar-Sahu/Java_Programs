import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program181 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Open Message Frame");
        frame.add(button);

        // Action listener for button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a new frame when button is clicked
                JFrame messageFrame = new JFrame("Message Frame");
                messageFrame.setSize(300, 150);
                messageFrame.setLayout(new FlowLayout());

                JLabel messageLabel = new JLabel("Hello! This is a new frame.");
                messageLabel.setFont(new Font("Arial", Font.BOLD, 14));
                messageFrame.add(messageLabel);

                messageFrame.setVisible(true);
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
