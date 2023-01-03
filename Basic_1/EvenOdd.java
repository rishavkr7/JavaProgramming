package Basic_1;
import java.util.*;
public class EvenOdd {
    public static void main (String[] args){
        System.out.print("Enyer Number: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("The Number is: " + n);

        if (n%2==0){
            System.out.println ("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
        scn.close();
    }
    
}
