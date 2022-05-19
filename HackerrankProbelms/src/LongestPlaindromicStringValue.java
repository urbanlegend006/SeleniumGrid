import java.util.Arrays;

public class LongestPlaindromicStringValue {


    public static void main(String[] args) {
        String str = "aaaabbaa";
        //int[] dp = new int[str.length()];
        //Arrays.fill(dp, Integer.MIN_VALUE);
        int[] ind =  new int[]{0,0};
        int[] indexes = longestPalindromicSubString(str, 0, str.length() - 1, ind);
        System.out.println(str.substring(indexes[0], indexes[1]));
    }

    private static int[] longestPalindromicSubString(String str, int start, int end, int[] dp) {

        if (start == end) return new int[]{start, end};
        if (start > end) return new int[]{0,0};

        if (str.charAt(start) == str.charAt(end)) {
            int midLen = end - start - 1;
            int temp[] = longestPalindromicSubString(str, start + 1, end - 1, dp);
            if(temp[1] - temp[0] == midLen){
                if(dp[1] - dp[0] < end - start){
                    dp[1] = end;
                    dp[0] = start;
                    return dp;
                }
            }
        }

        int right[] = longestPalindromicSubString(str, start + 1, end, dp);
        int left[] = longestPalindromicSubString(str, start, end - 1, dp);

        if(Math.abs(right[1]-right[0]) >= Math.abs(left[1]-left[0])){
            if(dp[1] - dp[0] < right[1] - right[0]){
                dp[1] = right[1];
                dp[0] = right[0];
                return dp;
            }
        }
        return right;
    }
}

