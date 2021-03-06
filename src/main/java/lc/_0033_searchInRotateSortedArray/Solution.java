package lc._0033_searchInRotateSortedArray;

public class Solution {

    /*
                /
              /
            /
         start                    end
                                 /
                               /
                             /
     */

    public int search(int[] nums, int target) {

        /*
            start <= end
         */
        int start = 0;
        int end =  nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[start] <= nums[mid]) {
                // also can be <=
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // also can be <=
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;

         /*
            start + 1 < end
         */

//

    }
}
