/****************************************************************************
 * Anagram Test
 * Two words are anagrams of each-other if they share the same number
 * of all the same letters.  For example, bat and tab are anagrams of each-other.
 * Write a program that will process multiple pairs of words and determine
 * if they are anagrams of each-other.  The program must be able to handle mixed case,
 * so for example Bat and Tab are considered anagrams.  the input for the program
 * will come from stdin, and will consist of lines containing two words, or a
 * $ to signal the end of input.  For example, with the input

tab bata
Bat Fat
fun FNU
$

your program should print out the following:

no
no
yes
********************************************************************************/
import java.util.*;
import java.io.*;

public class AnagramTest
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
	        while((str = br.readLine()) != null)
		{
			int[] freq1 = new int[26];
			int[] freq2 = new int[26];
			int count = 0;
			if(str.equals("$"))
			{
				break;
			}
			else
			{
				StringTokenizer st = new StringTokenizer(str);
				String str1 = st.nextToken();
				String str2 = st.nextToken();
				str1 = str1.toLowerCase();
				str2 = str2.toLowerCase();
		                if(str1.length() != str2.length())
				{
					System.out.println("no");
				}	
				else
				{
					int len1 = str1.length();
					for(int i = 0; i < len1 ; i++)
					{
						freq1[str1.charAt(i) -'a']++;
						freq2[str2.charAt(i) -'a']++;
					}	

					for(int i = 0 ; i < len1 ; i++)
					{
						if(freq1[str1.charAt(i) -'a'] != 0 && freq2[str1.charAt(i) -'a'] != 0 && freq1[str1.charAt(i) -'a'] ==  freq2[str1.charAt(i) -'a'])
						{
							count = count+1;
						}	
						else
						{
							System.out.println("no");
							break;
						}
					}
					if(count == len1)
					{
							System.out.println("yes");

					}
				}
			}
		}
	}
}
