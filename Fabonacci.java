import java.util.Scanner;
public class Fabonacci {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=0,n2=1;
        int n3=sc.nextInt();
        for(int i=1;i<=n3;i++){
            System.out.println(n1+" ");
            int sum=n1+n2;
            n1=n2;
            n2=sum;
        }

    }
    
}
