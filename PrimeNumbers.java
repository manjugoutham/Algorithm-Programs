package binarysearch;

import java.util.Scanner;

class PrimeNumbers {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		int i = 0;
		int num = 0;
		// Empty String
		String primeNumbers = "";
       System.out.println("Enter the value of number:");
       int numer = scanner.nextInt();
       scanner.close();
		for (i = 0; i <= 1000; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 0 to 1000 are :\n");
		System.out.println(primeNumbers);
	}
}
