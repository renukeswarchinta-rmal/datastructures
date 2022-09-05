package integers;

public class MathPowerProblem {

    public static void main(String[] args) {
        System.out.println(myPower(2,10));
    }
    //Pow(x,n) = Pow(2,10);
    public static double myPower(double x, int n){
            double ans = 1.0;
            long num = n;
            if(n < 0){
                num = -1 * num;
            }
            while(num > 0){
                if( num % 2 == 0){
                    x = x * x;
                    num = num/2;
                }else {
                    ans = ans * x;
                    num = num - 1;
                }
            }
            if(n < 0){
                return (double) 1/ (double) ans;
            }
            return  ans;
    }
}
