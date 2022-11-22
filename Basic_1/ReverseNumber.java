package Basic_1;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("ENTER NUMBER: ");
        int num=scn.nextInt();
        int rem,rev=0,temp;

        temp=num;

        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }

        System.out.println("REVERSE OF " +num+ " IS: "+rev);
        scn.close();
    }
}
  