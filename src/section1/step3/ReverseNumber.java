package section1.step3;

public class ReverseNumber {

    // time: O(n) | space: O(1)
    static int reverseNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(reverseNumber(n));
    }
}
