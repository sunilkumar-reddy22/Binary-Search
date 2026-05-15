package BinarySearch.sunil;
//540
public class SingleElement {
    public static void main(String[] args) {
        int [] nums = {1,1,2,3,3,4,4,8,8};
        int target = 2;
       int ans =  search(nums,target);
        System.out.println(ans);
    }
    static int search(int [] nums,int target){
        for(int num : nums) {
            if (num == target) {
                return num;
            }
        }
        return -1;
    }
}
