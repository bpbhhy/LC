package lc._63_uniquePathsII;

import lc._63_uniquePathsII.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void uniquePathsWithObstacles1(){
        int[][] test = {{0,0,0},{0,1,0},{0,0,0}};
        assertEquals(2, solution.uniquePathsWithObstacles(test));
    }

    @Test
    public void uniquePathsWithObstacles2(){
        int[][] test = {{0,1},{0,0}};
        assertEquals(1, solution.uniquePathsWithObstacles(test));
    }

    @Test
    public void uniquePathsWithObstacles21(){
        int[][] test = {{0,0,0},{0,1,0},{0,0,0}};
        assertEquals(2, solution.uniquePathsWithObstacles2(test));
    }

    @Test
    public void uniquePathsWithObstacles22(){
        int[][] test = {{0,1},{0,0}};
        assertEquals(1, solution.uniquePathsWithObstacles2(test));
    }
}


