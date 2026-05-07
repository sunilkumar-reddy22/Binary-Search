package BinarySearch.sunil;

public class UnsortedArray {
    public static void main(String[] args) {
        //unsorted array.
        int[] nums = {90, 70, 18, 12, 6, 4, 3, 1};
        int target = 6;
        int result = Find(nums, target);
        System.out.println(result);
    }

    static int Find(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int ans = -1;
        //running while loop indicating how many val are left.
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target) {
                return mid;

            } else if (nums[mid] < target) {
                end = mid - 1;   //opposite sorted array.
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}

