import java.util.Arrays;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long reversed = 0L;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return (reversed == x);
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int idx = 0;
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
        System.out.println(solution.isPalindrome(-121));

        String[] strs = {"flower", "flow", "flight"};
        System.out.println(solution.longestCommonPrefix(strs));

    }
}