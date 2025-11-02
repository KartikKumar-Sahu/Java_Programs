import java.awt.*;

public class Program171 {

    public static void main(String[] args) {
        // Create a new Frame
        Frame frame = new Frame("TextArea and PasswordField Example");

        // Create a Label for text area
        Label label1 = new Label("Enter your feedback:");
        label1.setBounds(50, 70, 150, 30);

        // Create a TextArea
        TextArea textArea = new TextArea();
        textArea.setBounds(50, 100, 300, 100);

        // Create a Label for password
        Label label2 = new Label("Enter your password:");
        label2.setBounds(50, 220, 150, 30);

        // Create a Password Field (TextField with echo character)
        TextField passwordField = new TextField();
        passwordField.setBounds(50, 250, 200, 30);
        passwordField.setEchoChar('*'); // Masks the password

        // Add components to frame
        frame.add(label1);
        frame.add(textArea);
        frame.add(label2);
        frame.add(passwordField);

        // Set frame properties
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
