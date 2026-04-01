import java.util.Stack;

public class Valid_Paranthesis {
    public static void main(String[] args) {
        String nums = "()[]{}";

        Stack<Character> s = new Stack<>();

        for(char c : nums.toCharArray()){

            if(c=='(' || c=='{' || c=='['){
                s.push(c);
            }else{
                if(s.isEmpty()){
                    System.out.println("Invalid");
                    return;
                }

                char top = s.pop();

                if(c==')' && top!='('){
                    System.out.println("Invalid");
                    return;
                }
                if(c==']' && top!='['){
                    System.out.println("Invalid");
                    return;
                }
                if(c=='}' && top!='{'){
                    System.out.println("Invalid");
                    return;
                }
            }
        }

        if(s.isEmpty()){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}