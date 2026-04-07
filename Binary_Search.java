import java.util.Arrays;

public class Binary_Search {

    public static int BinaryS(int[] arr , int target){
        int left = 0;
        int right=arr.length-1;


        while(left<=right){
            int mid = left+(right-left)/2;

            if(target==arr[mid]){
                return mid;
            }else if(target>arr[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }


        }

        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {5,3,8,7,3,1};
        Arrays.sort(arr);
        int key=7;

        System.out.println(BinaryS(arr,key));
    }
}
