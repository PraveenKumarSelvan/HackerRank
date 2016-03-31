package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class CutSticks {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	       boolean notnull=false;
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        int lowest=Integer.MAX_VALUE;
	        boolean continuetill=false;
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
                System.out.print(arr[arr_i]);
	            if(lowest>arr[arr_i])
	                lowest=arr[arr_i];
	        }
	        System.out.println();
         mainloop:
	        while(continuetill==false)
	         {
                for(int i=0;i<arr.length;i++)  
	            {
	                if(arr[i]!=0)
	                 {
	                if(lowest>arr[i])
	                lowest=arr[i];
	                 }
	            }
	            int count=0;
	            int numberofzeroes=0;
	            for(int i=0;i<n;i++)  
	            {
	                if(arr[i]!=0)
	                 {
	               arr[i]=arr[i]-lowest;
                    System.out.print(arr[i]+" ");
	               count++;
                 
	                }
	                else
	                {
	                	numberofzeroes++;
	                	if(numberofzeroes==n)
	                	{
	                		continuetill=true;
	                		break mainloop;
	                	}
	               }
                  
                }
               lowest=Integer.MAX_VALUE;
	            System.out.println(count);
	            
	         
	 }
}
}
	 