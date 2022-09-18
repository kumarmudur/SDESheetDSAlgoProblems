package section1.step3;

public class PrintAllDivisors {

    // time: O(N) | space: O(1)
    static void printDivisorsBruteForce(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0) System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        printDivisorsBruteForce(36);
    }
}
