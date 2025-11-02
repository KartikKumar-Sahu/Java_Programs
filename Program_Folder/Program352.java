// Program352.java
import java.time.LocalTime;
import java.time.Duration;

public class Program352 {

    // --- Airplane class ---
    static class Airplane {
        private String flightNumber;
        private String destination;
        private LocalTime departureTime;

        // Constructor
        public Airplane(String flightNumber, String destination, LocalTime departureTime) {
            this.flightNumber = flightNumber;
            this.destination = destination;
            this.departureTime = departureTime;
        }

        // Method to display flight details
        public void displayInfo() {
            System.out.println("Flight Number: " + flightNumber);
            System.out.println("Destination: " + destination);
            System.out.println("Departure Time: " + departureTime);
            System.out.println("Status: " + checkFlightStatus());
            System.out.println("---------------------------------");
        }

        // Method to check flight status based on current time
        public String checkFlightStatus() {
            LocalTime currentTime = LocalTime.now();
            if (currentTime.isBefore(departureTime)) {
                Duration duration = Duration.between(currentTime, departureTime);
                long minutes = duration.toMinutes();
                return "On Time (Departs in " + minutes + " minutes)";
            } else if (currentTime.equals(departureTime)) {
                return "Departing Now";
            } else {
                return "Already Departed";
            }
        }

        // Method to delay the flight by given minutes
        public void delayFlight(int minutes) {
            if (minutes > 0) {
                departureTime = departureTime.plusMinutes(minutes);
                System.out.println("⚠️ Flight " + flightNumber + " delayed by " + minutes + " minutes.");
                System.out.println("🕑 New Departure Time: " + departureTime);
            } else {
                System.out.println("❌ Delay time must be positive.");
            }
        }
    }

    // --- Main method ---
    public static void main(String[] args) {
        // Create a few flight objects
        Airplane flight1 = new Airplane("AI202", "New York", LocalTime.now().plusMinutes(45));
        Airplane flight2 = new Airplane("BA305", "London", LocalTime.now().minusMinutes(10));

        System.out.println("=== Flight Information ===");
        flight1.displayInfo();
        flight2.displayInfo();

        // Delay one flight
        System.out.println("\n--- Updating Flight Schedule ---");
        flight1.delayFlight(30);  // delay by 30 minutes

        // Display updated info
        System.out.println("\n=== Updated Flight Information ===");
        flight1.displayInfo();
    }
}
