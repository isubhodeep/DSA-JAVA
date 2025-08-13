class Solution {
    public void moveZeroes(int[] nums) {
        int i,j;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0)
            break;
        }
        for(j=i+1;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i]=nums[i]^nums[j];
                nums[j]=nums[i]^nums[j];
                nums[i]=nums[i]^nums[j];
                i=i+1;
            }
        }
    }
}