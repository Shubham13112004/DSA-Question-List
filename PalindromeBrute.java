public class PalindromeBrute {
    public static void main(String[] args) {
        String m = "madanm";
        String rev= "";


        for(int i=m.length()-1;i>=0;i--){
            rev=rev+m.charAt(i);
        }

        if(m.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
