class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                break;
        }
        j=i+1;
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
            j++;
        }
    }
}
// 0 1 0 3 12
// i j
// 1 0 0 3 12
//   i