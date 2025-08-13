class Solution {
    public boolean check(int[] nums) {
        int i,j;
        for(i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
            break;
        }
        if(i>=nums.length)
        return true;
        for(j=i;j<nums.length-1;j++){
            if(nums[j]>nums[j+1])
            return false;
        }
        return nums[j]<=nums[0];
    }
    
}