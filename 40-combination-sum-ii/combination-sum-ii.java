class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> l1=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        Arrays.sort(candidates);
        sum(0,0,candidates,target,l,l1);
        return l1;
    }
    void sum(int i,int sum,int arr[],int target, List <Integer> l,List<List<Integer>> l1){
        if(i>=arr.length || sum>=target){
            if(sum==target)
            l1.add(new ArrayList<>(l));
            return;
        }
        l.add(arr[i]);
        sum+=arr[i];
        sum(i+1,sum,arr,target,l,l1);
        l.remove(l.size()-1);
        sum-=arr[i];
        for(;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1])
            break;
        }
        sum(i+1,sum,arr,target,l,l1);
}
}