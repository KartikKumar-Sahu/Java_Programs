import java.awt.*;
import java.awt.event.*;

public class Program175 extends Frame implements MouseListener, MouseMotionListener {

    Label label;

    Program175() {
        // Create Label
        label = new Label("Perform Mouse Actions Here");
        label.setBounds(50, 100, 300, 30);
        label.setBackground(Color.LIGHT_GRAY);

        // Add listeners to Frame
        addMouseListener(this);
        addMouseMotionListener(this);

        // Add components
        add(label);

        // Frame settings
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        // Close frame on exit
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered Frame");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited Frame");
    }

    // MouseMotionListener methods
    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        new Program175();
    }
}
