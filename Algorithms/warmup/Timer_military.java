package warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Timer_military {
	

	

	    public static void main(String[] args) {
	    	int hrs,mins,sec;
	    	//System.out.println("enter time please");
	        Scanner in = new Scanner(System.in);
	        String time = in.next();
	        String[]timer=time.split(":");
	       hrs=Integer.parseInt(timer[0]);
	       mins=Integer.parseInt(timer[1]);
	       sec=Integer.parseInt(timer[2].substring(0,2));
	       if(hrs<=12&&mins<=60&&sec<=60)
          {
	       DecimalFormat formatter = new DecimalFormat("00");
	       
	       //System.out.println(hrs);
	       String s=timer[2].substring(2,4);
	      // System.out.println(s);
	            if(s.contains("P"))
	            {
	            	if(hrs==12&&mins==0&&sec==0)
	            		System.out.println("12:00:00");
	            	else
	            		{
	            		hrs+=12;
	            		String hours = formatter.format(hrs);
	         	       String minutes = formatter.format(mins);
	         	       String seconds = formatter.format(sec);
	         	      System.out.println(hours+":"+minutes+":"+seconds);
	            }
	            }
	            else
	            {
	            	if(hrs==12&&mins==0&&sec==0)
	            		System.out.println("00:00:00");
	            	else
	            	{
	            		String hours = formatter.format(hrs);
	         	       String minutes = formatter.format(mins);
	         	       String seconds = formatter.format(sec);
	            		System.out.println(hours+":"+minutes+":"+seconds);
	            }
	            }
           }  
	    }
	}



