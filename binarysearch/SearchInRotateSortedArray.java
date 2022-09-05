package binarysearch;

public class SearchInRotateSortedArray {
    public static void main(String[] args) {

    }
    public int sortedRotatedBinarySearch(int[] num, int target){
        int left =0;int right = num.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(num[left] == target){
                return mid;
            }
            if(num[left] < num[mid]){
                if(num[left] > target && target < num[right]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
        }
        return left;
    }
}
