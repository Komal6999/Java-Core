package com.learning.core.daysession1;

import java.util.Scanner;

public class D01P34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the number of rows for the triangle
        System.out.print("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt();

        // Display the triangle pattern
        displayTriangle(rows);

        scanner.close();
    }

    // Method to display the right-angled triangle pattern
    public static void displayTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}

