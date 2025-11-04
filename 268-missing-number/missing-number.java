class Solution {
    public int missingNumber(int[] nums) {
      int sum1=0,sum2,i;
      for(i=0;i<nums.length;i++){
        sum1+=i+1;
        sum1-=nums[i];
      }  
      return sum1;
    }
    
}
// + 1 2 3
// - 3 0 1
// = 2