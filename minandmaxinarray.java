

public class minandmaxinarray {
    public static void main(String[]args){
        int arr[]={11,23,45,56,88,93};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum:"+min);
        System.out.println("maximum:"+max);
    }
}
