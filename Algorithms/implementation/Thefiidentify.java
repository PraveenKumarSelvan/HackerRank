package implementation;s

import java.util.Arrays;
import java.util.HashMap;

public class Thefiidentify {

	public static void main(String[] args)
	{
		String p="Shilpa|500|california|63";
		String myStrings[];
		myStrings = new String[]{"Shilpa|500|california|63",
		"Tom|25|NewYork|615",
		"Krasi|9000|california|1230"};
		
		getSuspisciousList(p);
		
		
		
		}
	
	public static void getSuspisciousList(String s)
	{
		
		HashMap<String, String> map = new HashMap<String, String>();
			
		
			String[] transaction=s.split("\\|");
			map.put(transaction[1],transaction[0]);
			
			for(int i=0;i<transaction.length;i++) 
			System.out.println(transaction[i]);
			
		}
		
		
	}

