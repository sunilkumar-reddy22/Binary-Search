package BinarySearch.sunil;

public class FloorofNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 10;     //but it needs to return the 9 means it index is 3.
      int ans =  search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
            ans = mid;
                //if it is less the target the ans might be in lft the smallest side so we assume mid is answer for now.
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
