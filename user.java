import java.util.Scanner;
public class user
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name");
String name = sc.nextLine();
System.out.println("Enter your roll number");
int roll = sc.nextInt();
System.out.println("Enter your section");
int sec = sc.nextInt();
System.out.println("your name is" +name);
System.out.println("your name roll number" +roll);
System.out.println("your sec"+sec);
}
}
