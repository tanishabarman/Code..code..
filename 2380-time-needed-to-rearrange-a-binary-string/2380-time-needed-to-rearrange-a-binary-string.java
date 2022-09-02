class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int ans=0;
        while(s.indexOf("01")!=-1)
        {
            String t=s.replaceAll("01","10");
            if(t.equals(s)) break;
            ans++;
            s=t;
        }
        return ans;
    }
}