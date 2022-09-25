package section3.step1_easy;

// Topic: Arrays, Two Pointers, HashSet

import java.util.HashSet;

public class RemoveDuplicate {

    // time: O(N*log(N)) + O(N) | space: O(N)
    static int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int index : arr) {
            set.add(index);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = { 1,1,2,2,2,3,3 };
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
