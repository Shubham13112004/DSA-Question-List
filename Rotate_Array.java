import java.util.Arrays;

public class Rotate_Array {

    public static int [] Rotate(int[] arr,int l,int r){
        while(l<r){
            int temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;
        }      
        return arr;
     
    } 
    public static void main(String[] args) {

        int k =2;
        int[] arr = {3,4,5,6,7,8};

        int n = arr.length;
         for(int p : arr){
                System.out.print(p);
            }
  
            System.out.println("===================");


        k=k%n;
        
            Rotate(arr,0,n-1);
            Rotate(arr,0,k-1);
            Rotate(arr,k,n-1);

            for(int p : arr){
                System.out.print(p);
            }
    }
}
