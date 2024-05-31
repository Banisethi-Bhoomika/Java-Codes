import java.util.Scanner;

// Define the interface Employee
interface Employee {
    double earnings(double basicSalary);
    double deductions(double basicSalary);
    double bonus(double basicSalary);
}

// Java class Manager using the Employee interface
class Manager implements Employee {
    // Implementing the earnings method
    public double earnings(double basicSalary) {
        double da = 0.8 * basicSalary;
        double hra = 0.15 * basicSalary;
        return basicSalary + da + hra;
    }

    // Implementing the deductions method
    public double deductions(double basicSalary) {
        return 0.12 * basicSalary; // 12% of basic salary as PF deduction
    }

    // bonus() method not implemented here
}

// Java class Substaff extending Manager and implementing the bonus() method
class Substaff extends Manager {
    // Implementing the bonus method
    public double bonus(double basicSalary) {
        return 0.5 * basicSalary; // 50% of basic salary as bonus
    }
}

// Main class to find out earnings, deductions, and bonus of a substaff
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the basic salary
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Create an object of Substaff class
        Substaff substaff = new Substaff();

        // Calculate earnings, deductions, and bonus
        double earnings = substaff.earnings(basicSalary);
        double deductions = substaff.deductions(basicSalary);
        double bonus = substaff.bonus(basicSalary);

        // Display the results
        System.out.println("Earnings: " + earnings);
        System.out.println("Deductions: " + deductions);
        System.out.println("Bonus: " + bonus);

        scanner.close();
    }
}