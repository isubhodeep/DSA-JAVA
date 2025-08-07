class Solution {
    
    public int combinationSum4(int[] nums, int target) {
        Integer arr[] = new Integer[target+1];
        return countWays(nums, arr, 0, target);
    }

    private int countWays( int[] nums, Integer[] arr, int sum, int target) {
        if(sum>=target)
        {
            if(sum==target)
            return 1;
            return 0;
        }
        if(arr[sum]!=null)
        return arr[sum];
        int i=0;
        for(int x=0;x<nums.length;x++)
        {
            sum=sum+nums[x];
            i+=countWays(nums, arr, sum, target);
            sum=sum-nums[x];
            
            
        }
        return arr[sum]=i;
    }
}