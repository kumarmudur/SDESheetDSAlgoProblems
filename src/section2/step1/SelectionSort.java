package section2.step1;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        System.out.println("Before selection sort");
        for (int index : arr) {
            System.out.print(index + " ");
        }
        System.out.println();

        // Selection sort
        for (int i = 0; i < n - 1; i++) {
            int lowest = i;
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) lowest = j;
            }
            // swap
            int temp = arr[lowest];
            arr[lowest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After selection sort");
        for (int index : arr) {
            System.out.print(index + " ");
        }
        System.out.println();
    }
}
