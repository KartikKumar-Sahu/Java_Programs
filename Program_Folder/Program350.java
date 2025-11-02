// Program350.java
import java.util.ArrayList;

public class Program350 {

    // --- Student class ---
    static class Student {
        // Attributes
        private String name;
        private String grade;
        private ArrayList<String> courses;  // list of enrolled courses

        // Constructor
        public Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
            this.courses = new ArrayList<>();
        }

        // Method to add a course
        public void addCourse(String course) {
            if (!courses.contains(course)) {
                courses.add(course);
                System.out.println("✅ " + course + " added for " + name);
            } else {
                System.out.println("⚠️ " + name + " is already enrolled in " + course);
            }
        }

        // Method to remove a course
        public void removeCourse(String course) {
            if (courses.contains(course)) {
                courses.remove(course);
                System.out.println("🗑️ " + course + " removed for " + name);
            } else {
                System.out.println("⚠️ " + name + " is not enrolled in " + course);
            }
        }

        // Display student info
        public void displayInfo() {
            System.out.println("\nStudent Name: " + name);
            System.out.println("Grade: " + grade);
            if (courses.isEmpty()) {
                System.out.println("Courses: None");
            } else {
                System.out.println("Courses: " + courses);
            }
        }
    }

    // --- Main method ---
    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student("Alice Johnson", "10th Grade");
        Student s2 = new Student("Bob Smith", "12th Grade");

        // Add courses
        s1.addCourse("Mathematics");
        s1.addCourse("English");
        s1.addCourse("Computer Science");

        s2.addCourse("Biology");
        s2.addCourse("Chemistry");
        s2.addCourse("Physics");

        // Remove a course
        s1.removeCourse("English");
        s2.removeCourse("History");  // not enrolled — test case

        // Display student details
        System.out.println("\n=== Student Information ===");
        s1.displayInfo();
        s2.displayInfo();
    }
}
