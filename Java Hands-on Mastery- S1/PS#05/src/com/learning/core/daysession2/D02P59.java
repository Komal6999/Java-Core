package com.learning.core.daysession2;

import java.util.Scanner;

public class D02P59 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();
		scanner.close();
		String output = input.replace(" ", "%20");
		System.out.println(output);
	}

}
