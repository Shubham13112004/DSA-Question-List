public class MaximumSUbarray{

public static void main(String[] args) {
    int [] arr = {-3,1,-8,4,-1,2,1,-5,5};

    int CSum = 0;
    int MaxSum = Integer.MIN_VALUE;

    for(int n : arr){
        if ( CSum<0){
            CSum=0;
        }

        CSum+=n;
        MaxSum = Math.max(CSum,MaxSum);
    }

  System.out.println(MaxSum);

}


}