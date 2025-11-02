import javax.swing.*;
import java.awt.*;

public class Program184 extends JFrame {

    public Program184() {
        setTitle("Display Text in Different Fonts");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Create labels with different fonts
        JLabel label1 = new JLabel("This is Arial Font", JLabel.CENTER);
        label1.setFont(new Font("Arial", Font.PLAIN, 18));

        JLabel label2 = new JLabel("This is Times New Roman Font", JLabel.CENTER);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 18));

        JLabel label3 = new JLabel("This is Courier New Font", JLabel.CENTER);
        label3.setFont(new Font("Courier New", Font.ITALIC, 18));

        JLabel label4 = new JLabel("This is Verdana Font", JLabel.CENTER);
        label4.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC, 18));

        // Add labels to frame
        add(label1);
        add(label2);
        add(label3);
        add(label4);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Program184();
    }
}
