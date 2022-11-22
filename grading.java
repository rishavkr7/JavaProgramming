import java.util.Scanner;
public class grading {
public static void main (String[] args){
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter the Marks: ");
      int marks = scn.nextInt();
      
      if (marks>90)
      {
        System.out.print("Excellent");
      }

      else if(marks>80 && marks<=90)
      {
        System.out.print("Good");
      }
      else if(marks>70 && marks<=80)
      {
        System.out.print("fair");
      }
      else if(marks>60 && marks<=70)
      {
        System.out.print("Meets Expectations");
      }
     else{
        System.out.print("below par");
     } 
     scn.close();
}
}
