/*take first and last name from user and print both in one line last name followed by the first name*/
import java.util.Scanner;
public class name
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your first name");
String x = sc.nextLine();
System.out.println("Enter your second name");
String y = sc.nextLine();
System.out.println("Enter your  first name is" +x);
System.out.println("Enter your  second name is" +y);
String z = y.concat(x);
System.out.println("after concat: " +z);
}
}
