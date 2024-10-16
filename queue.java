import java.util.*;
public class queue {
    public static void main(String[]args){
        Deque<String> deque=new ArrayDeque<String>();
        deque.add("Goutam");
        deque.add("karan");
        deque.add("ajay");
        for(String str:deque){
            System.out.println(str);
        }
    }
    
}
