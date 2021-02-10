package lc._2_twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < nums.length; i++) {
             if (map.containsKey(nums[i])) {
                 return new int[]{map.get(nums[i]), i};
             } else {
                 map.put(target - nums[i], i);
             }
         }
         return new int[]{-1, -1};

        // Following approach is not suit for this question
        // Since we need to return index of the element
        // We can't sort the array
        // and this approach takes O(nlogn)
        // Using HashMap will only take O(n)
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            int remain = target - nums[i];
//            if (remain < 0) {
//                break;
//            } else {
//                int start = i + 1;
//                int end = nums.length;
//                int mid;
//                while (start < end) {
//                    mid = start + (end - start) / 2;
//                    if (nums[mid] == remain) {
//                        return new int[]{i, mid};
//                    } else if (nums[mid] < remain) {
//                        start = mid + 1;
//                    } else {
//                        end = mid;
//                    }
//                }
//
//            }
//        }
//
//        return new int[]{-1, -1};
    }
}
