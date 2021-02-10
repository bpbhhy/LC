package lc._0096_uniqueBST;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testNumTrees(){
        assertEquals(5, solution.numTrees(3));
    }
}
