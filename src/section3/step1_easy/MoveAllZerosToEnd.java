package section3.step1_easy;

// Topic: Arrays

import java.util.Arrays;

public class MoveAllZerosToEnd {

    // time: O(N) | space: O(N)
    static void moveAllZerosToEnd(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int count = 0;
        for (int element : arr) {
            if (element != 0) {
                temp[count++] = element;
            }
        }
        while (count < n) {
            temp[count++] = 0;
        }
        System.out.println("temp " + Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };
        moveAllZerosToEnd(arr);
    }
}
