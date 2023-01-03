package Loop;
import java.util.*;
public class Table {
    public static void main (String[] args)
    {
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter the value of X: ");
        int X = scn.nextInt();

        for(int i=01 ; i<11 ; i++)
        {   
            int ans = X*i;
            System.out.println(X + " x " + i + "  =  " + ans );
        }
        scn.close();
    }
}
