import java.util.Arrays;

public class LongestPalindromicSubString {


    public static void main(String[] args) {
        String str = "aaaabbaa";
        int[] dp = new int[str.length()];
        Arrays.fill(dp, Integer.MIN_VALUE);
        int size = longestPalindromicSubString(str, 0, str.length() - 1, dp);
        System.out.println(size);
    }

    private static int longestPalindromicSubString(String str, int start, int end, int[] dp) {

        if (start == end) return 1;
        if (start > end) return 0;

        if (str.charAt(start) == str.charAt(end)) {
            int midLen = end - start - 1;
            int temp = longestPalindromicSubString(str, start + 1, end - 1, dp);
            if(temp == midLen)
                return 2 + midLen;
        }
        return Math.max(longestPalindromicSubString(str, start + 1, end, dp), longestPalindromicSubString(str, start, end - 1, dp));

    }
}
