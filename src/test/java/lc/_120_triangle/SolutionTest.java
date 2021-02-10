package lc._120_triangle;



import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {
   Solution solution = new Solution();

    @Test
    public void testMinimumTotal(){
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(2));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(3,4));
        ArrayList<Integer> l3 = new ArrayList<>(Arrays.asList(6,5,7));
        ArrayList<Integer> l4 = new ArrayList<>(Arrays.asList(4,1,8,3));
        ArrayList<ArrayList<Integer>> test = new ArrayList<>(Arrays.asList(l1,l2,l3,l4));

        assertEquals(11, solution.minimumTotal(test));
    }


}

