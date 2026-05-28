package BinarySearch.sunil;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 7, 16, 18, 19, 20};
        int target = 7;
      int ans =  find(nums, target);
        System.out.println(ans);

    }

    static int find(int[] nums, int target) {
        //we are taking size of 2 initially.
        int start = 0;
        int end = 1;
        while (target > nums[end]) {
            int newstart = end + 1;
            //double the size.
            end = end + (end - start + 1) * 2;
            start = newstart;
        }
        return search(nums, target, start, end);
    }

    static int search(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start + 1) / 2;
            if (target < nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}