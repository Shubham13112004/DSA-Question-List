import java.util.Arrays;

public class Move_Zero {

    public static int[] MoveZero(int[] arr){

        int k=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }
        }
        
             while(k<arr.length){
            arr[k++]=0;
        }

        return arr;
    } 

    public static void main(String[] args) {
        int [] arr = {0, 1, 0, 3, 12};

        arr=MoveZero(arr);

       for(int i : arr){
        System.out.print(i+" ");
       }
    }
}
