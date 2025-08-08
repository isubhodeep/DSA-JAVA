class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
        return nums[0];
        if(nums.length==2)
        return Math.max(nums[0], nums[1]);
        int dp[]=new int[nums.length-1];
        Arrays.fill(dp,-1);
        // dp[0]=nums[0];
        // dp[1]=nums[1];
        // dp[2]=nums[2]+dp[0];
        // int max=Math.max(dp[2], nums[1]);
        // for(int i=3;i<dp.length;i++)
        // {
        //     dp[i]=nums[i]+Math.max(dp[i-2],dp[i-3]);
        //     if(dp[i]>max)
        //     max=dp[i];
        // }
        // return max;
        int a1, a2;
        int arr[] = Arrays.copyOfRange(nums, 1, nums.length);
        a1= max(nums.length-2,dp,nums);
        Arrays.fill(dp,-1);
        a2= max(arr.length-1,dp,arr);
        return Math.max(a1,a2);
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