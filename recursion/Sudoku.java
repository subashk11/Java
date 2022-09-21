package recursion;

public class Sudoku {
    public static void main(String[] args) {
        int[][] grid=new int[5][5];
        if(solve(grid)){
            System.out.println("Solve");
        }
    }

    static boolean solve(int[][] grid)
    {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==0) {
                  for(int num=1;num<=9;num++)
                  {
                      if (isSafe(grid, i, j,num)) {
                          grid[i][j] = 1;
                          if (solve(grid)) {
                              return true;
                          } else {
                              grid[i][j] = 0;
                          }

                      }
                  }
                }
            }
            return false;
        }
        return true;
    }

    static boolean isSafe(int[][] grid,int row,int col,int num)
    {
        for (int i = 0; i < grid.length; i++) {
            if(grid[row][i]==num)return false;
            if(grid[i][col]==num)return false;

            if(grid[3*(row/3+i/3)][3*(col/3+1%3)]==num)
            {
                return false;
            }
        }
        return true;
    }
}
