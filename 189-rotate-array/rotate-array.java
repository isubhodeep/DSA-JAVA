class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1)
        return;
        k=k%nums.length;
        if(k==0)
        return;
        rotatei(nums,0,nums.length-k-1);
        rotatei(nums,nums.length-k,nums.length-1);
        rotatei(nums,0,nums.length-1);
    }
    void rotatei(int nums[],int si,int ei){
        while(si<ei){
            nums[si]=nums[si]^nums[ei];
            nums[ei]=nums[si]^nums[ei];
            nums[si]=nums[si]^nums[ei];
            si++;
            ei--;
        }
    }
}