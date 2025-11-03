class Solution {
    public int removeDuplicates(int[] nums) {
      int i,j=0;
      for(i=1;i<nums.length;i++){
        if(nums[j]!=nums[i]){
            j++;
            nums[j]=nums[i];
        }
      } 
      return j+1; 
    }
}