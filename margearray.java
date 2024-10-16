public class margearray {
    
    public static void main(String[]args){
        int arr1[]={1,2,3,4,5};
        int arr2[]={6,7,8,9,0};
        System.out.println("array1:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }
        
        System.out.println("\narray1:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
        }
      
        int arr[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr[arr1.length+i]=arr2[i];
        }
        System.out.println("\nmerged array:");
     
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
}
