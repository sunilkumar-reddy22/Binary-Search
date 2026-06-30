package Leetcode;

public class FindPivot {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 3, 2, 1, 0};
      int ans =  Find(nums);
        System.out.println(ans);
    }

    static int Find(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
            int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4cases
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid -1;
            } else if (nums[start] >= mid) {
                //then the ans might lies over left
                end = mid - 1;//we know that all the nums after piviot are smaller then start so we ignore to check.
            } else {
                //if start is start < mid then ans might be lies one the ahead of the start so start = mid + 1;
                start = mid + 1;
            }
        }
        return -1;
    }
}
