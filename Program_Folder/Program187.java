import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Program187 extends JPanel implements Runnable {
    private final Random random = new Random();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw a random dot each time repaint() is called
        int x = random.nextInt(getWidth());
        int y = random.nextInt(getHeight());
        int size = 10; // dot size
        g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        g.fillOval(x, y, size, size);
    }

    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(200); // delay between dots
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Display Dots Continuously");
        Program187 panel = new Program187();
        frame.add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Thread thread = new Thread(panel);
        thread.start();
    }
}
