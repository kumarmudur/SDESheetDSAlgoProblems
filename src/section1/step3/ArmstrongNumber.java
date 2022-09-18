package section1.step3;

public class ArmstrongNumber {

    // time: O(N) | space: O(1)
    static boolean isArmstrongNumber(int n) {
        int originalNo = n;
        int count = 0;
        int temp = n;
        int sumOfPower = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        while (n != 0) {
            int digit = n % 10;
            sumOfPower += Math.pow(digit, count);
            n /= 10;
        }
        return (sumOfPower == originalNo);
    }

    public static void main(String[] args) {
        int n = 153;
        if (isArmstrongNumber(n)) {
            System.out.println("Yes, it is an Armstrong Number\n");
        } else {
            System.out.println("No, it is not an Armstrong Number\n");
        }
    }
}
