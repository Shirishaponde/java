import java.util.Scanner;

public class vowelorconsonent {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char x=sc.next().charAt(0);
if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U'||x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
    System.out.println(x+" is vowel");
}else{
    System.out.println(x+" is consonant");
}


    }
}
