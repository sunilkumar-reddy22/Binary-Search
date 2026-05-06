package BinarySearch.sunil;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3};
        int ans = Find(nums);
        System.out.println(ans);
    }

    static int Find(int[] nums) {
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int num : nums) {
            actual += num;
        }
        return expected - actual;
    }
}
