package genericsortandsearch;

public class Binarysearchgeneric {

	public <T extends Comparable<? super T>> int search(T[] list, int first, int last, T key) 
	{
		int position;
		int mid = first + (last - first) / 2;
		if (first > last)
			position = -1;
		else if (key.equals(list[mid]))
			position = mid;
		else if (key.compareTo(list[mid]) < 0)
			position = search(list, first, mid - 1, key);
		else
			position = search(list, mid + 1, last, key);
		return position;
	}

	public static void main(String args[]) {
		Binarysearchgeneric n = new Binarysearchgeneric();
		String[] names = { "allen", "rahul", "thaman", "smith", "kohli" };
		for (String a1 : names) 
		{
			System.out.print(a1 + " \n");
		}
	}
}
