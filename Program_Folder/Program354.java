// Program354.java
import java.util.ArrayList;

public class Program354 {

    // --- School class ---
    static class School {
        private ArrayList<String> students;
        private ArrayList<String> teachers;
        private ArrayList<String> classes;

        // Constructor
        public School() {
            students = new ArrayList<>();
            teachers = new ArrayList<>();
            classes = new ArrayList<>();
        }

        // Add a student
        public void addStudent(String studentName) {
            students.add(studentName);
            System.out.println("✅ Added student: " + studentName);
        }

        // Remove a student
        public void removeStudent(String studentName) {
            if (students.remove(studentName)) {
                System.out.println("🗑️ Removed student: " + studentName);
            } else {
                System.out.println("⚠️ Student not found: " + studentName);
            }
        }

        // Add a teacher
        public void addTeacher(String teacherName) {
            teachers.add(teacherName);
            System.out.println("✅ Added teacher: " + teacherName);
        }

        // Remove a teacher
        public void removeTeacher(String teacherName) {
            if (teachers.remove(teacherName)) {
                System.out.println("🗑️ Removed teacher: " + teacherName);
            } else {
                System.out.println("⚠️ Teacher not found: " + teacherName);
            }
        }

        // Create a class
        public void createClass(String className) {
            if (!classes.contains(className)) {
                classes.add(className);
                System.out.println("🏫 Created class: " + className);
            } else {
                System.out.println("⚠️ Class already exists: " + className);
            }
        }

        // Display all school information
        public void displaySchoolInfo() {
            System.out.println("\n=== School Information ===");

            System.out.println("\n👩‍🎓 Students:");
            if (students.isEmpty()) System.out.println("No students enrolled.");
            else students.forEach(s -> System.out.println("- " + s));

            System.out.println("\n👨‍🏫 Teachers:");
            if (teachers.isEmpty()) System.out.println("No teachers available.");
            else teachers.forEach(t -> System.out.println("- " + t));

            System.out.println("\n🏫 Classes:");
            if (classes.isEmpty()) System.out.println("No classes created.");
            else classes.forEach(c -> System.out.println("- " + c));
        }
    }

    // --- Main method ---
    public static void main(String[] args) {
        School school = new School();

        // Add students
        school.addStudent("Alice Johnson");
        school.addStudent("Bob Smith");
        school.addStudent("Charlie Davis");

        // Add teachers
        school.addTeacher("Mr. Anderson");
        school.addTeacher("Ms. Brown");

        // Create classes
        school.createClass("Mathematics");
        school.createClass("Science");
        school.createClass("English");

        // Display school info
        school.displaySchoolInfo();

        // Remove a student and a teacher
        System.out.println("\n--- Updating Records ---");
        school.removeStudent("Bob Smith");
        school.removeTeacher("Ms. Brown");

        // Display updated info
        school.displaySchoolInfo();
    }
}
