public class StringB_Reverse {
    public static void main(String[] args) {
        String s = "abc";

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        
        System.out.println(sb.toString());
    }
}
