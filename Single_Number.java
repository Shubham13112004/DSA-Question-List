public class Single_Number {
    public static void main(String[] args) {
        int[] arr={3,1,7,3,1,7,9};
        
        int d=0;


        for(int n : arr){
            d^=n;
        }
        System.out.println(d);
    }
}


