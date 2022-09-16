class Solution {
    public int sum=0;
    public int maximumScore(int[] nums, int[] multipliers) {
        int n=multipliers.length;
        int m=multipliers.length;
        Integer[][] dp=new Integer[m][m];
        //for(int[] row:dp) Arrays.fill(row,-1);
        int ans=helper(0,0,nums,multipliers,dp);
        return ans;
    }
    public int helper(int l,int i,int[] nums,int[] multipliers,Integer[][] dp)
    {
        int r=(nums.length)-1-(i-l);
        if(i==multipliers.length) return 0;
        if(dp[l][i]!=null) return dp[l][i];
        sum=Math.max((nums[l]*multipliers[i]+helper(l+1,i+1,nums,multipliers,dp)),(nums[r]*multipliers[i]+helper(l,i+1,nums,multipliers,dp)));
        return dp[l][i]=sum;
    }
}