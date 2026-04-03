public class remove_Occurance {
    public static void main(String[] args) {
        String str = "banana";
        char remove = 'a';


        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()){
            if(c!=remove){
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}
