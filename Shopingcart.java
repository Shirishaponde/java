import java.util.*;

public class Shopingcart 
{

    public static void main(String args[])
    {
		ArrayList<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
        System.out.println("Items in cart:");
        for(String items:list)
        {
            System.out.println(items);
        }
		list.remove("a");
        System.out.println("Items in cart after removing:");
        for(String items:list)
        {
            System.out.println(items);
        }
    }
}



