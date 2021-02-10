package lc._0120_triangle;



import java.util.ArrayList;

public class Solution {

//    // Up to Bottom
//    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
//        int n = triangle.size();
//        int[] dp = new int[n];
//        int min = Integer.MAX_VALUE;
//        dp[0] = triangle.get(0).get(0);
//        for (int i = 1; i < triangle.size(); i++) {
//            ArrayList<Integer> level = triangle.get(i);
//            int[] pre = dp.clone();
//
//            for (int j = 0; j < level.size(); j++) {
//                if (j == 0) {
//                    dp[j] = level.get(j) + pre[j];
//                } else if (j == level.size() - 1) {
//                    dp[j] = pre[j - 1] + level.get(j);
//                } else {
//                    dp[j] = Math.min(pre[j - 1] + level.get(j), pre[j] + level.get(j));
//                }
//
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            min = dp[i] < min ? dp[i] : min;
//        }
//        return min;
//    }


    // Bottom up
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int n = triangle.size();
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int min = triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                triangle.get(i).set(j, min);
            }
        }
        return triangle.get(0).get(0);
    }
}

