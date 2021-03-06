package lc._0658_findKClosestElements;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testFindClosestElements1() {
        int[] test = new int[]{1,2,3,4,5};
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,4));
        assertEquals(expected, solution.findClosestElements(test, 4, 3));
    }

    @Test
    public void testFindClosestElements2() {
        int[] test = new int[]{1,2,3,4,5};
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,4));
        assertEquals(expected, solution.findClosestElements(test, 4, -1));
    }

    @Test
    public void testFindClosestElements3() {
        int[] test = new int[]{0,0,1,2,3,3,4,7,7,8};
        List<Integer> expected = new ArrayList<>(Arrays.asList(3,3,4));
        assertEquals(expected, solution.findClosestElements(test, 3, 5));
    }

}
