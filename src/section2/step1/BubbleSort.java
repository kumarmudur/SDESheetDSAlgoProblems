package section2.step1;

public class BubbleSort {
    // time: O(N^2) | space: O(1)
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before using Bubble Sort: ");
        for (int index : arr) {
            System.out.print(index + " ");
        }
        System.out.println();

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After Bubble Sort: ");
        for (int index: arr) {
            System.out.print(index + " ");
        }
        System.out.println();
    }
}
