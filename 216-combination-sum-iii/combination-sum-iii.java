class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> l= new ArrayList<>();
        if(n<=k)
        return l;
        List<Integer> l1= new ArrayList<>();
        int arr[] = new int[9];
        for(int i=0;i<9;i++)
        arr[i]=i+1;
        comb(0,arr,l1,l,k,n,0);
        return l;

    }
    void comb(int i, int[] arr, List<Integer> l1, List<List<Integer>> l, int k, int n, int s)
    {
        if(i>=arr.length || l1.size()==k)
        {
            if(s==n && l1.size()==k)
            l.add(new ArrayList<>(l1));
            return;
        }
        l1.add(arr[i]);
        s=s+arr[i];
        comb(i+1, arr, l1, l, k, n, s);
        s=s-arr[i];
        l1.remove(l1.size()-1);
        comb(i+1, arr, l1, l, k, n, s);
    }
}