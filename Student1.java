public class Student1 {
    String name;
    int rollnumber;
    String course;
    double[] marks;

    // Method to insert student details
    void insert(String n, int r, String c, double[] m) {
        name = n;
        rollnumber = r;
        course = c;
        marks = m;
    }

    // Method to calculate average marks
    double calculateavgmarks() {
        double totalmarks = 0;
        for (double mark : marks) {
            totalmarks += mark;
        }
        return totalmarks / marks.length;
    }

    // Method to display student details and average marks
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Course: " + course);
        for (double mark : marks) {
            System.out.println("Marks: " + mark);
        }
        System.out.println("Average Marks: " + calculateavgmarks());
    }

    public static void main(String[] args) {
        double[] m = {77.5, 98.0, 97.0, 84.0};
        Student1 s = new Student1();  // Corrected class name here
        s.insert("Sri", 23, "BCA", m);
        s.display();
    }
}