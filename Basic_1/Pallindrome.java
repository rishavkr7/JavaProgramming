package Basic_1;
import java.util.*;

public class Pallindrome {
    public static void main(String[] args){
    
        Scanner scn = new Scanner(System.in);
        System.out.print("ENTER THE NUMBERS OF TERMS: ");
        int terms=scn.nextInt();
        for(int i=1;i<=terms;i++){
        System.out.print("Enter the Number: ");
        int num=scn.nextInt(); 
        int rem,rev=0,temp;

        temp=num;

        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        
        if(num==rev){
            System.out.println("THE GIVEN NUMBER "+num+" IS A PALLINDROME NUMBER");
        }
        else{
        System.out.println("THE GIVEN NUMBER " +num+" IS NOT A PALLINDROME NUMBER");
        }
    }
}
}

// import java.util.*;
// public class Pallindrome;
// public static void main(String[] args){
//       Scanner scn = new Scanner(System.in);
      


