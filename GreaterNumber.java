import java.util.*;
public class GreaterNumber {
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter First Number: ");
        int a = scn.nextInt();
        System.out.print("Enter Second Number: ");
        int b = scn.nextInt();
        System.out.print("Enter Third Number: ");
        int c = scn.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a + " is grester");
            }
            else
            {
                System.out.println(c + " is greater");
            }
        }
        else
        {
             if(b>c)
             {
                System.out.println(b + " is greater");
             }
             else
             {
                System.out.println( c + " is greater");
             }
        }
        scn.close();
}
}
