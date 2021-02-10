package lc._0064_minimumPathSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testMinPathSum1(){
        int[][] test = {{1,3,1},{1,5,1},{4,2,1}};
        assertEquals(7, solution.minPathSum(test));
    }

    @Test
    public void testMinPathSum2(){
        int[][] test = {{1,2,3},{4,5,6}};
        assertEquals(12, solution.minPathSum(test));
    }

}
