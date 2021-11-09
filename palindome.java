// write a Java program to find if the given number is palindrome or not

// Example1)
// C:\>java Sample 110011
// O/P: 110011 is a palindrome

// Example2)
// C:\>java Sample 1234
// O/P: 1234 is not a palindrome

import java.util.Scanner;
class palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=n, rem, sum=0;
		while(i!=0)
		{
			rem = i%10;
			sum = sum*10 + rem;
			i/=10;
		}
		if (sum==n)
			System.out.println(n + " is a palindrome");
		else
			System.out.println(n + " is not a palindrome");
	}
}