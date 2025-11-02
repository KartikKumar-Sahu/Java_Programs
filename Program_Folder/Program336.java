import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
<applet code="Program336.class" width="400" height="300"></applet>
*/

public class Program336 extends Applet implements Runnable {

    private Thread colorThread;
    private Color[] colors = {
        Color.RED, Color.GREEN, Color.BLUE, Color.CYAN,
        Color.MAGENTA, Color.ORANGE, Color.YELLOW, Color.PINK
    };
    private int index = 0;
    private boolean running = true;

    @Override
    public void init() {
        setBackground(colors[index]);
        colorThread = new Thread(this);
        colorThread.start();
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(1000); // change color every second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            index = (index + 1) % colors.length;
            setBackground(colors[index]);
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("Background Color Changing Applet", 90, 150);
    }

    @Override
    public void stop() {
        running = false;
    }

    // === Fallback AWT Application (for non-applet environments) ===
    public static void main(String[] args) {
        Frame frame = new Frame("Program336 - Background Color Changer (AWT Fallback)");
        Program336 applet = new Program336();

        frame.add(applet);
        frame.setSize(400, 300);
        frame.setBackground(Color.WHITE);

        applet.init();
        applet.start();

        // Window close handler
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                applet.stop();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
