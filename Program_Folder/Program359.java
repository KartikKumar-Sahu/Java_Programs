import java.util.*;

class Program359 {

    // Inner classes to represent Flights and Hotels
    static class Flight {
        String flightNumber;
        String destination;
        double price;

        Flight(String flightNumber, String destination, double price) {
            this.flightNumber = flightNumber;
            this.destination = destination;
            this.price = price;
        }
    }

    static class Hotel {
        String name;
        String city;
        double pricePerNight;

        Hotel(String name, String city, double pricePerNight) {
            this.name = name;
            this.city = city;
            this.pricePerNight = pricePerNight;
        }
    }

    // Lists to store available flights and hotels
    private List<Flight> flights = new ArrayList<>();
    private List<Hotel> hotels = new ArrayList<>();
    private List<String> reservations = new ArrayList<>();

    // Constructor to load some sample data
    public Program359() {
        flights.add(new Flight("AI101", "New York", 500.0));
        flights.add(new Flight("BA202", "London", 450.0));
        flights.add(new Flight("QF303", "Sydney", 700.0));

        hotels.add(new Hotel("Grand Palace", "New York", 150.0));
        hotels.add(new Hotel("Royal Inn", "London", 120.0));
        hotels.add(new Hotel("Harbour View", "Sydney", 180.0));
    }

    // Method to search for flights by destination
    public void searchFlights(String destination) {
        System.out.println("\nSearching flights to " + destination + "...");
        boolean found = false;
        for (Flight f : flights) {
            if (f.destination.equalsIgnoreCase(destination)) {
                System.out.println("Flight: " + f.flightNumber + ", Destination: " + f.destination + ", Price: $" + f.price);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No flights found for " + destination);
        }
    }

    // Method to search for hotels by city
    public void searchHotels(String city) {
        System.out.println("\nSearching hotels in " + city + "...");
        boolean found = false;
        for (Hotel h : hotels) {
            if (h.city.equalsIgnoreCase(city)) {
                System.out.println("Hotel: " + h.name + ", City: " + h.city + ", Price per night: $" + h.pricePerNight);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No hotels found in " + city);
        }
    }

    // Method to book a reservation
    public void bookReservation(String reservationDetails) {
        reservations.add(reservationDetails);
        System.out.println("\nReservation booked successfully: " + reservationDetails);
    }

    // Method to cancel a reservation
    public void cancelReservation(String reservationDetails) {
        if (reservations.remove(reservationDetails)) {
            System.out.println("\nReservation cancelled successfully: " + reservationDetails);
        } else {
            System.out.println("\nNo matching reservation found to cancel.");
        }
    }

    // Display all current reservations
    public void viewReservations() {
        System.out.println("\nCurrent Reservations:");
        if (reservations.isEmpty()) {
            System.out.println("No active reservations.");
        } else {
            for (String res : reservations) {
                System.out.println(res);
            }
        }
    }

    // Main method for user interaction
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program359 system = new Program359();
        int choice;

        do {
            System.out.println("\n===== Travel Booking System =====");
            System.out.println("1. Search Flights");
            System.out.println("2. Search Hotels");
            System.out.println("3. Book Reservation");
            System.out.println("4. Cancel Reservation");
            System.out.println("5. View Reservations");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter destination: ");
                    String dest = sc.nextLine();
                    system.searchFlights(dest);
                    break;
                case 2:
                    System.out.print("Enter city: ");
                    String city = sc.nextLine();
                    system.searchHotels(city);
                    break;
                case 3:
                    System.out.print("Enter reservation details (e.g., Flight AI101 to London): ");
                    String book = sc.nextLine();
                    system.bookReservation(book);
                    break;
                case 4:
                    System.out.print("Enter reservation details to cancel: ");
                    String cancel = sc.nextLine();
                    system.cancelReservation(cancel);
                    break;
                case 5:
                    system.viewReservations();
                    break;
                case 6:
                    System.out.println("Thank you for using the Travel Booking System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
