package lc._0003_longestSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void testLengthOfLongestSubstring(){

        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

}
