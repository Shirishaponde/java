import java.util.*;
class arraylist{
    public static void main(String[]args){
        ArrayList<String>list=new ArrayList<String>();
        list.add("neel");
        list.add("viyansh");
        list.add("kabir");
        list.add("advaik");
        list.add("shivansh");
       Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}