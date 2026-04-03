public class PalindromNo {
    public static void main(String[] args) {
        int n = 1121;

        int temp = n;
        int p_no=0;

        while(n>0){
            int digit = n%10;
            p_no=p_no*10+digit;
            n=n/10;
        }

        if(temp==p_no){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
