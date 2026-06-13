package Leetcode;

public class Mountainarray {
    public static void main(String[] args) {
        int[] nums = {0, 10,0};
       int ans =  search(nums);
        System.out.println(ans);
    }
//
    static int search(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            //if mid is greater than the mid + 1 the it is in the decending order. so we store the mid val in the end.
            if (nums[mid] > nums[mid + 1]) { //left to righ
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; //or the end,both start and end points the largest element in the array
    }
}
