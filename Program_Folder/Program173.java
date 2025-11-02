import java.awt.*;
import java.awt.event.*;

public class Program173 {

    public static void main(String[] args) {
        Frame frame = new Frame("Radio Button Example");

        // Create Label to show selected option
        Label label = new Label("Select your gender:");
        label.setBounds(50, 50, 200, 30);

        Label result = new Label("");
        result.setBounds(50, 150, 200, 30);

        // Create CheckboxGroup for radio buttons
        CheckboxGroup genderGroup = new CheckboxGroup();

        // Create two radio buttons
        Checkbox male = new Checkbox("Male", genderGroup, false);
        male.setBounds(50, 90, 100, 30);

        Checkbox female = new Checkbox("Female", genderGroup, false);
        female.setBounds(150, 90, 100, 30);

        // Add ItemListener to detect selection
        ItemListener listener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                Checkbox selected = genderGroup.getSelectedCheckbox();
                result.setText("Selected: " + selected.getLabel());
            }
        };

        male.addItemListener(listener);
        female.addItemListener(listener);

        // Add components to frame
        frame.add(label);
        frame.add(male);
        frame.add(female);
        frame.add(result);

        // Frame settings
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setVisible(true);

        // Close frame on exit
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose();
            }
        });
    }
}
