package algoimpl.dp;

public class WaysToFindSum {

    public static int sum(int total, int k, int start , int[][] dp){

        if (total==0){
            return 1;
        }
        if (dp[total][start]>-1){
            return dp[total][start];
        }
        int count = 0;
        for(int i=start;i<=k; i++){
            if (total - i >=0) {
                count  = count +  sum(total - i, k, i, dp);
            }
        }
        return dp[total][start] = count;
    }

    public static int ways(int total, int k){
        int[][] dp = new int[total+1][k+1];
        for (int i=0;i<=total;i++){
            for (int j=0;j<=k;j++){
                dp[i][j]=-1;
            }
        }
        return sum(total, k,   1, dp);
    }
    public static void main(String[] args) {

        int total = 842;
        int k = 91;

        System.out.println(ways(total, k));


    }

}
