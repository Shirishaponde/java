public class Palindrome {
    public static void main(String[]args){
int num=3553, reversednum=0,reminder;
int originalnum=num;
while(num!=0){
reminder=num%10;
reversednum=reversednum*10+reminder;
num/=10;
}
if(originalnum==reversednum){
    System.out.println(originalnum+" is palindrome");
}else{
    System.out.println(originalnum+" is not palindrome");
}
    }
}
