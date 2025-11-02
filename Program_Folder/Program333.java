import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
<applet code="Program333.class" width="400" height="300"></applet>
*/

public class Program333 extends Applet {

    @Override
    public void init() {
        setBackground(Color.WHITE);  // Optional background color
    }

    @Override
    public void paint(Graphics g) {
        // Set the color for the line
        g.setColor(Color.BLUE);

        // Draw a line from (x1, y1) to (x2, y2)
        g.drawLine(80, 150, 320, 150);

        // Add label
        g.setColor(Color.BLACK);
        g.drawString("This is a Line", 150, 200);
    }

    // === Fallback AWT Application (for environments without applet support) ===
    public static void main(String[] args) {
        Frame frame = new Frame("Program333 - Draw Line (AWT Fallback)");
        Program333 applet = new Program333();

        frame.add(applet);
        frame.setSize(400, 300);
        frame.setBackground(Color.WHITE);

        applet.init();
        applet.start();

        // Add window close handler
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
