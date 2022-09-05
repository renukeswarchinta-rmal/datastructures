package strings;

public class ReverseString {
    public static void main(String[] args) {
        char[] arr = new char[]{'h','e','l','l','o'};
        reverseString(arr);
        System.out.println(arr);
    }
    public static void reverseString(char[] str){
        int left =0;
        int right = str.length-1;
        while(left < right){
            char tmp = str[left];
            str[left]  = str[right];
            str[right] = tmp;
            left++;
            right--;
        }
    }
}