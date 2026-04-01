import java.util.Arrays;

public class Bubble_Sort{

    public static int [] Bubble(int[] nums){

        int n = nums.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }


        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        System.out.println(Arrays.toString(Bubble(arr)));
    }
}