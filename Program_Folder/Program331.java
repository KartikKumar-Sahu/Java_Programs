import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
<applet code="Program331.class" width="400" height="300"></applet>
*/

public class Program331 extends Applet {

    @Override
    public void init() {
        setBackground(Color.WHITE);  // Optional: background color
    }

    @Override
    public void paint(Graphics g) {
        // Set color for the square
        g.setColor(Color.MAGENTA);

        // Draw a square (equal width and height)
        g.drawRect(120, 80, 150, 150);

        // Optional: fill the square
        // g.fillRect(120, 80, 150, 150);

        // Add label text
        g.setColor(Color.BLACK);
        g.drawString("This is a Square", 145, 260);
    }

    // === Fallback AWT Application (for modern JDKs without applet support) ===
    public static void main(String[] args) {
        Frame frame = new Frame("Program331 - Draw Square (AWT Fallback)");
        Program331 applet = new Program331();

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
