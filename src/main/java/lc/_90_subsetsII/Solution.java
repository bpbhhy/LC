package lc._90_subsetsII;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(res, nums, new ArrayList<Integer>(), 0);
        return res;
    }

    private void helper(ArrayList<ArrayList<Integer>> res, int[] nums, ArrayList<Integer> list, int start) {
        res.add(new ArrayList<Integer>(list));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            helper(res, nums, list, i + 1);
            list.remove(list.size() - 1);
        }

    }
}
