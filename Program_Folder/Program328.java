import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
<applet code="Program328.class" width="300" height="300"></applet>
*/

public class Program328 extends Applet {

    @Override
    public void init() {
        // Optional: set the background color for the applet
        setBackground(Color.WHITE);
    }

    @Override
    public void paint(Graphics g) {
        // Draw a blue circle
        g.setColor(Color.BLUE);
        g.drawOval(80, 80, 120, 120); // x, y, width, height

        // Add a label
        g.setColor(Color.BLACK);
        g.drawString("This is a Circle", 100, 230);
    }

    // === Fallback main() method ===
    public static void main(String[] args) {
        // Create a Frame (window)
        Frame frame = new Frame("Program328 - Draw Circle (AWT Fallback)");

        // Create an instance of the applet
        Program328 applet = new Program328();

        // Initialize the applet manually
        applet.init();

        // Add applet to the frame
        frame.add(applet);
        frame.setSize(300, 300);
        frame.setBackground(Color.WHITE);

        // Add window listener to close the window
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
