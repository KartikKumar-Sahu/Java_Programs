import java.awt.*;

public class Program183 {
    public static void main(String[] args) {
        // Get all available fonts from the system
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fonts = ge.getAvailableFontFamilyNames();

        System.out.println("Available Fonts in Your System:");
        System.out.println("------------------------------------------------");

        // Display the list of fonts
        for (String font : fonts) {
            System.out.println(font);
        }

        System.out.println("------------------------------------------------");
        System.out.println("Total Fonts Found: " + fonts.length);
    }
}
