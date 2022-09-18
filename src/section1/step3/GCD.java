package section1.step3;

public class GCD {
    // time: O(N) | space: O(1)
    static int gcdOfTwoNumbers(int a, int b) {
        int min = Math.min(a, b);
        int gcd = 1;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    };

    // time: O(logMin(a, b)) | space: O(1)
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        System.out.println(gcd(a, b));
    }
}
