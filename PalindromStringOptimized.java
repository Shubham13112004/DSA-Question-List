public class PalindromStringOptimized {
    public static void main(String[] args) {
        String str = "madam";

        int l = 0;
        int r=str.length()-1;

        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                System.out.println("Not Palindrom");
                return;
            }

             l++;
            r--;
            }

           System.out.println("Palindrom");
        }


    }

