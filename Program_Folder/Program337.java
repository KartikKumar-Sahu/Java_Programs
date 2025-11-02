import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
<applet code="Program337.class" width="400" height="300"></applet>
*/

public class Program337 extends Applet {

    @Override
    public void init() {
        // Set background color (optional)
        setBackground(Color.WHITE);
    }

    @Override
    public void paint(Graphics g) {
        // Set the color for the rounded rectangle
        g.setColor(Color.BLUE);

        // Draw a rounded rectangle
        // drawRoundRect(x, y, width, height, arcWidth, arcHeight)
        g.drawRoundRect(100, 80, 200, 120, 40, 40);

        // Optional filled rounded rectangle
        // g.fillRoundRect(100, 80, 200, 120, 40, 40);

        // Add label
        g.setColor(Color.BLACK);
        g.drawString("This is a Rounded Rectangle", 120, 230);
    }

    // === Fallback AWT Application (for environments without applet support) ===
    public static void main(String[] args) {
        Frame frame = new Frame("Program337 - Draw Rounded Rectangle (AWT Fallback)");
        Program337 applet = new Program337();

        frame.add(applet);
        frame.setSize(400, 300);
        frame.setBackground(Color.WHITE);

        applet.init();
        applet.start();

        // Handle window close
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
