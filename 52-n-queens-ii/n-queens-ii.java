class Solution {
    public int totalNQueens(int n) {
       int board[][]= new int [n][n];
       for(int i=0;i<n;i++)
       Arrays.fill(board[i],0);
       return nQueens(0,board,n);
    }
    int nQueens(int col, int[][] board, int n)
    {
       if(col==n)
       {
        return 1;
       }
       int l=0;
       for(int row=0;row<n;row++)
       {

        if(isSafe(board, row, col, n))
        {
            board[row][col]=1;
            l=l+nQueens(col+1, board, n);
            board[row][col]=0;
        }
       }
       return l;
    }
    Boolean isSafe(int[][] board, int row, int col, int n )
    {
        int dr=row;
        int dc=col;
        while(row>=0 && col>=0)
        {
            if(board[row][col]==1)
            return false;
            row--;
            col--;
        }
        row=dr;
        col=dc;
        
         while(col>=0)
        {
            if(board[row][col]==1)
            return false;
            col--;
        }
        col=dc;
         while(row<n && col>=0)
        {
            if(board[row][col]==1)
            return false;
            row++;
            col--;
        }
        return true;

    }

}