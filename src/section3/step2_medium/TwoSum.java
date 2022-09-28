package section3.step2_medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // time: O(N) | space: O(N)
    static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                result[1] = i;
                result[0] = map.get(target - arr[i]);
                return result;
            }
            map.put(arr[i], i);
        }
        return result;
     }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
