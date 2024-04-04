package com.learning.core.daysession1;
import java.util.Scanner;

public class D01P41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number (1-40): ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number (1-40): ");
        int num2 = scanner.nextInt();
        
        // Check if the entered numbers are within range
        if (num1 < 1 || num1 > 40 || num2 < 1 || num2 > 40) {
            System.out.println("Please enter numbers within the range of 1 to 40.");
            return;
        }
        
        // Single dimension array of 5 integer elements ranging from 1 to 40
        int[] array = {7, 25, 5, 19, 30};
        
        // Check if both input numbers are found in the array
        boolean foundNum1 = false;
        boolean foundNum2 = false;
        for (int i = 0; i < array.length; i++) {
            if (num1 == array[i]) {
                foundNum1 = true;
            }
            if (num2 == array[i]) {
                foundNum2 = true;
            }
        }
        
        // Display "Bingo" if both input numbers are found in the array
        if (foundNum1 && foundNum2) {
            System.out.println("Bingo");
        } else {
            System.out.println("Not Found");
        }
    }
}
