import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program186 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Change Background Color");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton btnRed = new JButton("Red");
        JButton btnGreen = new JButton("Green");
        JButton btnBlue = new JButton("Blue");

        frame.add(btnRed);
        frame.add(btnGreen);
        frame.add(btnBlue);

        // Add action listeners
        btnRed.addActionListener(e -> frame.getContentPane().setBackground(Color.RED));
        btnGreen.addActionListener(e -> frame.getContentPane().setBackground(Color.GREEN));
        btnBlue.addActionListener(e -> frame.getContentPane().setBackground(Color.BLUE));

        frame.setVisible(true);
    }
}
