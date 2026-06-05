package Leetcode;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array
public class MinimumRotated {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
      int pivot =  findPivot(nums);
       if(pivot == -1) {
           System.out.println(nums[0]);
       }
       else {
           System.out.println(nums[pivot += 1]);
       }

    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //going to be four cases.
            //case 1 finding pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            //case 2.finding mid is previous.
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}