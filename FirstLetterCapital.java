public class FirstLetterCapital {
    public static void main(String[] args) {
        String str = "hello world in this siddhesh you me i am";

        String[] s = str.split(" ");
        String b = "";

        for(int i = 0;i<s.length;i++){
            String word = s[i];
            String first = word.substring(0,1).toUpperCase();
            String rest = first+word.substring(1);

             b +=rest+" ";
            
        }

        System.out.println(b);


    }
}
