public class AnagramCheck {
    public static void main(String[] args) {
        String s = "listin";
        String t = "silent";

        int [] freq = new int[26];

        if(s.length()!=t.length()){
            System.out.println("Not Anagram");
            return;
        }

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int c : freq){
            if(c!=0){
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");

    }
}
