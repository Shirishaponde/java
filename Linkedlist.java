import java.util.*;
public class Linkedlist {
    public static void main(String[]args){
LinkedList<String> al=new LinkedList<String>();
al.add("avni");
al.add("kajal");
al.add("videhi");
al.add("arya");
Iterator<String>itr=al.iterator();
while(itr.hasNext()){
    System.out.println(itr.next());
}
    }
}
