package com.learning.core.daysession2;

import java.util.Scanner;

public class D02P51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();


        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(inputString);
        if (isPalindrome) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
