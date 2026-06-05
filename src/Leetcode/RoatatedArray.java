package Leetcode;

public class RoatatedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 2;
        int ans = search(nums,target);
        System.out.println(ans);
    }
        static int search(int [] nums,int target) {
            int pivot = findPivot(nums);
            //if pivot is not found just do binary search.
            if (pivot == -1) {
                return binarysearch(nums, target, 0, nums.length - 1);
            }
            if (nums[pivot] == target) {
                return pivot;
            }
            //search in lefthalf.
            if (target >= nums[0]) {
                return binarysearch(nums, target, 0, pivot - 1);
            }

            //search in right half.
            return binarysearch(nums, target, pivot + 1, nums.length - 1);
        }
        static int binarysearch(int [] nums,int target,int start, int end) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }

    static int findPivot(int[] nums) {
        //finding the pivot.
        int start = 0;
        int end = nums.length - 1;
        //Finding the mid.
        while(start <= end) {
            int mid = start + (end - start) / 2;
            //4cases over here.
            if (mid < end && nums[mid] > nums[mid + 1]) {  //and means all the condition should be true.
                return mid;
            }
            //case 2 if the mid is less the previous one the return mid -1;
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            //case 3.
            if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
