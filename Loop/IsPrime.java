package Loop;
import java.util.*;
public class IsPrime {
  public static void main (String[] args)
  {
       Scanner scn = new Scanner(System.in);
       System.out.print("Enter terms: ");
       int terms=scn.nextInt();

       for (int k=1;k<=terms;k++)
       {
         
       System.out.print("Enter the Number: ");
       int n = scn.nextInt();
       int flag=1;
       for(int i=2 ; i<=n-1 ; i++)
       {
        if (n%i==0)
        {
            flag=0;
            break;
        }
       }

       if(flag==1)
       {
        System.out.println("Given Number is Prime Number");
       }
       else
       {
        System.out.println("Given Number is NOT a Prime Number");
       }
       scn.close();
       
    }
  }  
}
