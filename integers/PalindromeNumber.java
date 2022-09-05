package integers;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1234321));
    }
    public static boolean isPalindrome(int n){
        // return false if negitive number
        // return false if number ends with 0 not only digit 0
        if(n < 0 || (n != 0 && n %10 ==0)){
            return false;
        }
        int reverse = 0;
        int num =n;
        while (num > reverse ){
            int lastDigit = num % 10; // 1
            reverse = reverse * 10 + lastDigit; // 1
            num = num/10; // 1222
        }
        return num == reverse/10 || num == reverse ;
    }
}

/* 12221
 12221 > 0
 */