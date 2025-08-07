class Solution {
    public int change(int amount, int[] coins) {
        Integer[][] dp = new Integer[coins.length][amount];
        return coin(0,coins,amount,0,dp);
    }
    int coin(int i, int[] coins, int amount, int amt, Integer dp[][])
    {
        if(amt>=amount || i>=coins.length)
        {
            if(amt==amount)
            return 1;
            return 0;
        }
        if(dp[i][amt]!=null)
        return dp[i][amt];
        amt+=coins[i];
        int take=coin(i,coins,amount,amt,dp);
        amt-=coins[i];
        int not=coin(i+1,coins,amount,amt,dp);
        return dp[i][amt]=not+take;
    }
}