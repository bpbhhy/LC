package lc._0033_searchInRotateSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testSearch() {
        int[] test = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        solution.search(test, target);
        assertEquals(4, solution.search(test, target));

    }

    @Test
    public void testSearch2() {
        int[] test = new int[]{4,5,6,7,0,1,2};
        int target = 3;
        solution.search(test, target);
        assertEquals(-1, solution.search(test, target));

    }
}
