package lc._0704_binarySearch;

public class Solution {
    public int search(int[] nums, int target) {
        /*  1.
            Use left + 1 < right, having two elements when finished while loop
            both left and right are included
            left = mid + 1; right = mid - 1;
        */
//        int len = nums.length;
//        int left = 0;
//        int right =  len - 1;
//        while (left + 1 < right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] == target) {
//                return mid;
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        if (nums[left] == target) {
//            return left;
//        }
//
//        if (nums[right] == target) {
//            return right;
//        }
//
//        return -1;


        /*  2.
            Use left < right, having one element when finished while loop
            both [left, right)
            left = mid + 1; right = mid;
        */
//        int len = nums.length;
//        int left = 0;
//        int right = len;
//        while (left < right) {
//            int mid =  left + (right - left) / 2;
//            if (nums[mid] == target) {
//                return mid;
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//        return -1;

        /*  3.
            Use left <= right, having no element when finished while loop
            both [left, right]
            left = mid + 1; right = mid - 1;
        */

        int len = nums.length;
        int left = 0;
        int right =  len - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                // left = mid + 1;
                left = mid + 1;
            } else {
                // right = mid - 1;
                right = mid - 1;
            }
        }
        return -1;
    }
}
