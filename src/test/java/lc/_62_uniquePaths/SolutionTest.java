package lc._62_uniquePaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testUniquePaths1(){
        int m = 3, n = 7;
        assertEquals(28, solution.uniquePaths(m, n));
    }

    @Test
    public void testUniquePaths2(){
        int m = 3, n = 2;
        assertEquals(3, solution.uniquePaths(m, n));
    }


}
