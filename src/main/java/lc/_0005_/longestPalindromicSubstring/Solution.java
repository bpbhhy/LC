package lc._0005_.longestPalindromicSubstring;

public class Solution {

    // Brute force: 1. find all substrings of this string in N^2 time (two for loops)
    //              2. check if the string is palindrom takes linear time
    //              3. total time complexity is O(n^3)


    // Expand From Middle: 1. for loop on String, and find max expanded palindrom string on each char.
    // Time complexity: O(n ^ 2)
    // Space complexity: O(1)
//     public String longestPalindrome(String s) {
//         if (s == null || s.length() < 1) return "";
//         int start = 0;
//         int end = 0;

//         for (int i = 0; i < s.length(); i++) {

//             // "racecar"
//             int len1 = expandFromMiddle(s, i, i);

//             // "abba"
//             int len2 = expandFromMiddle(s, i, i + 1);
//             int len = Math.max(len1, len2);

//             System.out.println(len1);
//             System.out.println(len2);

//             if (len > end - start) {
//                 // use both case to check: "racecar", "abba"
//                 start = i - ((len - 1) / 2);
//                 end = i + (len / 2);
//             }
//         }

//         return s.substring(start, end + 1);

//     }

//     public int expandFromMiddle(String s, int left, int right) {
//         if (s == null || left > right) return 0;

//         while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
//             left--;
//             right++;
//         }

//         return right - left - 1;
//     }


    // DP: time complexity: O(n ^ 2)
    //     space complexity: O(n)
    // for loop explain:
    // in order to get dp[i][j] we need to know dp[i + 1][j - 1]
    // also if we start from 0, each loop will start with [0][0], that will casue TLE
    public String longestPalindrome(String s) {
        String res = null;
        int len = s.length();
        boolean[][] dp = new boolean[len][len];

        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);

                if (dp[i][j] && (res == null || res.length() < j - i + 1 )) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}
