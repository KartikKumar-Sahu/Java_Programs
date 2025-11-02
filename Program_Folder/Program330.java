import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
<applet code="Program330.class" width="400" height="300"></applet>
*/

public class Program330 extends Applet {

    @Override
    public void init() {
        setBackground(Color.WHITE);  // Optional background color
    }

    @Override
    public void paint(Graphics g) {
        // Set color for the rectangle
        g.setColor(Color.BLUE);

        // Draw rectangle (x, y, width, height)
        g.drawRect(100, 80, 200, 120);

        // Optional filled rectangle
        // g.fillRect(100, 80, 200, 120);

        // Add label text
        g.setColor(Color.BLACK);
        g.drawString("This is a Rectangle", 140, 230);
    }

    // === Fallback AWT Application (runs as normal program if applets not supported) ===
    public static void main(String[] args) {
        Frame frame = new Frame("Program330 - Draw Rectangle (AWT Fallback)");
        Program330 applet = new Program330();

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
