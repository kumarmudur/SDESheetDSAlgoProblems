package section1.step3;

public class PrintAllDivisors {

    // time: O(N) | space: O(1)
    static void printDivisorsBruteForce(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0) System.out.print(i + " ");
        }
    }

    // time: O(sqrt(N) | space: O(1)
    static void printDivisorsOptimal(int n) {
        for (int i = 1; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print(n / i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        printDivisorsOptimal(36);
    }
}
