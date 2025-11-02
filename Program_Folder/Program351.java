// Program351.java
import java.util.ArrayList;

public class Program351 {

    // --- Book class ---
    static class Book {
        private String title;
        private String author;

        // Constructor
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        // Getters
        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        // Display book info
        public void displayInfo() {
            System.out.println("📘 Title: " + title + " | Author: " + author);
        }
    }

    // --- Library class ---
    static class Library {
        private ArrayList<Book> books;

        // Constructor
        public Library() {
            books = new ArrayList<>();
        }

        // Add a book to the library
        public void addBook(Book book) {
            books.add(book);
            System.out.println("✅ Added: \"" + book.getTitle() + "\" by " + book.getAuthor());
        }

        // Remove a book by title
        public void removeBook(String title) {
            boolean removed = false;
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    books.remove(book);
                    System.out.println("🗑️ Removed: \"" + book.getTitle() + "\"");
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                System.out.println("⚠️ No book found with title: " + title);
            }
        }

        // Display all books in the library
        public void displayBooks() {
            System.out.println("\n=== Library Collection ===");
            if (books.isEmpty()) {
                System.out.println("📭 No books in the library.");
            } else {
                for (Book book : books) {
                    book.displayInfo();
                }
            }
        }
    }

    // --- Main method ---
    public static void main(String[] args) {
        Library library = new Library();

        // Create some books
        Book b1 = new Book("Java Programming", "John Smith");
        Book b2 = new Book("Python Essentials", "Alice Brown");
        Book b3 = new Book("C++ Mastery", "Robert Johnson");

        // Add books to library
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Display all books
        library.displayBooks();

        // Remove a book
        System.out.println("\n--- Removing a Book ---");
        library.removeBook("Python Essentials");

        // Try to remove a non-existing book
        library.removeBook("Data Science Basics");

        // Display updated collection
        library.displayBooks();
    }
}
