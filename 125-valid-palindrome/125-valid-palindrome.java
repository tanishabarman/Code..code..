class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1) return true;
        String ss="";
       s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))
            {
                //System.out.print(s.charAt(i));
            ss+=s.charAt(i);
            }
        }
       // System.out.println(ss);
        int l=0;
        int r=ss.length()-1;
        while(l<r)
        {
            if(ss.charAt(l)==ss.charAt(r))
            {
                l++;
                r--;
                continue;
            }
            else return false;
        }
        return true;
    }
}