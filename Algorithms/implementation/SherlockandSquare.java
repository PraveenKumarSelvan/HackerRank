package implementation;

import java.util.Scanner;

public class SherlockandSquare {
	public static void main(String[] args) {
	       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in=new Scanner(System.in);
	        int T=in.nextInt();
	       String input[]=new String[T];
	     for(int b=0;b<T;b++)
	        {
	         input[b]=in.nextLine();
	     }
	     
	        for(int z=0;z<T;z++)
	        {
	            String individ[]=new String[2];
	            individ=input.toString().split(" ");
	        int i=Integer.parseInt(individ[0]);
	        System.out.println("value of i:"+i);
	        int j=Integer.parseInt(individ[1]);
	        System.out.println("value of i:"+j);
	        int count=0;
			for(i=i;i<=j;i++)
			{
				float value=(float) Math.sqrt((float)(i));
			if(value==(int)value)
				count++;
			}
	            System.out.println(count);
	        }
	    }
	}