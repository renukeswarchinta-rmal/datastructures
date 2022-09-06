package arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MoveZeros {
    public static void main(String[] args) {
        int nums [] = {1,5,3,4,0,2,11,0,4,6,0};
        MoveZeros moveZeros = new MoveZeros();
        moveZeros.moveZerosToLast(nums);
        System.out.println(Arrays.toString(nums));
        moveZeros.optimizedSolution(nums);
        System.out.println(Arrays.toString(nums));
    }
    public void moveZerosToLast(int[] nums){
        if(nums.length == 1) return;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                queue.add(nums[i]);
            }
        }
        int index =0;
        while(queue.size() != 0){
            nums[index] = queue.poll();
            index++;
        }
        for(int i = index;i<nums.length;i++){
            nums[i] =0;
        }
    }
    public void optimizedSolution(int[] nums){
        int right =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[right] = nums[i];
                right++;
            }
        }
        for(int j= right;j<nums.length;j++){
            nums[j] =0;
        }
    }
}
