package section1.step3;

public class PrimeNumber {

    // time: O(N) | space: O(1)
    static boolean isPrimeNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return  false;
        }
        return true;
    }

    // time: O(sqrt(N) | space: O(1)
    static boolean isPrimeNumber1(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 20;
        boolean result = (isPrimeNumber(n));
        if (n != 1 && result) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Non-Prime Number");
        }
    }
}
