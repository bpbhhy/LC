package lc._0198_houseRobber;

public class Solution {

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {

            if (i < 2) {

                dp[i] = Math.max(nums[0], nums[1]);

                continue;
            }

            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);

        }

        return dp[dp.length - 1];
    }
}
