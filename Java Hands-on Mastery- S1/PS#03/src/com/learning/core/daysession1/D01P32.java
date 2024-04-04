package com.learning.core.daysession1;

import java.util.Scanner;

public class D01P32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the week number
        System.out.print("Enter the week number between 1 - 7: ");
        int weekNumber = scanner.nextInt();

        // if-else condition
        if (weekNumber >= 1 && weekNumber <= 7) {
            String weekday = getWeekday(weekNumber);
            System.out.println(weekday);
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }

    // Method to get the weekday based on the week number
    public static String getWeekday(int weekNumber) {
        String weekday;
        if (weekNumber == 1) {
            weekday = "Monday";
        } else if (weekNumber == 2) {
            weekday = "Tuesday";
        } else if (weekNumber == 3) {
            weekday = "Wednesday";
        } else if (weekNumber == 4) {
            weekday = "Thursday";
        } else if (weekNumber == 5) {
            weekday = "Friday";
        } else if (weekNumber == 6) {
            weekday = "Saturday";
        } else {
            weekday = "Sunday";
        }
        return weekday;
    }
}

