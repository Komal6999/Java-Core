package com.learning.core.daysession1;

import java.util.HashMap;
import java.util.Scanner;

public class D01P43 {
   public static void firstRepeatingElementsIndex() {
	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.print("Enter the size of array: ");
	   
	  int n = scanner.nextInt();
	  int[] arr = new int[n];
	  
	  System.out.println("Enter elements of the array:");
	  for(int i = 0; i< n; i++) {
		  arr[i] = scanner.nextInt();
	  }
	  int minIndex = -1;
	  int minelement = -1;
	  for(int i = 0; i< n; i++) {
		  for (int j = i + 1; j<n; j++) {
			  if(arr[i] == arr[j]) {
				  minIndex = i;
				  minelement = arr[i];
				  break;
			  }
		  }
		  if(minIndex != -1) {
			  break;
		  }
	  }
	  System.out.println("Minimum Element: " + minelement+ " "+ " Minimum Index:" + minIndex);
	  scanner.close();
   }
   
   public static void main(String[] args) {
	   firstRepeatingElementsIndex();
   }
}