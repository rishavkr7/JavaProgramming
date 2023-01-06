package Loop;
import java.util.*;
public class Sum {
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scn.nextInt();
        int summession=0;
        for(int i=1;i<=n;i++)
        {
           summession=summession+i;
        }
        System.out.print(summession);
        scn.close();
    }
}


// ALTERNATIVE AND FASTEST LOGIC WITHOUT USING LOOP

/** package Loop;
import java.util.*;
public class Sum{
    public static void main (String[] args)
    {
       Scanner scn = new Scanner (System.in);
       int n = scn.nextInt();

       int summession=0;

       summession= (n*(n+1))/2;
       System.out.print(summession);
       scn.close();
    }
}
2
**/


  



