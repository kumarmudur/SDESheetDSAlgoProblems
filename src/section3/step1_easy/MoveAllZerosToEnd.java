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

    // time: O(N) | space: O(1)
    static void moveAllZerosToEnd1(int[] arr) {
        int k = 0;
        int length = arr.length;
        while (k < arr.length) {
            if (arr[k] == 0) break;
            else k = k + 1;
        }

        int i = k; int j = k + 1;

        while (i < length && j < length) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }

        for (int element: arr) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 0, 2, 3, 0, 4, 0, 1 };
        moveAllZerosToEnd1(arr);
    }
}
