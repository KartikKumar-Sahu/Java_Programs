import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
<applet code="Program335.class" width="400" height="300"></applet>
*/

public class Program335 extends Applet {

    @Override
    public void init() {
        setBackground(Color.WHITE);  // Optional background color
    }

    @Override
    public void paint(Graphics g) {
        // Set the drawing color
        g.setColor(Color.RED);

        // Draw an arc outline
        // drawArc(x, y, width, height, startAngle, arcAngle)
        g.drawArc(100, 80, 200, 120, 0, 180);  // Semi-circle (top half)

        // Draw a filled arc
        g.setColor(Color.BLUE);
        g.fillArc(100, 80, 200, 120, 180, 180); // Bottom half (filled)

        // Add label text
        g.setColor(Color.BLACK);
        g.drawString("This is an Arc", 150, 230);
    }

    // === Fallback AWT Application (for environments without applet support) ===
    public static void main(String[] args) {
        Frame frame = new Frame("Program335 - Draw Arc (AWT Fallback)");
        Program335 applet = new Program335();

        frame.add(applet);
        frame.setSize(400, 300);
        frame.setBackground(Color.WHITE);

        applet.init();
        applet.start();

        // Handle window closing
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
