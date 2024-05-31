import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 3x3 matrix
        int[][] matrix = new int[3][3];

        // Ask the user to enter the elements of the matrix
        System.out.println("Enter the elements of the 3x3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of the left diagonal
        int leftDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            leftDiagonalSum += matrix[i][i];
        }

        // Calculate the sum of the right diagonal
        int rightDiagonalSum = 0;
        for (int i = 0, j = 2; i < 3 && j >= 0; i++, j--) {
            rightDiagonalSum += matrix[i][j];
        }

        // Print the sum of each diagonal
        System.out.println("Sum of elements in the left diagonal: " + leftDiagonalSum);
        System.out.println("Sum of elements in the right diagonal: " + rightDiagonalSum);

        scanner.close();
    }
}