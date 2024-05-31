import java.util.Scanner;

class Largest
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Finding the largest number
        double largestNumber = findLargestNumber(num1, num2, num3);

        // Displaying the result
        System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largestNumber);

        // Closing the scanner
        scanner.close();
    }

    // Function to find the largest number among three numbers
    private static double findLargestNumber(double num1, double num2, double num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
}