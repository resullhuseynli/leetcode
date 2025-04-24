import java.util.Arrays;

public class LongestPrefix {
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

    public String longestCommonPrefix2(String[] strs) {

        String result = "";
        int wordLength = strs[0].length();

        for (String s : strs) {
            wordLength = Math.min(s.length(), wordLength);
        }

        for (int i = 0; i < wordLength; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (!strs[j].substring(0, i + 1).equals(strs[j + 1].substring(0, i + 1))) {
                    result += strs[j].substring(0, i);
                    return result;
                }
            }
        }

        for (String s : strs) {
            if (s.length() == wordLength) {
                result += s;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LongestPrefix longestPefix = new LongestPrefix();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestPefix.longestCommonPrefix(strs)); // Output: "fl"
    }
}