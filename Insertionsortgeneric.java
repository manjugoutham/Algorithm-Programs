package genericsortandsearch;

public class Insertionsortgeneric<T extends Comparable<T>> {
	T[] arr;

	void sort_insertion(T arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			T key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	void displayArray(T[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " \n");

		System.out.println();
	}

	// Driver method
	public static void main(String args[]) {
		String[] array = { "amar", "ban", "afser", "dul", "shaz" };

		Insertionsortgeneric insertion = new Insertionsortgeneric();
		insertion.sort_insertion(array);

		insertion.displayArray(array);
	}
}
