package implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChocalateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int count=0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            
         int InitialChocolates,TotalChocalates,EatenChocalates,Wrappers,GetAdditional;
            
            InitialChocolates=n/c;
            Wrappers=InitialChocolates;
            TotalChocalates=InitialChocolates;
            while(Wrappers>=m)
            {
            GetAdditional=(int)Math.ceil(Wrappers/m);
            TotalChocalates+=GetAdditional;
            Wrappers=Wrappers-(GetAdditional*m);
            Wrappers=Wrappers+GetAdditional;
            
            }
      
            System.out.println(TotalChocalates);
        //
        
    }
}
}