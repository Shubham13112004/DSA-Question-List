public class SumOfDigitsDemo {
    public static int sum(int num){
        if(num<=1){
            return num;
        }

        return (num%10)+sum(num/10);
    }
    public static void main(String[] args) {
        System.out.println(sum(1));
    }
}
