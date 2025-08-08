class Solution {
    public int climbStairs(int n) {
        // int dp[]=new int[n+1];
        // Arrays.fill(dp,0);
        if(n==1)
        return 1;
        if(n==2)
        return 2;
        int a=1;
        int b=2;
        // dp[3]=3;
        int i,num=0;
        for(i=3;i<=n;i++){
            num=a+b;
            a=b;
            b=num;
        }
        return num;
    }
}
// 4:
// 1. 1 step + 1 step + 1 step +1 step
// 2. 1 step + 2 steps +1step
// 3. 2 steps + 1 step +1 step
// 4. 1 + 1+ 2
// 5. 2+2