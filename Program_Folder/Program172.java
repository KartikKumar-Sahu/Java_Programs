import java.awt.*;
import java.awt.event.*;

public class Program172 {

    public static void main(String[] args) {
        Frame frame = new Frame("Button and Image Example");

        // Create Button
        Button button = new Button("Show Image");
        button.setBounds(130, 100, 100, 40);

        // Create Label to hold the image
        Label imageLabel = new Label();
        imageLabel.setBounds(80, 160, 200, 200);

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Load image
                Image image = Toolkit.getDefaultToolkit().getImage("example.jpg");
                // Create image icon using label's graphics
                imageLabel.setText(""); // Clear text if any
                imageLabel.setBackground(Color.WHITE);

                // Create a new Canvas to draw image
                frame.add(new Canvas() {
                    public void paint(Graphics g) {
                        g.drawImage(image, 80, 160, 200, 200, this);
                    }
                });
                frame.repaint();
            }
        });

        // Add components to frame
        frame.add(button);
        frame.add(imageLabel);

        // Frame settings
        frame.setSize(400, 450);
        frame.setLayout(null);
        frame.setVisible(true);

        // Close operation
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose();
            }
        });
    }
}
