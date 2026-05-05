package BinarySearch.sunil;
import java.util.Arrays;
public class FindTarget {
    public static void main(String[] args) {
        int [] nums = {2,4,5,6,7,9,16};    //Sorted array
        int target = 9;
      int result =  Find(nums,target);
       // int [] ans = {result};
      //  System.out.println(Arrays.toString(ans));
        System.out.println(result);
    }
    static int Find(int [] nums, int target) {
        //Initializing start range.
        int start = 0;
        int last = nums.length - 1;
        //if not found the value return -1.
        int ans = -1;
        while (start <= last) {
            //finding the mid value.
            int mid = start + (last - start) / 2;
            if (nums[mid] == target) {
                //storing the value.
                ans = mid;
                last = mid -1;        //if i remoove this im not getting any output.
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return ans;
    }
}
