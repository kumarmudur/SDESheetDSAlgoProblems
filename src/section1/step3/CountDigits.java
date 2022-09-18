package section1.step3;

public class CountDigits {
    // time: O(n) | space: O(1)
    static int countDigits(int n) {
        int x = n;
        int count = 0;

        while (x != 0) {
            x = x / 10;
            count++;
        }
        return count;
    }

    // time: O(1) | space: O(1)
    static int countDigits1(int n) {
        String n2 = Integer.toString(n);
        return n2.length();
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Number of digits " + countDigits(n));
    }
}
