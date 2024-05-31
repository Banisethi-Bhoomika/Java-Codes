import java.util.Arrays;
import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the size of the list
        System.out.print("Enter the size of the list: ");
        int size = scanner.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[size];

        // Ask the user to enter the numbers
        System.out.println("Enter the numbers:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted numbers:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}