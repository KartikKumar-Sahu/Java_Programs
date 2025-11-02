import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Program179 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Border Example");
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Create buttons
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");

        // Set positions
        btn1.setBounds(50, 80, 100, 40);
        btn2.setBounds(150, 80, 100, 40);
        btn3.setBounds(250, 80, 100, 40);

        // Add borders to buttons
        btn1.setBorder(new LineBorder(Color.RED, 2));     // Red border
        btn2.setBorder(new LineBorder(Color.BLUE, 3));    // Blue border
        btn3.setBorder(new LineBorder(Color.GREEN, 4));   // Green border

        // Add buttons to frame
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);

        // Frame settings
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
