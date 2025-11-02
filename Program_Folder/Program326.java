import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/*
 * <applet code="Program326.class" width="400" height="200"></applet>
 */
public class Program326 extends Applet {

    @Override
    public void init() {
        // optional initial setup
        setBackground(Color.WHITE);
    }

    @Override
    public void paint(Graphics g) {
        g.setFont(new Font("SansSerif", Font.BOLD, 24));
        g.setColor(Color.BLACK);
        g.drawString("Hello World", 120, 100);
    }

    // --- Fallback so you can run it as a normal app if applets aren't supported ---
    public static void main(String[] args) {
        // Minimal frame to preview the same drawing
        java.awt.Frame f = new java.awt.Frame("Program326 (Applet Preview)");
        Program326 app = new Program326();
        f.add(app);
        f.setSize(400, 200);
        app.init();
        f.setVisible(true);

        // Close window handler
        f.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                f.dispose();
            }
        });
    }
}
