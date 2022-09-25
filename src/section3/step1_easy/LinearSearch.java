package section3.step1_easy;

// Topic: Arrays, Search

public class LinearSearch {

    // time: O(N) | space: O(1)
    static int linearSearch(int[] arr, int num, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int num = 7;
        int n = arr.length;
        System.out.println(linearSearch(arr, num, n));
    }
}
