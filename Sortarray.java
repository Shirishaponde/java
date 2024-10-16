public class Sortarray {
    public static void main(String[]args){
        int arr[]={23,56,11,32,77,54};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[0]<=arr[i]){
                System.out.println(arr[i]);
            }
        }
    }
}
