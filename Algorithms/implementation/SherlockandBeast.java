package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockandBeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         boolean flag=false;
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int N = in.nextInt();
            int numberof5s=N/3;
            int numberof3s=N-numberof5s*3;
            while(numberof5s>0&&numberof3s>0&&numberof3s%5!=0)
            {numberof5s--;
            numberof3s=N-numberof5s*3;
            
            }
           if(numberof3s%5==0){
                flag = true;
            }
            if(flag==false){
                System.out.println("-1");
            }
            else{
                //int n3 = (int) n3_d;
                while(numberof5s>0){
                    System.out.print("555");
                    numberof5s--;
                }
                while(numberof3s>0){
                    System.out.print("3");
                    numberof3s--;
                }
                System.out.println();
        }
    }
}
}



