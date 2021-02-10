package lc._0095_uniqueBSTII;

import lp.practice.lc.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        return genTreeList(1, n);
    }

    private List<TreeNode> genTreeList(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        if (start > end) {
            list.add(null);
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftTree = genTreeList(start, i - 1);
            List<TreeNode> rightTree = genTreeList(i + 1, end);

            for (TreeNode left : leftTree) {
                for (TreeNode right : rightTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    list.add(root);

                }
            }
        }
        return list;
    }
}
