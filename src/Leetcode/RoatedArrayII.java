package Leetcode;

public class RoatedArrayII {
    public static void main(String[] args) {
        int [] nums = {2,5,6,0,0,1,2};
       int target = 0;
     boolean  result =  search(nums,target);
        System.out.println(result);
        //rotating array
    }
    static boolean search(int [] nums, int target){
        int start = 0;
        int end = nums.length -1;
        //starting from indexes.
        while(start <= end){
            //finding mid.
            int mid = start + (end - start)/2;
            //Finding target with comparing with mid val.
            if(target == nums[mid]){
                return true;
            }
            //Finding duplicates. go left to right, got mid to end. to check the duplicates.
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
                //avoiding duplicates.
            }
            //left side array.
            else if(nums[start] <= nums[mid]){
                if(target >= nums[start]&& target < nums[mid]){
                    end = mid -1;

                }
                else{
                    start = mid + 1;
                }
            }
            //now right side.
            else{
                if(target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }

        }
        return false;
    }
}


