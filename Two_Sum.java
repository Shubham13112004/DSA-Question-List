import java.util.ArrayList;
import java.util.HashSet;

public class Two_Sum {

    public static ArrayList<Integer> Sum(int[] arr,int target){
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int comp = target-arr[i];

            if(hs.contains(comp)){
                al.add(comp);
                al.add((arr[i]));

                return al;
            }
            hs.add(arr[i]);
        }

        return al;
    }
    public static void main(String[] args) {
        int [] arr = {2,7,5,9,4};
        int target = 9;

        System.out.println(Sum(arr,target));
    }
}
