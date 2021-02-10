package lc._91_decodeWays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testNumDecodings1(){

        assertEquals(2, solution.numDecodings("12"));
    }

    @Test
    public void testNumDecodings2(){

        assertEquals(3, solution.numDecodings("226"));
    }

    @Test
    public void testNumDecodings3(){

        assertEquals(0, solution.numDecodings("0"));
    }

    @Test
    public void testNumDecodings4(){

        assertEquals(1, solution.numDecodings("1"));
    }
}
