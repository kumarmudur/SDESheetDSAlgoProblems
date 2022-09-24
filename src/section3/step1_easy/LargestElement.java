package section3.step1_easy;

public class LargestElement {

    static int largestElement(int[] arr) {
        int larest = arr[0];

        for (int i = 1; i < arr.length; i++) {
          if (arr[i] > larest) larest = arr[i];
        }
        return larest;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0, 6};
        System.out.println(largestElement(arr));
    }
}
