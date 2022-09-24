package section1.step4;

import java.io.*;
import java.util.Arrays;

// Topic: String

public class PalindromeString {

    // time: O(N) | space: O(1)
    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char l = str.charAt(left);
            char r = str.charAt(right);
            if (!Character.isLetterOrDigit(l)) left++;
            else if (!Character.isLetterOrDigit(r)) right--;
            else if (Character.toLowerCase(l) != Character.toLowerCase(r)) return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "ABCDCBA";
        boolean result = isPalindrome(str);
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
