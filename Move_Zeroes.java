import java.util.Arrays;

public class Move_Zeroes{
    public static void main(String[] args) {
        int [] arr = {4,0,0,1,0,3,9,8};

        int k=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }
        }

        while(k<arr.length){
            arr[k++]=0;
        }


        System.out.println(Arrays.toString(arr));


    }
}