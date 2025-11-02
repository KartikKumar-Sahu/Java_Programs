import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
<applet code="Program334.class" width="400" height="300"></applet>
*/

public class Program334 extends Applet {

    @Override
    public void init() {
        setBackground(Color.WHITE); // Optional background color
    }

    @Override
    public void paint(Graphics g) {
        // Set the color for the oval
        g.setColor(Color.ORANGE);

        // Draw an oval (x, y, width, height)
        g.drawOval(100, 80, 200, 120);

        // Optional filled oval (uncomment if you want a solid shape)
        // g.fillOval(100, 80, 200, 120);

        // Add label text
        g.setColor(Color.BLACK);
        g.drawString("This is an Oval", 150, 230);
    }

    // === Fallback AWT Application (for environments without applet support) ===
    public static void main(String[] args) {
        Frame frame = new Frame("Program334 - Draw Oval (AWT Fallback)");
        Program334 applet = new Program334();

        frame.add(applet);
        frame.setSize(400, 300);
        frame.setBackground(Color.WHITE);

        applet.init();
        applet.start();

        // Add window closing handler
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
