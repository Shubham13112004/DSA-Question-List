public class Contigues_Subarray {

    public static int Cal(int[] arr){
        int MaxSum=0;
        int CSum=0;

        for(int i=0;i<arr.length;i++){
           

            CSum=Math.max(CSum+arr[i],arr[i]);

            MaxSum=Math.max(MaxSum, CSum);
        }


        return MaxSum;
    }
    public static void main(String[] args) {
        int [] arr = {2, -3, 4, -1, 2, 1, -5, 4};

       System.out.println(Cal(arr));

    }
}
