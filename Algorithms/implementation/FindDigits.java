package implementation;

	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;


	public class FindDigits {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            String value=Integer.toString(n);
	            System.out.println(value);
	            int count=0;
	            for(int i=0;i<value.length();i++)
	            {
	            	int divider=Character.getNumericValue(value.charAt(i));
	        	if(divider!=0&&n%divider==0)
	            		count++;
	            }
	            System.out.println(count);
	            
	            
	    }
	}
	}


