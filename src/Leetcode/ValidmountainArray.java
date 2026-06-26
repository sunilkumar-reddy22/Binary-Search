package Leetcode;
//https://leetcode.com/problems/valid-mountain-array/description/
public class ValidmountainArray {
    public static void main(String[] args) {
        int[] arr = {3, 5,5};
       boolean ans = Find(arr);
        System.out.println(ans);
    }

    static boolean Find(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == arr[mid + 1]) {
                return false;
            }
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                //arr[mid] < arr[mid + 1] then start = mid + 1;
                start = mid + 1;
            }
        }
        return true;
    }
}