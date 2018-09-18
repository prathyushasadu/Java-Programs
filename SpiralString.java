/***********************************************************************
 * Spiral String

Write a program that will repeat a string in a square spiral pattern, 
starting at the center and going outwards in counter-clockwise rings,
with one space between each of the letters.

The program must take two parameters (1) the string itself, and 
(2) an odd integer giving the width of the spiral.  For example, if the 
inputs are the string "Abcdefghijk" and the number 5, the program 
should print out the 5x5 spiral

f e d c b 
g e d c A
h f A b k
i g h i j
j k A b c

*************************************************************************/
import java.io.*;
import java.util.*;

public class SpiralString {

	public static int r = 1;
	public static int u = 1;
	public static int l = 2;
	public static int d = 2;
	public static String s;
	public static int len = 0;
	public static int p  = 0;
	public static int N  = 0;
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();
		len = s.length();
		N = Integer.parseInt(br.readLine());
	       char[][] a = new char[N][N];
	       //String[][] a = new String[N][N];
		int i = N/2;
		int j = N/2 ;
		a[i][j] = s.charAt(p%len);
		right(i,j,a);

		for(int y = 0 ; y < N ; y++)
		{
			for(int x = 0 ; x < N ; x++)
			{
				System.out.print(a[y][x]+" ");
			}
			System.out.println();
		}
	}

	public static void right(int i, int j,char[][] a)
	{
		if(i != N-1 || j != N-1)
		{
			for(int k = 0 ; k < r && r <= N; k++)
			{
				p++;
				j++;
				if(i <= N-1 && j <= N-1)
				{
				a[i][j] = s.charAt(p%len);
				}
			}
			if(r < N)
			{
			r = r+2;
			}
			if(i <= N-1 && j <= N-1)
			{
			up(i,j,a);
			}
		}
		else
		{
			a[i][j] = s.charAt(p%len);
		}

	}
	public static void up(int i, int j,char[][] a)
	{
		if(i != N-1 || j != N-1)
		{
			for(int k = 0 ; k < u && u < N; k++)
			{
				p++;
				i = i-1;
				if(i <= N-1 && j <= N-1 && i >= 0 && j >= 0)
				{
				a[i][j] = s.charAt(p%len);
				}
			}
			u = u+2;
			if(i <= N-1 && j <= N-1)
			{
			left(i,j,a);
			}
		}
		else
		{
			a[i][j] = s.charAt(p%len);
		}

	}
	public static void left(int i, int j,char[][] a)
	{
		if(i != N-1 || j != N-1)
		{
			for(int k = 0 ; k < l && l < N; k++)
			{
				p++;
				j--;
				if(i <= N-1 && j <= N-1 && j >= 0 && i >= 0)
				{
				a[i][j] = s.charAt(p%len);
				}
			}
			l = l+2;
			if(i <  N-1 && j < N-1)
			{
			down(i,j,a);
			}
		}
		else
		{
			a[i][j] = s.charAt(p%len);
		}

	}
	public static void down(int i, int j,char[][] a)
	{

	
		if(i != N-1 || j != N-1)
		{
			for(int k = 0 ; k < d && d < N; k++)
			{
				p++;
				i++;
				if(i <= N-1 && j <= N-1 && i >= 0 && j >= 0)
				{
				a[i][j] = s.charAt(p%len);

				}
			}
			d = d+2;
			
			if(i <= N-1 && j <= N-1)
			{
			right(i,j,a);
			}
		}
		else
		{
			a[i][j] = s.charAt(p%len);
		}
	}
}
