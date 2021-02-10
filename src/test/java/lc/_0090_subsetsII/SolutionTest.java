package lc._0090_subsetsII;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testSubsetsWithDup(){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(Arrays.asList(1)));
        res.add(new ArrayList<>(Arrays.asList(2)));
        res.add(new ArrayList<>(Arrays.asList(1,2,2)));
        res.add(new ArrayList<>(Arrays.asList(2,2)));
        res.add(new ArrayList<>(Arrays.asList(1,2)));
        res.add(new ArrayList<>());
        assertEquals(new HashSet<>(res), new HashSet<>(solution.subsetsWithDup(new int[]{1, 2, 2})));
    }

}
