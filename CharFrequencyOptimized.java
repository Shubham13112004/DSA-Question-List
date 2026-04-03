import java.util.HashMap;

public class CharFrequencyOptimized {
    public static void main(String[] args) {
        String str = "leetcode";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}