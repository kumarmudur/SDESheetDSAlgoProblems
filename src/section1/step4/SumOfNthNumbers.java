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

    public static void main(String[] args) {
        sumOfNthNumbers(5);
//        System.out.println(sumOfNthNumbers1(5, 0));
    }
}
