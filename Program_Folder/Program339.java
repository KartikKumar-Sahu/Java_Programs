import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

/*
<applet code="Program339.class" width="400" height="200"></applet>
*/

public class Program339 extends Applet implements Runnable {
    private Thread clockThread;
    private boolean running = true;

    @Override
    public void init() {
        setBackground(Color.BLACK);
    }

    @Override
    public void start() {
        // Start the clock thread
        if (clockThread == null) {
            running = true;
            clockThread = new Thread(this);
            clockThread.start();
        }
    }

    @Override
    public void run() {
        while (running) {
            repaint(); // Update display
            try {
                Thread.sleep(1000); // Update every second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        // Draw current time in HH:mm:ss format
        Date now = new Date();
        String timeString = String.format("%tT", now);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.GREEN);
        g.setFont(new Font("Digital-7", Font.BOLD, 40)); // Font style
        g.drawString(timeString, 120, 100);
    }

    @Override
    public void stop() {
        running = false;
        clockThread = null;
    }

    // === Fallback AWT Application (for environments without applet support) ===
    public static void main(String[] args) {
        Frame frame = new Frame("Program339 - Digital Clock (AWT Fallback)");
        Program339 applet = new Program339();

        frame.add(applet);
        frame.setSize(400, 200);
        frame.setBackground(Color.BLACK);

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
