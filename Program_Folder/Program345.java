// Program345.java
import java.util.ArrayList;

public class Program345 {

    // Book class
    static class Book {
        // Attributes
        private String title;
        private String author;
        private String isbn;

        // Constructor
        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        // Getters
        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getIsbn() {
            return isbn;
        }

        // Display book details
        public void displayInfo() {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }

    // BookCollection class to manage books
    static class BookCollection {
        private ArrayList<Book> books = new ArrayList<>();

        // Method to add a book
        public void addBook(Book book) {
            books.add(book);
            System.out.println("✅ Added book: " + book.getTitle());
        }

        // Method to remove a book by ISBN
        public void removeBook(String isbn) {
            boolean removed = false;
            for (Book book : books) {
                if (book.getIsbn().equals(isbn)) {
                    books.remove(book);
                    System.out.println("🗑️ Removed book: " + book.getTitle());
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                System.out.println("⚠️ No book found with ISBN: " + isbn);
            }
        }

        // Method to display all books
        public void displayAllBooks() {
            if (books.isEmpty()) {
                System.out.println("📭 No books in the collection.");
            } else {
                System.out.println("\n=== Book Collection ===");
                for (Book b : books) {
                    b.displayInfo();
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        BookCollection library = new BookCollection();

        // Create some books
        Book b1 = new Book("Java Fundamentals", "John Smith", "ISBN001");
        Book b2 = new Book("Python Basics", "Alice Brown", "ISBN002");
        Book b3 = new Book("C++ Programming", "David Johnson", "ISBN003");

        // Add books to the collection
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Display all books
        library.displayAllBooks();

        // Remove one book
        System.out.println("\nRemoving book with ISBN002...");
        library.removeBook("ISBN002");

        // Display remaining books
        library.displayAllBooks();
    }
}
