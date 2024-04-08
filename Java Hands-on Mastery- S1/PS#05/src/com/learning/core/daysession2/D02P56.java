package com.learning.core.daysession2;

import java.util.Scanner;

public class D02P56 {
    public static void main(String[] args) {
        String s;
		//String s = "abab";
        //int length = longestPrefixSuffixLength(s);
    	Scanner scanner = new Scanner(System.in);

    	// Input string from the user
    	System.out.print("Enter a string: ");
    	String s1 = scanner.nextLine();

        System.out.println("Length of longest prefix which is also a suffix: " + s1);
    }

    public static int longestPrefixSuffixLength(String s) {
        int[] lps = computeLPSArray(s);
        int n = s.length();
        // Length of the longest prefix which is also a suffix
        return lps[n - 1];
    }

    // Function to compute the Longest Prefix Suffix (LPS) array
    private static int[] computeLPSArray(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
