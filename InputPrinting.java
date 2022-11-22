import java.util.Scanner;
public class InputPrinting {
    public static void main(String arg[]){
       Scanner scn = new Scanner(System.in );
       System.out.print("Enter a Number: ");
       int a = scn.nextInt();
       System.out.print("Number is: " + a);
       scn.close();

    }
}


