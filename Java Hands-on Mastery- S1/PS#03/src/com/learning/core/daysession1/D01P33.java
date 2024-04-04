package com.learning.core.daysession1;

import java.util.Scanner;

public class D01P33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the marks obtained
        System.out.print("Enter the percentage of marks obtained: ");
        double percentage = scanner.nextDouble();

        // Check the percentage range and assign the grade accordingly
        String grade = calculateGrade(percentage);

        // Display the grade
        System.out.println(grade + " Grade");

        scanner.close();
    }

    // Method to calculate the grade based on the percentage of marks
    public static String calculateGrade(double percentage) {
        if (percentage >= 60) {
            return "A";
        } else if (percentage >= 45) {
            return "B";
        } else if (percentage >= 35) {
            return "C";
        } else {
            return "Fail";
        }
    }
}
