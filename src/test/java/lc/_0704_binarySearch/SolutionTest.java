package lc._0704_binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testSearch(){
        int[] test = {-1,0,3,5,9,12};
        int target = 9;
        assertEquals(4, solution.search(test, target));
    }

    @Test
    public void testSearch2(){
        int[] test = {-1,0,3,5,9,12};
        int target = 2;
        assertEquals(-1, solution.search(test, target));
    }
}
