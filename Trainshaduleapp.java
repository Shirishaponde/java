import java.util.*;
public class Trainshaduleapp {
    public static void main(String[] args) {
        
        LinkedList<String> trainStops = new LinkedList<String>();
        trainStops.add("Station A");
        trainStops.add("Station B");
        trainStops.add("Station C");
        trainStops.add("Station D");

       
        System.out.println("Train Route:");
        for (String stop : trainStops) {
            System.out.println(stop);
        }

       
        trainStops.remove("Station B");

       
        System.out.println("\nUpdated Train Route:");
        for (String stop : trainStops) {
            System.out.println(stop);
        }
}
}