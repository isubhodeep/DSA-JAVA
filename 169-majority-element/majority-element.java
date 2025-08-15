class Solution {
    public int majorityElement(int[] nums) {
        int i, c=0,e=-1;
        for(i=0;i<nums.length;i++)
        {
            if(c==0)
            {
                c=1;
                e=nums[i];
            }
            else if(c>0 && nums[i]!=e)
            c--;
            else
            c++;
        }
        return e;
    }
}