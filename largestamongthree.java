import java.util.Scanner;

public class largestamongthree {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greatest among three");
        }else if(b>a && b>c){
           System.out.println(b+" is greatest among three");  
        }else{
            System.out.println(c+" is greatest among three");  
        }
    }
}
