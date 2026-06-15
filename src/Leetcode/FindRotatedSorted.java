package Leetcode;

public class FindRotatedSorted {
    public static void main(String[] args) {
        int [] nums = {3,4,5,1,2};
      boolean ans = find(nums);
        System.out.println(ans);
    }
    static boolean find(int [] nums){
        int count = 0;
        int n = nums.length;
        for(int i = 0 ; i < n; i++){
            if(nums[i] > nums[(i+1) % n]){
                count++;
            }//count should not be more than one in this case.
            if(count > 1){
                return false;
            }
        }
        return true;
    }
}