package section1.step4;

public class PrintNum {

    // time: O(N) | space: O(1)
    static void printNum(int n, int i) {
        if (i > n) return;
        System.out.print(i + " ");
        printNum(n, i + 1);
    }

    static void printNum1(int n) {
        if (n < 1) return;
        System.out.print(n + " ");
        printNum1(n - 1);
    }

    public static void main(String[] args) {
//        printNum(5, 1);
        printNum1(5);
    }
}
