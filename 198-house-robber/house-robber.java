class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
        return nums[0];
        if(nums.length==2)
        return Math.max(nums[0], nums[1]);
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        // dp[0]=nums[0];
        // dp[1]=nums[1];
        // dp[2]=nums[2]+dp[0];
        int max=Math.max(dp[2], nums[1]);
        // for(int i=3;i<dp.length;i++)
        // {
        //     dp[i]=nums[i]+Math.max(dp[i-2],dp[i-3]);
        //     if(dp[i]>max)
        //     max=dp[i];
        // }
        // return max;
        return max(nums.length-1,dp,nums);
    }
    int max(int i,int dp[], int nums[]){
        if(i==0){
            return nums[i];
        }
        if(i<0)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        int left=nums[i]+max(i-2,dp,nums);
        int right=0+max(i-1,dp,nums);
        
        return dp[i]=Math.max(left,right);
        
    }
}