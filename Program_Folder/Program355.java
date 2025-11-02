// Program355.java
import java.util.ArrayList;
import java.util.Random;

public class Program355 {

    // --- Song class ---
    static class Song {
        private String title;
        private String artist;
        private double duration; // duration in minutes

        // Constructor
        public Song(String title, String artist, double duration) {
            this.title = title;
            this.artist = artist;
            this.duration = duration;
        }

        // Getters
        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public double getDuration() {
            return duration;
        }

        // Display song info
        public void displayInfo() {
            System.out.printf("🎵 %s by %s (%.2f mins)%n", title, artist, duration);
        }
    }

    // --- MusicLibrary class ---
    static class MusicLibrary {
        private ArrayList<Song> songs;
        private Random random;

        // Constructor
        public MusicLibrary() {
            songs = new ArrayList<>();
            random = new Random();
        }

        // Add a song
        public void addSong(Song song) {
            songs.add(song);
            System.out.println("✅ Added song: " + song.getTitle() + " by " + song.getArtist());
        }

        // Remove a song by title
        public void removeSong(String title) {
            boolean removed = false;
            for (Song s : songs) {
                if (s.getTitle().equalsIgnoreCase(title)) {
                    songs.remove(s);
                    System.out.println("🗑️ Removed song: " + title);
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                System.out.println("⚠️ Song not found: " + title);
            }
        }

        // Play a random song
        public void playRandomSong() {
            if (songs.isEmpty()) {
                System.out.println("📭 No songs in the library to play.");
                return;
            }
            int index = random.nextInt(songs.size());
            Song song = songs.get(index);
            System.out.println("\n▶️ Now Playing:");
            song.displayInfo();
        }

        // Display all songs in library
        public void displayAllSongs() {
            System.out.println("\n=== 🎶 Music Library ===");
            if (songs.isEmpty()) {
                System.out.println("No songs in the library.");
            } else {
                for (Song s : songs) {
                    s.displayInfo();
                }
            }
        }
    }

    // --- Main method ---
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        // Create songs
        Song s1 = new Song("Shape of You", "Ed Sheeran", 4.24);
        Song s2 = new Song("Blinding Lights", "The Weeknd", 3.22);
        Song s3 = new Song("Levitating", "Dua Lipa", 3.23);
        Song s4 = new Song("Bohemian Rhapsody", "Queen", 5.55);

        // Add songs to library
        library.addSong(s1);
        library.addSong(s2);
        library.addSong(s3);
        library.addSong(s4);

        // Display all songs
        library.displayAllSongs();

        // Play a random song
        library.playRandomSong();

        // Remove a song
        System.out.println("\n--- Removing a Song ---");
        library.removeSong("Levitating");

        // Display updated library
        library.displayAllSongs();

        // Try playing another random song
        library.playRandomSong();
    }
}
