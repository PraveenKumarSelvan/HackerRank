package implementation;

import java.util.ArrayList;

public class Sample {

	private static int[] matchtoalphabet(String s)
	{
		int[] matches=new int[26];
		for(char i='A';i<'Z';i++)
		{
			
		matches[i]=s.charAt(i);
		System.out.println(matches[i]);
		}
System.out.println("-----------------------------");

return matches;
	}
	
	public static int compare(int a[],int b[])
	{
		int values[]=new int[26];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j]&& a[i]!=0 &&b[j]!=0)
					System.out.println(String.valueOf(Character.toChars(a[i])));
				
			}
		}
		return 0;
	
	}
	public static void main (String[] args)
	{
		String one="Hey this is Praveen";
		String two="How are you its kishore";
		
		Sample ones=new Sample();
		
		Sample twos=new Sample();
		
		compare(ones.matchtoalphabet(one),twos.matchtoalphabet(two));
		

		
		
	}
}
