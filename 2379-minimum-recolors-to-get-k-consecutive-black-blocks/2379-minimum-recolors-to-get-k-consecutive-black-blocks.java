class Solution {
    public int minimumRecolors(String blocks, int k) {
        int s=0;
        int n=blocks.length();
        int res=Integer.MAX_VALUE;
        while(s<=(n-k))
        {
            int e=s;
            int ans=0;
           while(e<(s+k))
            {
                if(blocks.charAt(e)=='W') ans++;
               e++;
            }
            res=Math.min(ans,res);
            s++;
        }
        return res;
        
    }
}