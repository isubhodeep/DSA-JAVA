class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l1=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
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
        sum(i,sum,arr,target,l,l1);
        l.remove(l.size()-1);
        sum-=arr[i];
        sum(i+1,sum,arr,target,l,l1);
    }

}