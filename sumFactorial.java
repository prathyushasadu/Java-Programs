//****************************************************************************
// Problem 1:
// Sum of Factorials
// Given a number n as input, write a program that will compute and print
// the sum of all the factorials up to n, starting with 1!. 
// For example, given
// the input 3, your program should print out 9, since:
// 1! + 2! + 3! = 9
//*****************************************************************************
import java.util.*;
import java.io.*;

public class sumFactorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while(n != 0)
		{
			sum = sum+facto(n);
			n--;
		}
		System.out.println(sum);
	}

	static int facto(int n)
	{
		int result = 1;
		for(int i = 2 ; i <= n ; i++)
		{
			result = result*i;
		}	

		return result;
	}
}

