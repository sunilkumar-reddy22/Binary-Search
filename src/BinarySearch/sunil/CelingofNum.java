package BinarySearch.sunil;

public class CelingofNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 8, 12, 14, 16, 17};
        int target = 5;
       int ans = search(arr, target);
        System.out.println(ans);

    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) /2;
            //we targeting 15 which is not present in the array we are expecting 16.
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {  //if mid > target store the valid celing in the ans and check end = mid -1 if any valid element gonna find,if not return ans.
            ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}