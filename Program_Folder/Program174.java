import java.awt.*;
import java.awt.event.*;

public class Program174 extends Frame implements KeyListener {

    Label label;
    TextField textField;

    Program174() {
        // Create components
        label = new Label("Type something in the box:");
        label.setBounds(50, 70, 250, 30);

        textField = new TextField();
        textField.setBounds(50, 110, 250, 30);

        // Add KeyListener to text field
        textField.addKeyListener(this);

        // Add components to frame
        add(label);
        add(textField);

        // Frame settings
        setSize(400, 250);
        setLayout(null);
        setVisible(true);

        // Close frame on exit
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    // Handle key events
    public void keyTyped(KeyEvent e) {
        label.setText("You typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new Program174();
    }
}
