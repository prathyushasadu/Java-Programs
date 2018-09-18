/**********************************************************************
 * Problem 5:
Border Printing

Write a program that will take a word of input from the user
and use the characters |, -, +, to print out the word with n borders 
around it, where n is the length of the string.  For example, given 
the word "to", the program must print out

+----+
|+--+|
||to||
|+--+|
+----+

and given the word "cat", the program must print

+-------+
|+-----+|
||+---+||
|||cat|||
||+---+||
|+-----+|
+-------+
***********************************************************************/

import java.io.*;
import java.util.*;

public class BorderPrint 
{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int p = 0;
		int n = s.length();
		int r = (2*n)+1;
	        int c = 3*n;
		char[][] A = new char[r][c];

		for(int i = 0 ; i < r ; i++)
		{
			for(int j = 0 ; j < c ; j++)
			{
				if( ((i < n && j < n)&&(i == j)) ||
					((i<n && j>n)&&(j==c-1-i)) || 
					((i>n && j>n)&& (j == i+n-1) )||
			      		((i>n &&j < n)&&(i == 2*n-j) ) )
				{
					A[i][j] = '+';			
				}
				else if( i == n && j >=n && j <2*n)
				{
					A[i][j] = s.charAt(p);
					p++;
				}
				else if((j < n && i > j && i < 2*n-j) ||
					       	(i > n && j > n && j > i+n-1 ) ||
					       	(i <= n && j > n && j > ((c-1)-i)))
				{
					A[i][j] = '|';
				}
				else
				{
					A[i][j] = '-';
				}
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
			
		}
	}
}
