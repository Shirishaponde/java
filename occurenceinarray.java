public class occurenceinarray {
    public static void main(String[]args){
        int[] arr={1,2,3,4,3,2,1,4,4,3};
        int ele=4;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[0]==arr[i]){
             count++;
        }
        
    }
    System.out.println("element repeated "+count+" times");
}
}
