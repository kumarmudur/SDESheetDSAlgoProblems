package section3.step1_easy;

// Topic: Arrays

public class RotateArrayByOne {

    // time: O(N) | space: O(N)
    static void rotateArrayByOne(int[] arr, int n) {
        int[] temp = new int[n];

        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];
        for (int index : arr) {
            System.out.print(index + " ");
        }
    }

    static void rotateArrayByOne1(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
        for (int index : arr) {
            System.out.print(index + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        int n = 5;
        rotateArrayByOne1(arr, n);
    }
}
