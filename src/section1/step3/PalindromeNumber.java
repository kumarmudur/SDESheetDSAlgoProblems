package section1.step3;

public class PalindromeNumber {

    // time: O(logN) | space: O(1)
    static boolean reverseNumber(int n) {
        int reverse = 0;
        int x = n;
        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        return reverse == n;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(reverseNumber(n));
    }
}
