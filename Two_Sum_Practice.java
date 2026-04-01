import java.util.HashMap;
import java.util.HashSet;

public class Two_Sum_Practice {

    public static void main(String[] args) {
      int [] arr = {2,7,5,9,6,1};
    int target =9;

    HashSet<Integer> set = new HashSet<>();

    for(int i=0;i<arr.length;i++){
        int comp = target-arr[i];

        if(set.contains(comp)){
            System.out.println(comp+" "+arr[i]);
        }

        set.add(arr[i]);
    }  
    }

    
    
}
