package binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prime {
	 int i , j , flag;
    static ArrayList<Integer> list = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);

    public void primenumber() {
    	System.out.println("Enter the hihest limit number: ");
    	int n = sc.nextInt();

        for(i=0;i<=n;i++) 
        {
            if(i==0 || i==1)
                continue;
            flag = 1;

            for(j=2;j<=i/2;++j) 
            {
                if(i%j == 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
            	list.add(i);
        }
    }

    public void Palindrome() {
    	primenumber();
        for ( i = 0; i < list.size(); i++) 
        {
            int num = list.get(i);
            int rem = 0;
            int reverse = 0;
            int temp = num;

            while(num > 0) {
                rem = num % 10;
                num = num / 10;
                reverse = reverse * 10 + rem;
            }
            if(temp == reverse) {
                System.out.print(reverse + " ");
            }else {
                continue;
            }
        }
    }

    public void Anagram() 
    {
    	primenumber();
    	
        for(int i=0;i<list.size();i++) 
        {
            int num1 = list.get(i);
            String str1 = Integer.toString(num1);

            for(int j=i+1;j<list.size();j++) 
            {
                int num2 = list.get(j);
                String str2 = Integer.toString(num2);

                if(str1.length() == str2.length()) 
                {
                    char[] array1 = str1.toCharArray();
                    char[] array2 = str2.toCharArray();

                    Arrays.sort(array1);
                    Arrays.sort(array2);

                    boolean result = Arrays.equals(array1,array2);

                    if(result) {
                        System.out.println(str1 + " "+str2);
                    }else {
                        continue;
                    }
                }
            }
        }
    }

    
    public void displaytArrayList() {
    	primenumber();
        for (Integer integer : list) 
        {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) {
    	Prime pa = new Prime();
    	pa.primenumber();
        System.out.println();
        System.out.println("\nPrime palindrome numbers are: ");
        pa.Palindrome();
        System.out.println();
        System.out.println("\nanagram numbers are: ");
        pa.Anagram();
        pa.displaytArrayList();
    }
}
