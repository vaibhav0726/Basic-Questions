// Given an array of type int, print true if every element is 1 or 4. 

// only14([1, 4, 1, 4]) → true
// only14([1, 4, 2, 4]) → false
// only14([1, 1]) → true

import java.util.Scanner;
class TrueOrFalse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean b = false;
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]==1 || arr[i]==4)
			{
				b = true;
			}
			else
			{
				b = false;
				break;
			}
		}
		System.out.println(b);
	}
}