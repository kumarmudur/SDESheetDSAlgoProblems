package section1.step4;

public class SumOfNthNumbers {

    // time: O(N) | space: O(1)
    static void sumOfNthNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum " + sum);
    }

    // time: O(N) | space: O(1)
    static int sumOfNthNumbers1(int n, int sum) {
        if (n < 1) return sum;
        sum += n;
        return sumOfNthNumbers1(n - 1, sum);
    };

    static int sumOfNthNumbers2(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        sumOfNthNumbers(5);
        System.out.println(sumOfNthNumbers1(5, 0));
    }
}
