package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSumToTarget {
    public static void main(String[] args) {
        TwoNumberSumToTarget twoNumberSumToTarget = new TwoNumberSumToTarget();
        int[] res = twoNumberSumToTarget.twoNumberSumToTarget(new int[]{1,2,3,4,7},3);
        System.out.println(Arrays.toString(res));
    }
    public int[] twoNumberSumToTarget(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
               return new int[]{map.get(complement),i};
            }else{
                map.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
