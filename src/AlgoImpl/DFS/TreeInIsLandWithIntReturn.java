package AlgoImpl.DFS;

import java.util.Scanner;

public class TreeInIsLandWithIntReturn {



    public static int matrix(int[][] mat, int n, int m, boolean[][] vis, int x, int y){


        vis[x][y]= true;
        int[] xmove = new int[]{1,-1,0,0,1,1,-1,-1};
        int[] ymove = new int[]{0,0,1,-1,1,-1,1,-1};

        int val = 1;
        for (int l=0;l<8;l++){

            int xnew = x + xmove[l];
            int ynew = y + ymove[l];


            if (xnew>=0 && xnew<n && ynew >=0 && ynew<m && !vis[xnew][ynew] && mat[xnew][ynew]==1){
                val = val + matrix(mat, n, m, vis,  xnew, ynew);
            }
        }

        return val;
    }

    public static void main(String[] args) {

/*
        3  5

        1 1 1 0 1
        1 0 1 1 0
        1 0 1 0 1


        ans = 9
*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int[][] matrix = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j]=s.nextInt();
            }
        }


        boolean[][] vis = new boolean[n][m];

        int maxm=Integer.MIN_VALUE;


        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (matrix[i][j]==1){
                    int val = matrix(matrix, n, m , vis, i,j);
                    if (maxm< val){
                        maxm = val;
                    }

                }
            }
        }

        System.out.println(maxm);





    }

}
