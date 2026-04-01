import java.util.Arrays;

public class Merge_Sorted {
    public static void main(String[] args){
        int[] a = {3,5,7,9};
        int[] b={1,2,4,6};


        int [] result = new int[a.length+b.length];

        int i=0,j=0,k=0;

        while(i<a.length && j<b.length){
            result[k++]=a[i]<b[j]?a[i++]:b[j++];
        }

        while(i<a.length){
            result[k++]=a[i++];
        }
         while(j<b.length){
            result[k++]=b[j++];
        }
        System.out.println(Arrays.toString(result));
    }
}
