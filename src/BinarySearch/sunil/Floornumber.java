package BinarySearch.sunil;

public class Floornumber {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 7, 8, 9};
        int target = 10;
        //not found return 9
      int res =  search(nums, target);
        System.out.println(res);
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return target;
            } else if (nums[mid] < target) {
                ans = mid;
                start = mid + 1;
            } else {
                mid = end - 1;
            }
        }
        return ans;
    }
}
