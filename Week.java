import java.util.Scanner;
public class Week
 {
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter a number from 1 to 7");
     num = sc.nextInt();
    if(num==1)
    {
        System.out.println("the day is Sunday");
    }
    if(num==2)
    {
        System.out.println("the day is Monday");
    }
    if(num==3)
    {
        System.out.println("the day is Tuesday");
    }
    if(num==4)
    {
        System.out.println("the day is wednesday");
    }
    if(num==5)
    {
        System.out.println("the day is Thrusday");
    }
    if(num==6)
    {
        System.out.println("the day is Friday");
    }
    if(num==7)
    {
        System.out.println("the day is Saturday");
    }
    if(num<1 && num>7)
    {
        System.out.println("INVALID");
    }
  } 
}
