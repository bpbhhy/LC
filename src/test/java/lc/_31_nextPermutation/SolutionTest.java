package lc._31_nextPermutation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testNextPermutation1() {
        int[] test = new int[]{1, 2, 3};
        solution.nextPermutation(test);
        assertEquals(1, test[0]);
        assertEquals(3, test[1]);
        assertEquals(2, test[2]);
    }

    @Test
    public void testNextPermutation2() {
        int[] test = new int[]{3, 2, 1};
        solution.nextPermutation(test);
        assertEquals(1, test[0]);
        assertEquals(2, test[1]);
        assertEquals(3, test[2]);
    }

    @Test
    public void testNextPermutation3() {
        int[] test = new int[]{1, 1, 5};
        solution.nextPermutation(test);
        assertEquals(1, test[0]);
        assertEquals(5, test[1]);
        assertEquals(1, test[2]);
    }

    @Test
    public void testNextPermutation4() {
        int[] test = new int[]{1};
        solution.nextPermutation(test);
        assertEquals(1, test[0]);
    }

}
