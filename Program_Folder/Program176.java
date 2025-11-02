import java.awt.*;
import java.awt.event.*;

public class Program176 extends Frame implements ItemListener, ActionListener {

    Checkbox checkbox;
    Label label;
    Button setButton, getButton;

    Program176() {
        // Create components
        checkbox = new Checkbox("Java Programming");
        checkbox.setBounds(50, 100, 200, 30);
        checkbox.addItemListener(this);

        label = new Label("Checkbox State: Unchecked");
        label.setBounds(50, 150, 300, 30);

        setButton = new Button("Set Checked");
        setButton.setBounds(50, 200, 100, 30);
        setButton.addActionListener(this);

        getButton = new Button("Get Info");
        getButton.setBounds(160, 200, 100, 30);
        getButton.addActionListener(this);

        // Add components
        add(checkbox);
        add(label);
        add(setButton);
        add(getButton);

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

    // Handle checkbox change
    public void itemStateChanged(ItemEvent e) {
        if (checkbox.getState())
            label.setText("Checkbox State: Checked");
        else
            label.setText("Checkbox State: Unchecked");
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == setButton) {
            checkbox.setState(true);
            label.setText("Checkbox Set to: Checked");
        } else if (e.getSource() == getButton) {
            String info = "Label: " + checkbox.getLabel() + 
                          ", State: " + (checkbox.getState() ? "Checked" : "Unchecked");
            label.setText(info);
        }
    }

    public static void main(String[] args) {
        new Program176();
    }
}
