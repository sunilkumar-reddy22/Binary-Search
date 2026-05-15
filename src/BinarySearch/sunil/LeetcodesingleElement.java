package BinarySearch.sunil;

public class LeetcodesingleElement {
    public static void main(String[] args) {
        int[] nums = {1, 1,2, 2, 3, 4, 4, 8, 8};
      int ans =  find(nums);
        System.out.println(ans);
    }

    static int find(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        //we are checking for obvious element.
        while (left < right) {
            //finding the mid element.
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if(nums[mid] == nums[mid + 1]) {
                //if the pair matches the single element would be on the right side
                left = mid + 2; //why 2 why not 1 or other number how exactly it is giving ans with + 2 lastly
            }
            else {
                //if the pair is not equal to means already shift has happend.so go left to check.
                right = mid;
            }
        }
        return nums[left];
    }
}
