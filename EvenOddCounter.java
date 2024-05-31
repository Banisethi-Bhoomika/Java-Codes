public class EvenOddCounter {
    public static void main(String[] args) {
        if (args.length != 10) {
            System.out.println("Please provide exactly 10 numbers.");
            return;
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                int num = Integer.parseInt(args[i]);
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + args[i] + " is not a valid number.");
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}