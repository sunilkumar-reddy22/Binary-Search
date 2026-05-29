package Leetcode;
import java.util.Arrays;
public class ArrayPartition {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        //target = 4;
      int ans =  search(nums);
        System.out.println(ans);
    }

    static int search(int[] nums) {
        //need to sort the arrays.
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i]; //sum = sum + nums.
        }
        return sum;
    }
}