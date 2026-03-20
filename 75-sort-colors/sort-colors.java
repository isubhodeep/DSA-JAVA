class Solution {
    public void sortColors(int[] nums) {
      int l=0, m=0, h=nums.length-1;
      while(m<=h)
      {
        if(nums[m]==0)
        {
            int temp = nums[m];
            nums[m]=nums[l];
            nums[l]=temp;
            l++;
            m++;
        }
        else if(nums[m]==2)
        {
            int temp = nums[m];
            nums[m]=nums[h];
            nums[h]=temp;
            h--;
        }
        else
        m++;
        
      }
      return;
    }
}
// 2 0 2 1 1 0
// lm        h
// 0 0 2 1 1 2
// l   m   h
// 0 0 1 1 2 2

// 2 0 1
// lm  h
// 1 0 2
// lmh
