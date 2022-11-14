package Basic;
import java.util.Scanner;

public class PrintNumber {
   
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = scn.next();

        System.out.print("Enter the last name: ");
        String lastName = scn.next();

        System.out.println(firstName+" "+lastName);
        scn.close();

    }
    
}