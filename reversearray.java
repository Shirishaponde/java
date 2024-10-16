public class reversearray {
    public static void main(String[]args){
        int[] arr={1,2,3,4};
        System.out.println("Array before reverse:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Array after reverse:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
       
    }
}
