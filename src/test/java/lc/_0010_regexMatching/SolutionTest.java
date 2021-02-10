package lc._0010_regexMatching;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testIsMatch1(){
        assertEquals(false, solution.isMatch("aa", "a"));
    }

    @Test
    public void testIsMatch2(){
        assertEquals(true, solution.isMatch("aa", "a*"));
    }

    @Test
    public void testIsMatch3(){
        assertEquals(true, solution.isMatch("ab", ".*"));
    }

    @Test
    public void testIsMatch4(){
        assertEquals(true, solution.isMatch("aab", "c*a*b"));
    }

    @Test
    public void testIsMatch5(){
        assertEquals(false, solution.isMatch("mississippi", "mis*is*p*."));
    }
}
