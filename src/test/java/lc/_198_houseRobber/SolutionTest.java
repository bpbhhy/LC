package lc._198_houseRobber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testRob1(){
        int[] test = {1,2,3,1};
        assertEquals(4, solution.rob(test));
    }

    @Test
    public void testRob2(){
        int[] test = {2,7,9,3,1};
        assertEquals(12, solution.rob(test));
    }
}
