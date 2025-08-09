class Solution {
    public List<List<Integer>> generate(int numRows) {
        int i,j,c=1;
        List<List<Integer>> l1=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        for(i=0;i<numRows;i++){
            for(j=0;j<=i;j++){
                if(j==0 || i==0){
                    c=1;
                }
                else{
                    c=c*(i-j+1)/j;
                }
                l.add(c);
            }
            l1.add(new ArrayList<>(l));
            l.clear();
        }
        return l1;
    }
}