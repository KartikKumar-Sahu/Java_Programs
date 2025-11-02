import java.awt.*;
import java.awt.event.*;

class FrameOne extends Frame implements ActionListener {
    Button btnNext;

    FrameOne() {
        setTitle("Frame 1");
        setSize(400, 300);
        setLayout(null);

        Label label = new Label("This is Frame 1");
        label.setBounds(130, 100, 200, 30);
        add(label);

        btnNext = new Button("Go to Frame 2");
        btnNext.setBounds(130, 150, 120, 30);
        add(btnNext);

        btnNext.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        dispose(); // Close current frame
        new FrameTwo(); // Open next frame
    }
}

class FrameTwo extends Frame implements ActionListener {
    Button btnBack;

    FrameTwo() {
        setTitle("Frame 2");
        setSize(400, 300);
        setLayout(null);

        Label label = new Label("This is Frame 2");
        label.setBounds(130, 100, 200, 30);
        add(label);

        btnBack = new Button("Go Back to Frame 1");
        btnBack.setBounds(120, 150, 150, 30);
        add(btnBack);

        btnBack.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        dispose(); // Close current frame
        new FrameOne(); // Go back to Frame 1
    }
}

public class Program178 {
    public static void main(String[] args) {
        new FrameOne();
    }
}
