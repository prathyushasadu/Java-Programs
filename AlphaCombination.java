/****************************************************************************
 * Problem 4:
Alphabetic Combinations

Write a program that will take a string as input and print
out all of the unique combinations of the letters of the string
in alphabetical order, one per line.  For example, given the string "cbaa"
the program should print out

a
aa
aab
aabc
aac
ab
abc
ac
b
bc
c
******************************************************************************/
import java.util.*;
import java.io.*;

public class AlphaCombination
{
	public static void main(String[] args) throws IOException{
		AlphaCombination ac = new AlphaCombination();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] carray = str.toCharArray();
		Arrays.sort(carray);
		ac.stringCombination(carray);
	}

	public void stringCombination(char[] carray)
	{
		int pos = 0;
		ArrayList<Character> a = new ArrayList<Character>();
		stringCombination(carray,pos,a);
	}

	public void stringCombination(char[] input,int pos, ArrayList<Character> a)
	{
		int len = a.size();
		if(len != 0)
		{
			for(int i = 0 ; i < len ; i++)
			System.out.print(a.get(i));
		System.out.println();
		}

		for(int i = pos ; i < input.length;i++)
		{
			if(i != pos && input[i] == input[i-1])
			{
				continue;
			}
			a.add(input[i]);
			stringCombination(input,i+1,a);
			a.remove(a.size()-1);
		}

	}
}
