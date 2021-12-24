package binarysearch;

import java.util.*;
import java.util.Arrays;

public class Binarysearch {
	Scanner sc = new Scanner(System.in);

	public void wordlist() {
		System.out.println("Enter number of words you wish to input: ");
		int n = sc.nextInt();
		String[] words = new String[n];

		System.out.println("Enter the words");
		for (int i = 0; i < words.length; i++) {
			System.out.print("WORD " + (i + 1) + ": ");
			words[i] = sc.next();
		}

		System.out.println("enter the word you want to search for");
		String word = sc.next();

		Arrays.sort(words);

		for (String s : words) {
			System.out.println("sorting words");
			System.out.println(s);
		}
		// System.out.print(Arrays.sort(words));
		int index = Arrays.binarySearch(words, word);
		System.out.println(word + "=" + index);
	}

	public static void main(String[] args) {
		
		Binarysearch bs =  new Binarysearch();
		bs.wordlist();

	}
}