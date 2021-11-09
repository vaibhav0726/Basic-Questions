// Write a program to print the sum of the elements of an array following the given below condition.

// If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

// Eg1) Array Elements - 10,3,6,1,2,7,9
// O/P: 22   
// [i.e 10+3+9]

// Eg2) Array Elements - 7,1,2,3,6
// O/P:19

// Eg3) Array Elements - 1,6,4,7,9
// O/P:10

import java.util.Scanner;
class SumOfArray
{
	public static void main(String args[])
	{
		int i,a=0,b=0,sum=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]==6)
				a=i;
			if(arr[i]==7)
				b=i;
		}
		if(a<b)
		{
			for(i=0;i<n;i++)
			{
				if(i>=a && i<=b)
					continue;
				else
					sum+=arr[i];
			}
		}
		else
		{
			for(i=0;i<n;i++)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}
}