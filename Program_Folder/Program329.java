import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
<applet code="Program329.class" width="400" height="300"></applet>
*/

public class Program329 extends Applet {

    @Override
    public void init() {
        setBackground(Color.WHITE);  // Optional background
    }

    @Override
    public void paint(Graphics g) {
        // Set color for the polygon
        g.setColor(Color.RED);

        // Define X and Y coordinates of the polygon’s vertices
        int[] xPoints = {100, 150, 200, 250, 200, 150};
        int[] yPoints = {200, 100, 100, 200, 250, 250};

        int nPoints = xPoints.length; // number of vertices

        // Draw the polygon outline
        g.drawPolygon(xPoints, yPoints, nPoints);

        // Optional fill (uncomment to fill polygon)
        // g.fillPolygon(xPoints, yPoints, nPoints);

        // Add label text
        g.setColor(Color.BLACK);
        g.drawString("This is a Polygon", 130, 270);
    }

    // === Fallback AWT Application (for non-applet environments) ===
    public static void main(String[] args) {
        Frame frame = new Frame("Program329 - Draw Polygon (AWT Fallback)");
        Program329 applet = new Program329();

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
