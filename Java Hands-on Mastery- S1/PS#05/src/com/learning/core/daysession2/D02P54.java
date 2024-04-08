package com.learning.core.daysession2;

public class D02P54 {
    public static void main(String[] args) {
        String str = "aebcbda";
        int deletions = findMinDeletionsForPalindrome(str);
        System.out.println(deletions);
    }

    public static int findMinDeletionsForPalindrome(String str) {
        // Find the length of the longest palindrome subsequence
        int length = longestPalindromicSubsequenceLength(str);

        // Minimum deletions = Length of string - Length of longest palindrome subsequence
        return str.length() - length;
    }

    public static int longestPalindromicSubsequenceLength(String str) {
        // Create a table to store results of subproblems
        int n = str.length();
        int[][] dp = new int[n][n];

        // Strings of length 1 are palindrome of length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Build the table using a bottom-up approach
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (str.charAt(i) == str.charAt(j) && len == 2) {
                    dp[i][j] = 2;
                } else if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }

        // Return length of longest palindrome subsequence
        return dp[0][n - 1];
    }
}
