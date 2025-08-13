class Solution {
    public int singleNumber(int[] nums) {
        int x1=0, x2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            x2=x2^nums[i];
            else
            x1=x1^nums[i];
        }
        return (x1^x2);
    }
}