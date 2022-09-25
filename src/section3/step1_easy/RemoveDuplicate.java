package section3.step1_easy;

// Topic: Arrays, Two Pointers, HashSet

import java.util.Arrays;
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

    // time: O(N) | space: O(1)
    static int removeDuplicates1(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1,1,2,2,2,3,3 };
        int k = removeDuplicates1(arr);
        System.out.println("The array after removing duplicate elements is: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
