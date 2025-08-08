class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> l= new ArrayList<>();
        List<String> l1= new ArrayList<>();
        String board[][]= new String[n][n];
        for(int i=0;i<n;i++)
        Arrays.fill(board[i],".");
        solve(0, board, l1, l, n);
        return l;
    }
    void solve(int col, String[][] board,  List<String> l1, List<List<String>> l, int n){
        if(col==n)
        {
            for(int i=0;i<n;i++)
            {
            l1.add(String.join("",board[i]));
            }
            l.add(new ArrayList<>(l1));
            l1.clear();
            return;
        }
        for(int row=0;row<n;row++)
        {
            if( isValid(board, row, col, n))
            {
            board[row][col]= "Q";
            solve(col+1, board, l1, l,n);
            board[row][col]= ".";
            }
        }
      
    }
    Boolean isValid(String board[][], int row,int col , int n){
        int dr=row;
        int dc=col;
        while(dr>=0 && dc>=0){
            if(board[dr][dc]=="Q")
            return false;
            dr--;
            dc--;
        }
        dr=row;
        dc=col;
        while(dc>=0 )
        {
            if(board[dr][dc]=="Q")
            return false;
            dc--;
        }
        dc=col;
        dr=row;
        while(dc>=0 && dr<n)
        {
            if(board[dr][dc]=="Q")
            return false;
            dr++;
            dc--;
        }
        return true;
    }

}