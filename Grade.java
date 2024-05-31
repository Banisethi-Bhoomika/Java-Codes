//Write a program to print the corresponding grade for the given mark using if..Else statement in Java.
/*Input:      Mention the mark in the program
Output:   Display the Grade either O/E/A/B/C*/
import java.util.Scanner;
public class Grade
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter marks");
       int marks = sc.nextInt();
       if(marks>=91 && marks<=100)
       {
        System.out.println("the grade is o");
       }
       if(marks>=81 && marks<=90)
       {
        System.out.println("the grade is E");
       }
       if(marks>=71 && marks<=80)
       {
        System.out.println("the grade is A");
       }
       if(marks>=61 && marks<=70)
       {
        System.out.println("the grade is B");
       }
       if(marks>=51 && marks<=60)
       {
        System.out.println("the grade is C");
       }
       else
       {
        System.out.println("Invaid input");
       }
    }
}