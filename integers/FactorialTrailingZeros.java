package integers;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        System.out.println(trailingZeros(25));
    }
    public static int trailingZeros(int n){
        int count = 0;
        for(int i= 5;i <=n ;i= i*5){
            count = count + n/i;
        }
        return count;
    }
}
