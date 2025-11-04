class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=0;
        while(i<nums.length && j<nums.length)
        {
            if(nums[i]==0 && nums[j]!=0)
            {
                nums[i]=nums[i]^nums[j];
                nums[j]=nums[i]^nums[j];
                nums[i]=nums[i]^nums[j];
            }
            if(nums[i]!=0)
            i++;
            if(nums[j]==0)
            j++;
            if(i>j)
            j=i+1;
            
        }
    }
}
