class Solution {
    public boolean check(int[] nums) {
        int i;
        for(i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
            break;
        }
        if(i>=nums.length)
        return true;
        for(int j=(i+1)%nums.length;j!=i;j=((j+1)%nums.length)){
            
            int k=(j==0)?nums.length-1:(j-1);
            if(nums[j]<nums[k])
            return false;
        }
        return true;
    }
    
}