package binarysearch;

import java.util.Scanner;

public class Magicnumber {

	Scanner scan = new Scanner(System.in);

	void Searchnumber() {

		System.out.println("Think number in your mind between 1 and 100 ");

		int left = 1, right = 100;

		while ((right - left) > 0) 
		{
			int mid = ((left + right) / 2);

			System.out.println("your number is " + mid + "?\n");
			System.out.println("YES or NO)");
			String num = scan.next().toLowerCase();

			if (num.equals("yes")) {
				System.out.println("Your number is in your mind : " + mid);
				break;
			} else {
				System.out.println("Your number between " + left + " and " + right + " \n(YES or NO)");
				String str = scan.next().toLowerCase();
				if (str.equals("yes")) {
					right = mid;
				} else {
					left = mid;
				}
			}
		}

		System.out.println("You want to continue YES = 1 OR NO=2: ");
		int n = scan.nextInt();
		if (n == 1) {

			Searchnumber();
		} else {
			System.out.println("Stop the execution.....");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magicnumber mg = new Magicnumber();
		mg.Searchnumber();
	}

}