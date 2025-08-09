class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        int i,j,r=matrix.length,c=matrix[0].length;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int rows : row){
            for(i=0;i<c;i++){
                matrix[rows][i]=0;
            }
        }
        for(int cols : col){
            for(i=0;i<r;i++){
                matrix[i][cols]=0;
            }
        }
    }
}