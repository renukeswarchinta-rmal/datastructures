package integers;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,4,3,1,2,1,2}));
        System.out.println(singleNumberOptimized(new int[]{4,4,3,1,2,1,2}));
    }

    // Below method has Time complexity = o(n) Space complexity = O(n)
    public static int singleNumber(int[] num){
        Set<Integer> s = new HashSet<>();
        if(num.length == 1){
            return num[0];
        }
        for(int i=0;i<num.length;i++){
            if(!s.contains(num[i])){
                s.add(num[i]);
            }else{
                s.remove(num[i]);
            }
        }
        return s.iterator().next();
    }

    // Below method has Time complexity = o(n) Space complexity = O(1)
    public static int singleNumberOptimized(int[] num) {
        int ans = num[0];
        for(int i= 1 ;i <num.length;i++){
            ans = ans ^ num[i];
        }
        return ans;
    }
    // XOR between same numbers will give 0 2 ^ 2 =0
    // XOR between 4 ^ 0 = 4
}
