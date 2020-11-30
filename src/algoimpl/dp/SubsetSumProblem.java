package algoimpl.dp;


import java.util.Scanner;

/**
 * Subset Sum Problem | DP-25
 * https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
 */


public class SubsetSumProblem {


    private static boolean isSubsetSum(int[] arr, int n, boolean[][] dp, int sum){

        if (sum == 0){
            return true;
        }
        if (n == 0){
            return false;
        }

        if (dp[n][sum]){
            return dp[n][sum];
        }

        if (sum < arr[n-1]){
            return dp[n][sum] = isSubsetSum(arr, n-1, dp, sum);
        }

        return  dp[n][sum] = isSubsetSum(arr, n-1, dp, sum - arr[n-1]) || isSubsetSum(arr, n-1, dp, sum);




    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        boolean[][] dp = new boolean[n+1][sum+1];

        System.out.println(isSubsetSum(arr, n, dp, sum));
    }
}
