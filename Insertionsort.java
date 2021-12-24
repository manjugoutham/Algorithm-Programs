package binarysearch;

import java.util.Scanner;

public class Insertionsort {

	public static String[] sort_order(String array[], int f) {
		String temp = "";
		for (int i = 0; i < f; i++) {
			for (int j = i + 1; j < f; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}


	public static void main(String[] args) {
		
		String[] arr = { "Atlanta", "New York", "Dallas", "Omaha", "San Francisco" };
		int count = 0;
		String sortedArray[] = sort_order(arr, arr.length);
		for (int i = 0; i < sortedArray.length; i++) 
		{
			System.out.println(sortedArray[i]);
		}
	}
}