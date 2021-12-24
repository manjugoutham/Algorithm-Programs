package genericsortandsearch;

import java.util.*;

public class Mergesort<T> {
	T[] str1;
	T[] str2;

	public <T extends Comparable<T>> String[] mergestring(T[] str1, T[] str2) 
	{
		List<T> merged = new ArrayList<>();
		Collections.addAll(merged, str1);
		Collections.addAll(merged, str2);
		Collections.sort(merged);
		return merged.toArray(new String[merged.size()]);
	}

	public static int[] mergeint(int[] arr1, int[] arr2) 
	{
		List<Integer> merged = new ArrayList<>();

		for (int i = 0; i < arr1.length; i++) {
			merged.add(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			merged.add(arr2[i]);
		}

		Collections.sort(merged);

		int[] result = new int[merged.size()];

		for (int i = 0; i < merged.size(); i++) {
			result[i] = merged.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		Mergesort<?> mergesort = new Mergesort();

		int[] arr1 = { 2, 4, 6, 8 };
		int[] arr2 = { 3, 5, 7, 9};
		int[] resmerge = mergeint(arr1, arr2);

		for (int i = 0; i < resmerge.length; i++) {
		System.out.print("\n" + resmerge[i] + " ");
		}

		String[] str1 = { "hello", "welcome", };
		String[] str2 = { "to", "java", "world" };
		String[] merged = mergesort.mergestring(str1, str2);
		for (int i = 0; i < merged.length; i++) 
		{
			
			System.out.print(merged[i] + " \n");
		}

	}
}
