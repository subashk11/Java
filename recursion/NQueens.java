package recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        int[][] board=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                board[i][j]=0;
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,board,4,ans);
        System.out.println(ans);
    }

    static void solve(int col,int[][] board,int n,List<List<Integer>> ans)
    {
        if(col==board[0].length)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(board[i][j]==1)
                    {
                        temp.add(j+1);
                    }
                }
            }
            ans.add(temp);
            return ;
        }

        for(int row=0;row<n;row++)
        {
            if(isSafe(board,row,col,n))
            {
                board[row][col]=1;
                solve(col+1,board,n,ans);
                board[row][col]=0;
            }
        }
    }

    static boolean isSafe(int[][] board,int row,int col,int n)
    {
        int tempR=row;
        int tempC=col;

        while(row>=0 && col>=0)
        {
            if(board[row][col]==1)return false;
            row--;
            col--;
        }

        row=tempR;
        col=tempC;
        while(col>=0)
        {
            if(board[row][col]==1)return false;
            col--;
        }

        row=tempR;
        col=tempC;

        while(row<n && col>=0 )
        {
            if(board[row][col]==1)return false;
            row++;
            col--;
        }
        return true;
    }
}
