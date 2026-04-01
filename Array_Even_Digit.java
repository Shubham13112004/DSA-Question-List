public class Array_Even_Digit {
    public static void main(String[] args) {
        
        int [] arr = {2,12, 345, 2, 6, 7896} ;  
        for(int n : arr){
            int temp = n;
            int c=0;
            while(temp!=0){
               
                temp/=10;
                c++;
            }
            if(c%2==0){
                System.out.println(n);
            }
        }
    }
}
