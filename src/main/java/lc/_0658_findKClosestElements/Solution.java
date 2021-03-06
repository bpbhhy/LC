package lc._0658_findKClosestElements;


import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        /* My Solution: O((log N) + K)
            first find the nearest index
            then start from the index expend to left and right
            then add them all to result array
         */
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                index = mid;
                break;
            } else if (arr[mid] < x) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (index == -1) {
            index = (Math.abs(arr[start] - x) <= Math.abs(arr[end] - x)) ? start : end;
        }

        List<Integer> result = new ArrayList<Integer>();
//        int left = index, right = index;
//        if (k > 0) k--;
//        while (k > 0 && (left > 0 || right < arr.length - 1)) {
//            if (left > 0 && right < arr.length - 1) {
//                if (Math.abs(arr[left - 1] - x) <= Math.abs(arr[right + 1] - x)) {
//                    left--;
//                    k--;
//                } else {
//                    right++;
//                    k--;
//                }
//            } else if (left <= 0) {
//                right++;
//                k--;
//            } else  {
//                left--;
//                k--;
//            }
//        }
//
//        for (int i = left; i <= right && i < arr.length; i++) {
//            result.add(arr[i]);
//        }

        // better way
        // less IF condition
        int left = index, right = index;
        if (k > 0) k--;
        while (k > 0) {
            if ( right + 1 >= arr.length || (left > 0 && (x - arr[left - 1]) <= (arr[right + 1] - x))) {
                left--;
                k--;
            } else  {
                right++;
                k--;
            }
        }
        for (int i = left; i <= right && i < arr.length; i++) {
            result.add(arr[i]);
        }

        return result;
    }

}
