public class OddEvenCounter {
    public static void main(String[] args) {
        if (args.length != 10) {
            System.out.println("Please provide exactly 10 numbers.");
            return;
        }

        int oddCount = 0;
        int evenCount = 0;

        for (String arg : args) {
            int num = Integer.parseInt(arg);
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Odd numbers: " + oddCount);
        System.out.println("Even numbers: " + evenCount);
    }
}