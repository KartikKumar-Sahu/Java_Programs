import java.awt.*;
import java.awt.event.*;

public class Program177 extends Frame implements ItemListener {

    Label label1, label2;
    Checkbox java, python, cpp;          // Checkboxes
    CheckboxGroup genderGroup;           // Radio button group
    Checkbox male, female;

    Program177() {

        // ====== Checkboxes ======
        label1 = new Label("Select your favorite programming languages:");
        label1.setBounds(50, 50, 300, 20);

        java = new Checkbox("Java");
        java.setBounds(50, 80, 100, 30);

        python = new Checkbox("Python");
        python.setBounds(50, 110, 100, 30);

        cpp = new Checkbox("C++");
        cpp.setBounds(50, 140, 100, 30);

        // Add Item Listeners
        java.addItemListener(this);
        python.addItemListener(this);
        cpp.addItemListener(this);

        // ====== Radio Buttons ======
        label2 = new Label("Select your gender:");
        label2.setBounds(50, 190, 200, 20);

        genderGroup = new CheckboxGroup();

        male = new Checkbox("Male", genderGroup, false);
        male.setBounds(50, 220, 100, 30);

        female = new Checkbox("Female", genderGroup, false);
        female.setBounds(50, 250, 100, 30);

        male.addItemListener(this);
        female.addItemListener(this);

        // ====== Add Components ======
        add(label1);
        add(java);
        add(python);
        add(cpp);
        add(label2);
        add(male);
        add(female);

        // ====== Frame Settings ======
        setSize(400, 350);
        setLayout(null);
        setVisible(true);

        // Close window event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    // Handle item state changes
    public void itemStateChanged(ItemEvent e) {
        String languages = "";
        if (java.getState()) languages += "Java ";
        if (python.getState()) languages += "Python ";
        if (cpp.getState()) languages += "C++ ";

        String gender = genderGroup.getSelectedCheckbox() != null ? genderGroup.getSelectedCheckbox().getLabel() : "";

        setTitle("Languages: " + languages + " | Gender: " + gender);
    }

    public static void main(String[] args) {
        new Program177();
    }
}
