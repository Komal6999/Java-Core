package com.learning.core.daysession1;

import java.util.Scanner;

public class D01P35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter a number
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        // Calculate and display the factorial value
        long factorial = calculateFactorial(number);
        System.out.println(factorial);

        scanner.close();
    }

    // Method to calculate the factorial of a number
    public static long calculateFactorial(int number) {
        if (number < 0) {
            return -1; 
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

