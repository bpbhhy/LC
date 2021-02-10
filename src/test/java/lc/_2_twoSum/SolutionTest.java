package lc._2_twoSum;

import lc._2_twoSum.Solution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    lc._2_twoSum.Solution solution = new Solution();

    @Test
    public void testTwoSum1(){
        int[] res = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertEquals(0, res[0]);
        assertEquals(1, res[1]);
    }

    @Test
    public void testTwoSum2(){
        int[] res = solution.twoSum(new int[]{3, 2, 4}, 6);
        assertEquals(1, res[0]);
        assertEquals(2, res[1]);
    }

}
