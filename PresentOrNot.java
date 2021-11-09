// Write a program to initialize an integer array with values and check if a given number is present in the array or not.

// If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

// Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

// Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.

import java.util.Scanner;
class Array
{ 
	Scanner sc = new Scanner(System.in);
	int n,t,arr[];
	public void input()
	{
		n = sc.nextInt();
		arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	public void search()
	{
		t=0;
		System.out.println("Enter a no. to search");
		int num = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(num==arr[i])
				t=i;
		}
	}
	public void show()
	{
		if(t==0)
			System.out.println("-1");
		else
			System.out.println("Found at index " + t);
	}
}
class PresentOrNot
{
	public static void main(String args[])
	{
		Array obj = new Array();
		obj.input();
		obj.search();
		obj.show();
	}
}