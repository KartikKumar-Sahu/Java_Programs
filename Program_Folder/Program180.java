import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program180 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple Selection List Example");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Create an array of items
        String[] fruits = {"Apple", "Banana", "Cherry", "Mango", "Orange", "Pineapple"};

        // Create JList with multiple selection mode
        JList<String> list = new JList<>(fruits);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list.setVisibleRowCount(4);

        // Add JList inside a scroll pane
        JScrollPane scrollPane = new JScrollPane(list);
        frame.add(scrollPane);

        // Create a button to show selected items
        JButton showButton = new JButton("Show Selected");
        frame.add(showButton);

        // Label to display selected items
        JLabel label = new JLabel("Selected Items: ");
        frame.add(label);

        // Action Listener for button
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                java.util.List<String> selected = list.getSelectedValuesList();
                label.setText("Selected Items: " + selected);
            }
        });

        // Frame settings
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
