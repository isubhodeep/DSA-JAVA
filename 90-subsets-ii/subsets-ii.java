class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        Arrays.sort(nums);
        subhobaby(0, nums, l1, l);
        return l;
    }
    void subhobaby(int i, int[] arr, List<Integer> l1, List<List<Integer>> l)
    {
        if(i>=arr.length)
        {
            l.add(new ArrayList<>(l1));
            return;
        }
        
        l1.add(arr[i]);
        subhobaby(i+1, arr, l1, l);
        l1.remove(l1.size()-1);
        for(;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1])
            break;
        }
        subhobaby(i+1, arr, l1, l);
    }
}