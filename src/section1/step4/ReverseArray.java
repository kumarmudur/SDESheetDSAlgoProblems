package section1.step4;

import java.util.Arrays;

public class ReverseArray {

    // time: O(N) | space: O(1)
    static int[] reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
