public class oddandevensum {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int oddsum=0;
        int evensum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evensum+=arr[i];
            }
            else{
                oddsum+=arr[i];
            }
        }
       System.out.println("oddsum:"+oddsum);
       System.out.println("evensum:"+evensum);
    }
    
}
