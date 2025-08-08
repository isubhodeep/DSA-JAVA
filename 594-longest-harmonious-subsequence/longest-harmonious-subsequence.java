class Solution {
    public int findLHS(int[] nums) {
    if(nums.length==1)
        return 0;
        Arrays.sort(nums);
        if(nums[0]==nums[nums.length-1])
        return 0;
        int i,j;
        int max = Integer.MIN_VALUE;
        for(i=0;i<nums.length;i++){
            for(j=nums.length-1;j>i;j--){
                if(nums[i]+1==nums[j]){
                    max=Math.max(j-i+1,max);
                    break;
                }
            }
        }
        if (max==Integer.MIN_VALUE)
        return 0;
        return max;







        
        // int front=0,rear=0;
        // while(front<nums.length-1 && rear<nums.length)
        // {
        //     if(front==rear)
        //     rear++;
        //     if(nums[rear]<=nums[front]+1)
        //     rear++;
        //     else{ 
        //     max=Math.max(rear-front,max);
        //     front++;
        //     }

        // }
        // if(nums[rear-1]<=nums[front]+1){
        //     max=Math.max(rear-front,max);
        // }
        // if(max==Integer.MIN_VALUE)
        // {
        //     if(nums[front]==nums[rear-1] || nums[rear-1]-nums[front]>1)
        //     return 0;
        //     else
        //     return nums.length;
        // }
        // if(max==1)
        // return 0;
        // return max;
    }
}

















//    if(nums.length==1)
    //     return 0;
    //     Arrays.sort(nums);
    //     int max = Integer.MIN_VALUE;
    //     int i,j;
    //     for(i=0;i<nums.length-1;i++)
    //     {
    //         j=i+1;
    //         while(nums[j]<=nums[i]+1)
    //         {
    //             j++;
    //         }
    //         if(j-i>max)
    //         max=j;
    //     }



 