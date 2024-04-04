package com.learning.core.daysession1;

import java.util.Scanner;
import java.util.Arrays;

public class D01P42 {
	public static void arrayOperations() {
		Scanner scanner = new Scanner(System.in);
		
		int[]A = new int[18];
		
		System.out.println("Enter 18 integers:");
		for(int i = 0; i < A.length; i++) {
			A[i]= scanner.nextInt();
		}
		int sum = 0;
		for (int i = 0; i< 15; i++) {
			sum +=A[i];
			
		}
		A[15]= sum;
		
		double average = (double) sum / A.length;
		A[16]= (int) average;
		
		int min = A[0];
		for(int i= 1; i < A.length - 1;i++) {
			if(A[i] < min) {
				min = A[i];			
				}
		}
		
	A[17]=min;
	
	System.out.println("Array elements after computations:");
	for(int i= 0; i < A.length; i++) {
		System.out.print(A[i] + " ");
	}
	scanner.close();
	}
	

public static void main(String[] args) { 
	arrayOperations();
}
	
}
    