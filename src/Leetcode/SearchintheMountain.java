package Leetcode;
//https://leetcode.com/problems/find-in-mountain-array/description/
//leetcode 1095 peak element.
public class SearchintheMountain {
    public static void main(String[] args) {
        int[] mountain = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int peak = peakIndex(mountain);
        int firstTry = order(mountain, target, 0, peak);
        if (firstTry != -1) {
            System.out.println(firstTry);
        }
    }

    static int peakIndex(int[] mountain) {
        //Finding the peak element.
        int start = 0;
        int end = mountain.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountain[mid] > mountain[mid + 1]) {
                //then it is in the decending order therefore end stay at mid.
                end = mid;
            } else {
                start = mid + 1; //if mid < mid + 1; it is in the ascedning order for better possibilites to check it goes further.
            }
        }
        return start;//finding the pivot.
    }

    static int order(int[] mountain, int target, int start, int end) {
        boolean isAsc = mountain[start] < mountain[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountain[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < mountain[mid]) {
                    end = mid - 1; //target lies on the left hand side so mid needs to check one the left side from right to left.
                } else {
                    start = mid + 1;//case target is > mid
                }
            } else {
                if (target < mountain[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}