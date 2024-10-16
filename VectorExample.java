import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Accessing elements using index
        System.out.println("Elements in the Vector:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Removing an element
        vector.remove("Banana");

        // Size of the Vector after removal
        System.out.println("\nSize of Vector after removal: " + vector.size());
    }
}
