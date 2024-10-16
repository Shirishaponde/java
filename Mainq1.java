import java.util.HashMap;
import java.util.Map;

public class Mainq1 {
    public static void main(String[] args) {
        // Create a Map to store String keys and Integer values
        Map<String, Integer> myMap = new HashMap<>();

        // Add key-value pairs to the map
        myMap.put("John", 25);
        myMap.put("Alice", 30);
        myMap.put("Bob", 28);

        // Access values using keys
        System.out.println("Age of John: " + myMap.get("John")); // Output: Age of John: 25

        // Iterate over the map using keySet()
        for (String name : myMap.keySet()) {
            int age = myMap.get(name);
            System.out.println(name + " is " + age + " years old.");
        }

        // Check if a key exists in the map
        if (myMap.containsKey("Alice")) {
            System.out.println("Alice is in the map.");
        }

        // Remove a key-value pair from the map
        myMap.remove("Bob");

        // Clear the map
        myMap.clear();
    }
}
