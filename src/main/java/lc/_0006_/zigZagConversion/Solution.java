package lc._0006_.zigZagConversion;

public class Solution {
    // from zigzag pattern to normal
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        StringBuffer[] sb = new StringBuffer[numRows];
        int len = s.length();
        // need to initalize at each row, otherwise sb[idx] in while loop will not exist
        for (int idx = 0; idx < numRows; idx++) {
            sb[idx] = new StringBuffer();
        }

        int i = 0;
        while ( i < len) {
            for (int idx = 0; idx < numRows && i < len; idx++) {
                sb[idx].append(c[i++]);
            }

            for (int idx = numRows - 2; idx >= 1 && i < len; idx--) {
                sb[idx].append(c[i++]);
            }
        }

        for ( int idx = 1; idx < numRows; idx++) {
            sb[0].append(sb[idx]);
        }
        return sb[0].toString();
    }
}
