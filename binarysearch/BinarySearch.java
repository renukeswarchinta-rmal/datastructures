package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10,11,12};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(num,4));
    }
    public int binarySearch(int[] num, int target){
        int left =0; int right = num.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(num[mid] == target){
                return mid;
            }
            if(target < num[mid]){
                right = mid-1;
            }else{
                left = mid +1;
            }
        }
        return -1;
    }
}
