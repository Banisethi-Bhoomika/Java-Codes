import java.util.Scanner;
public class number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int r = n%2;
        if(r==0)
        {
            System.out.println("the number is even");
        }
        else
        {
            System.out.println(" the number is odd");
        }
    }
}
