package section3.step2_medium;

public class MajorityElement {

    // time: O(N) | space: O(1)
    static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num: nums) {
            if (count == 0) candidate = num;
            if (num == candidate) count++;
            else count--;
        }
        return candidate;
    };

    public static void main(String[] args) {
        int[] arr = { 4,4,2,4,3,4,4,3,2,4 };
        System.out.println(majorityElement(arr));
    }
}
