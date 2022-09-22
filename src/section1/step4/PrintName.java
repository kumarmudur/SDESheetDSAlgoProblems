package section1.step4;

// Topic: Recursion

public class PrintName {

    // Solution 1: Iterative
    static void printNames(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("shiva");
        }
    }

    // Solution 2: Recursion
    static void printNames1(int n) {
        if (n == 0) return;
        System.out.println("shiva");
        printNames1(n - 1);
    }

    // Solution 3: Recursion
    static void printNames2(int n, int i) {
        if (i > n) return;
        System.out.println("shiva");
        printNames2(n, i + 1);
    }

    public static void main(String[] args) {
        printNames1(5);
    }
}
