import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class CircleApplet extends Applet {
    // Initialize the applet by setting its background color
    public void init() {
        // Set background color for the applet
        setBackground(Color.WHITE);
    }

    // The paint method is called automatically when the applet is initialized
    public void paint(Graphics g) {
        // Set the color to blue for drawing the circle
        g.setColor(Color.BLUE);
        
        // Draw a filled circle (oval with equal width and height) at position (100, 100)
        // The circle has a width and height of 100, which means a radius of 50
        g.fillOval(100, 100, 100, 100);
    }
}
