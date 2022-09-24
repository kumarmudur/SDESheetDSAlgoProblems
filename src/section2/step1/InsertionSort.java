package section2.step1;

public class InsertionSort {
    // time: O(N^2) | space: O(1)
    public static void main(String[] args) {
        int[] arr = { 13,46,24,52,20,9 };
        int n = arr.length;
        System.out.println("Before Insertion Sort: ");
        for (int index: arr) {
            System.out.print(index + " ");
        }
        System.out.println();

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                // swap
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println("After Insertion Sort: ");
        for (int index: arr) {
            System.out.print(index + " ");
        }
        System.out.println();
    }
}
