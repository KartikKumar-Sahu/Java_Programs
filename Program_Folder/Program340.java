import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
<applet code="Program340.class" width="400" height="400"></applet>
*/

public class Program340 extends Applet {

    @Override
    public void init() {
        setBackground(Color.WHITE);
    }

    @Override
    public void paint(Graphics g) {
        // --- Face outline ---
        g.setColor(new Color(255, 215, 0));           // golden/yellow
        g.fillOval(80, 60, 240, 240);                 // head (filled)
        g.setColor(Color.BLACK);
        g.drawOval(80, 60, 240, 240);                 // head border

        // --- Eyes ---
        // white eye whites
        g.setColor(Color.WHITE);
        g.fillOval(145, 130, 40, 30);                 // left eye white
        g.fillOval(215, 130, 40, 30);                 // right eye white
        // pupils
        g.setColor(Color.BLACK);
        g.fillOval(160, 138, 15, 18);                 // left pupil
        g.fillOval(230, 138, 15, 18);                 // right pupil

        // --- Nose (simple triangle) ---
        int[] nx = {200, 190, 210};
        int[] ny = {165, 195, 195};
        g.setColor(new Color(255, 180, 0));
        g.fillPolygon(nx, ny, 3);
        g.setColor(Color.BLACK);
        g.drawPolygon(nx, ny, 3);

        // --- Smile ---
        // drawArc(x, y, width, height, startAngle, arcAngle)
        // Bigger outer smile line
        g.setColor(Color.BLACK);
        g.drawArc(135, 170, 150, 110, 200, 140);

        // Optional: a thicker smile using a second arc slightly offset
        g.drawArc(136, 172, 148, 108, 200, 140);

        // --- Dimples (small filled arcs/circles) ---
        g.fillOval(140, 220, 10, 10);
        g.fillOval(270, 220, 10, 10);

        // --- Caption ---
        g.drawString("Smiling Face", 170, 330);
    }

    // === Fallback AWT Application ===
    public static void main(String[] args) {
        Frame frame = new Frame("Program340 - Smiling Face (AWT Fallback)");
        Program340 applet = new Program340();

        frame.add(applet);
        frame.setSize(400, 400);
        frame.setBackground(Color.WHITE);

        applet.init();
        applet.start();

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
