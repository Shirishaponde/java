import java.util.*;

public class Studentrecord {
    String name;
    int id;
    int grade;

    // Method to insert student details
    void insert(String n, int i, int g) {
        name = n;
        id = i;
        grade = g;
    }

    // Method to update student details (not used in this code but can be implemented)
    void update(String n, int i, int g) {
        name = n;
        id = i;
        grade = g;
    }

    // Override the toString() method to display student details
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Grade: " + grade;
    }

    public static void main(String[] args) {
        // Create an ArrayList to store Studentrecord objects
        ArrayList<Studentrecord> students = new ArrayList<Studentrecord>();

        // Create student objects and add them to the ArrayList
        Studentrecord s1 = new Studentrecord();
        s1.insert("Alice", 101, 85);
        students.add(s1);

        Studentrecord s2 = new Studentrecord();
        s2.insert("Bob", 102, 92);
        students.add(s2);

        Studentrecord s3 = new Studentrecord();
        s3.insert("Charlie", 103, 78);
        students.add(s3);

        // Display all students
        System.out.println("All Students:");
        for (Studentrecord student : students) {  // Corrected the type here
            System.out.println(student);  // Implicitly calls the toString() method
        }
    }
}
