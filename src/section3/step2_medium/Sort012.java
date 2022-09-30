package section3.step2_medium;

import java.util.Arrays;

public class Sort012 {

    // time: O(N) | space: O(1)
    static void sort012(int[] arr, int n) {
        int low = 0;
        int high = n - 1;
        int mid = 0;
        int temp;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0 -> {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                }

                case 1 -> mid++;

                case 2 -> {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                }

                default -> {
                }
            }
        }
        System.out.println("arr" + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 2, 0 };
        int N = 5;
        sort012(arr, N);
    }
}
