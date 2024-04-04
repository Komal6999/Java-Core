package com.learning.core.daysession1;

import java.util.Scanner;

public class D01P31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter a number between 1 to 12
        System.out.print("Enter a number between 1 to 12: ");
        int monthNumber = scanner.nextInt();

        
        if (monthNumber >= 1 && monthNumber <= 12) {
            String monthName = getMonthName(monthNumber);
            System.out.println(monthName);
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }

    // Method to get the month name based on the month number
    public static String getMonthName(int monthNumber) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July",
                               "August", "September", "October", "November", "December"};
        return monthNames[monthNumber - 1];
    }
}
