package section1.step4;

public class Factorial {

    // time: O(N) | space: O(N)
    static int factorial(int n) {
        if (n < 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
