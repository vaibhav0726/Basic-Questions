// Initialize an integer array with ascii values and print the corresponding character values in a single row.

import java.util.Scanner;
class printingChars
{
	static Scanner sc = new Scanner(System.in);
	static int n,t,arr[];
	public static void input()
	{
		n = sc.nextInt();
		arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	public static void show()
	{
		for(int i=0;i<n;i++)
		{
			System.out.printf("%c ", arr[i]);
		}
	}
	public static void main(String args[])
	{
		input();
		show();
	}
}