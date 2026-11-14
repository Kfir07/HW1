public class Assignment01Q03 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("The first " + n + " Fibonacci numbers are:");
        long a = 1, b = 1;
        System.out.print(a + " " + b);
        long numOdd = 2;
        for (int i = 2; i < n; i++) {
            long next = a + b;
            if (next % 2 != 0) {
                numOdd++;
            }
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println("\nThe number of odd numbers is: " + numOdd);
    }
}
