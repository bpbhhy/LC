package lc._11_containerWithMostWater;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testMaxArea1() {
        int[] test = new int[]{1,8,6,2,5,4,8,3,7};
        assertEquals(49, solution.maxArea(test));
    }

    @Test
    public void testMaxArea2() {
        int[] test = new int[]{1,1};
        assertEquals(1, solution.maxArea(test));
    }

    @Test
    public void testMaxArea3() {
        int[] test = new int[]{4,3,2,1,4};
        assertEquals(16, solution.maxArea(test));
    }
}
