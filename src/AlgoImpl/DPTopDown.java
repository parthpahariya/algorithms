package AlgoImpl;

public class DPTopDown {

    private static int lcs(int[][] dp, String x, String y, int n, int m) {

        if (n == 0 || m == 0) {
            return dp[n][m] = 0;
        }
        if(dp[n][m]>Integer.MIN_VALUE){
            return dp[n][m];
        }

        if (x.charAt(n - 1) == y.charAt(m - 1)) {
            return dp[n][m] = lcs(dp, x, y ,n-1, m-1) + 1;
        }
        return dp[n][m] = Math.max(lcs(dp,x, y,n-1, m), lcs(dp, x, y, n, m-1));
    }


    public static void main(String[] args) {

        int n, m;
        String x = "abcdxyzddghgjhgkjhggghggjbhjjhbhgjhgbkgbjhgtvftgfdfkyhiubkjfrtys";
        String y = "xyzabcddyhjbggfgvjhfjhvgivuivyftrdfcujvgijhtgvftrgfdcfvjhgfyhfvg";

        n = x.length();
        m = y.length();
        int[][] dp = new int[n+1][m+1];
        for (int i=0;i<=n;i++)
            for (int j=0;j<=m;j++)
                dp[i][j]=Integer.MIN_VALUE;

        System.out.println(lcs(dp, x, y, n, m));
    }
}
