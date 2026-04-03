public class StringCompress {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String s = "aaabbccccd";

        int i=0;

        while(i<s.length()){
            int count =0;

            char curr = s.charAt(i);

            while(i<s.length() && s.charAt(i)==curr){
               count++;
               i++;
            }

             sb.append(curr);
             sb.append(count);

        }

        System.out.println(sb.toString());


    }
}
