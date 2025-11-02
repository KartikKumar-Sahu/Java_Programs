import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
<applet code="Program332.class" width="400" height="400"></applet>
*/

public class Program332 extends Applet {

    @Override
    public void init() {
        setBackground(Color.WHITE); // Set background color
    }

    @Override
    public void paint(Graphics g) {
        // Draw 4 concentric circles (same center, increasing radius)
        int centerX = 200;
        int centerY = 200;

        // Colors for each circle
        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.MAGENTA};

        int radius = 40; // starting radius
        for (int i = 0; i < 4; i++) {
            g.setColor(colors[i]);
            // drawOval(x, y, width, height) — width & height = diameter = radius * 2
            g.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
            radius += 30; // increase radius for next circle
        }

        g.setColor(Color.BLACK);
        g.drawString("Four Concentric Circles", 130, 370);
    }

    // === Fallback for non-applet environments ===
    public static void main(String[] args) {
        Frame frame = new Frame("Program332 - Concentric Circles (AWT Fallback)");
        Program332 applet = new Program332();

        frame.add(applet);
        frame.setSize(400, 400);
        frame.setBackground(Color.WHITE);

        applet.init();
        applet.start();

        // Close window handler
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
