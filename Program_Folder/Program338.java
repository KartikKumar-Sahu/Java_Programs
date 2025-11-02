import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
<applet code="Program338.class" width="500" height="300"></applet>
*/

public class Program338 extends Applet {

    @Override
    public void init() {
        setBackground(Color.WHITE); // Optional background color
    }

    @Override
    public void paint(Graphics g) {
        // Title
        g.setColor(Color.BLACK);
        g.setFont(new Font("SansSerif", Font.BOLD, 20));
        g.drawString("Font Demonstration Applet", 110, 60);

        // Example 1: Plain text
        g.setColor(Color.BLUE);
        g.setFont(new Font("Serif", Font.PLAIN, 18));
        g.drawString("This is Serif (PLAIN)", 100, 110);

        // Example 2: Bold text
        g.setColor(Color.RED);
        g.setFont(new Font("Serif", Font.BOLD, 18));
        g.drawString("This is Serif (BOLD)", 100, 150);

        // Example 3: Italic text
        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Monospaced", Font.ITALIC, 18));
        g.drawString("This is Monospaced (ITALIC)", 100, 190);

        // Example 4: Bold + Italic text
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
        g.drawString("This is Dialog (BOLD + ITALIC)", 100, 230);
    }

    // === Fallback AWT Application (for environments without applet support) ===
    public static void main(String[] args) {
        Frame frame = new Frame("Program338 - Set Font (AWT Fallback)");
        Program338 applet = new Program338();

        frame.add(applet);
        frame.setSize(500, 300);
        frame.setBackground(Color.WHITE);

        applet.init();
        applet.start();

        // Close the window on exit
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
