package algoimpl.dp;

/**
 *
 * company -> WhiteHatJR
 */

public class LongestPalindromicSubstring {

    static int longestPalindromic(char[] str, int n) {

        int maxm =1;

        boolean[][] dp = new boolean[n][n];

        //for len 1
        for (int i=0;i<n;i++){
            dp[i][i]=true;
        }

        //for len 2
        for (int i=0;i<n-1;i++){
            if (str[i]==str[i+1]) {
                dp[i][i + 1] = true;
                maxm = 2;
            }
        }
        // from length 3 to n
        for (int len = 3; len <= n; len++){
            for(int i=0, j=i+len-1; j<n; j++, i++){
                if (dp[i+1][j-1] && str[i]==str[j]){
                    dp[i][j]=true;
                    maxm = Math.max(maxm, Math.abs(i-j+1));
                }
            }
        }
        return maxm;
    }

    public static void main(String[] args)
    {
        String str = "aabbaaaaaa";

        // Function Call
        // Ans  = 6
        System.out.print(longestPalindromic(str.toCharArray(), str.length()));
    }
}
