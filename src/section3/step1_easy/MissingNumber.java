package section3.step1_easy;

public class MissingNumber {

    // time: O(N) | space: O(1)
    static int missingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return totalSum - sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4, 6, 8};
        int n = 8;
        System.out.println(missingNumber(arr, n));
    }
}
