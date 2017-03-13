/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StrRev
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		StringBuffer sb=new StringBuffer(s);
		String s1=sb.reverse().toString();
		System.out.println(s1);
	}
}
