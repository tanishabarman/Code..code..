class Solution {
    Integer[] dp;
    public int deleteString(String s) {
        dp = new Integer[s.length()];
        return helper(s , 0);
        
    }
    
    public int helper(String s , int index){
        if(index == s.length()) return 0;
        if(dp[index] != null) return dp[index];
        
        int res = 0;
        boolean found = false;
        for(int i = index; i < index + (s.length() - index)/2 ; i++){
            if(dp[i] == null){
                String a = s.substring(index , i + 1);
                String b = s.substring(i + 1 , i + 1 + (i - index + 1));
                if(a.equals(b)){
                    found = true;
                    res = Math.max(res , 1 + helper(s , i + 1));
                }
            }
        }
        if(!found)
            return dp[index] = 1;
        return dp[index] = res;
    }
}