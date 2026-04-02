public class PrintAlternateString {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "xyz";

        int n = s1.length()+s2.length();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){

            if(i<s1.length()){
                 sb.append(s1.charAt(i));
            }
           
             if(i<s2.length()){
                 sb.append(s2.charAt(i));
            }
        }

        System.out.println(sb.toString());

    }
}
