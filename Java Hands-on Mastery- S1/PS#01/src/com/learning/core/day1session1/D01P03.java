package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P03 {
	
	public static void getMonthName() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number between 1 to 12: ");
		
		int month = scanner.nextInt();
		scanner.close();
		
		String[] months = { "January", "February", "March", "April", "May", "June", "August", "September", "October", "November", "December"};
		
		if(month >= 1 && month <= 12) {
			System.out.println(months[month - 1]);
		}else {
			System.out.println("Invalid Input");
		
		}
	}
	
	public static void weekDay() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number between 1 to 7:");
		
		int weekdaynum = scanner.nextInt();
		scanner.close();
		
		String weekday = null;
			if(weekdaynum == 1) {
				weekday = "Sunday";
			}else if (weekdaynum == 2) {
				weekday = "Monday";
			}else if (weekdaynum == 3) {
				weekday = "Tuesday";
			}else if (weekdaynum == 4) {
				weekday = "Wednesday";
			}else if (weekdaynum == 5) {
				weekday = "Thursday";
			}else if (weekdaynum == 6) {
				weekday = "Friday";
			}else if (weekdaynum == 7) {
				weekday = "Invalid Input";
			}
			
			System.out.println(weekday);
	}
	
	public static void checkGrade() {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter marks obtained:");
	
	double marks = scanner.nextDouble();
	
	scanner.close();
	
	//Check grade based on marks
	if (marks >= 60) {
		System.out.println("Grade A");
	}else if (marks >= 45) {
		System.out.println("Grade B");
	} else if (marks >= 35) {
		System.out.println("Grade C");
	}else {
		System.out.println("Fail");
	}
	}
	public static void rightAnglePattern() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		
		int numberRows = scanner.nextInt();
		
		scanner.close();
		
		for (int i=1; i<= numberRows; i++) {
			for (int j = 1; j<=i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	public static void findFactorial() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		
		int num = scanner.nextInt();
		
		scanner.close();
		
		int factorial = 1;
		for(int i = 1; i <= num; i++) {
			factorial *=i;
		}
		
		System.out.println("Factorial of " + num + "is " + factorial);
	}
	
	public static void main(String[] args) {
		
		findFactorial();
		getMonthName();
	}
}


