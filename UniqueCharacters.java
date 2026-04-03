public class UniqueCharacters {
    public static void main(String[] args) {
        String s = "abcdefb";

        int[] arr = new int[26];

        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']>0){
                System.out.println("Duplicate");
                return;
            }

            arr[s.charAt(i)-'a']++;
        }

        System.out.println("Not Duplicate");
    }
}
