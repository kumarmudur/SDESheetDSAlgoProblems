package section1.step4;

import java.util.Arrays;

public class ReverseArray {

    // time: O(N) | space: O(1)
    static int[] reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
        return arr;
    }

    static int[] reverse1(int[] arr, int left, int right) {
      if (left >= right) return arr;
      swap(arr, left, right);
      reverse1(arr, left + 1, right - 1);
      return arr;
    };

    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static int[] reverse2(int[] arr, int index) {
        int n = arr.length;
        if (index >= n / 2) return arr;
        swap(arr, index, n - index - 1);
        reverse2(arr, index + 1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
//      System.out.println(Arrays.toString(reverse(arr)));

        System.out.println(Arrays.toString(reverse2(arr, 0)));
    }
}
