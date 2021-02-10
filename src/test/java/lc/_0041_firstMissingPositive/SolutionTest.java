package lc._0041_firstMissingPositive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testFirstMissingPositive(){

        assertEquals(3, solution.firstMissingPositive(new int[]{1,2,0}));
        assertEquals(2, solution.firstMissingPositive(new int[]{3,4,-1,1}));
        assertEquals(1, solution.firstMissingPositive(new int[]{7,8,9,11,12}));

    }

}
