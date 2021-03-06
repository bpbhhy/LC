package lc._0121_bestTimeToBuyAndSellStock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testmaxProfit1(){
        assertEquals(5, solution.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void testmaxProfit2(){
        assertEquals(0, solution.maxProfit(new int[]{7,6,4,3,1}));
    }
}

