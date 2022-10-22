class Solution {
    public String minWindow(String s, String t) {
        int l=0;
        int r=0;
        String ans=null;
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int count=0;
        for(;r<s.length();r++)
        {
            if(map.containsKey(s.charAt(r)))
            {
                map.put(s.charAt(r),map.get(s.charAt(r))-1);
                if(map.get(s.charAt(r))==0) count++;

            }
            
            while(count==map.size())
            {
                if(ans==null || (r-l+1)<ans.length())
                {
                    ans=s.substring(l,r+1);
                }
               // System.out.println(map.get(s.charAt(l)) + " " +ans);
                if(map.containsKey(s.charAt(l)))
                {
                    map.put(s.charAt(l),map.get(s.charAt(l))+1);
                            if(map.get(s.charAt(l))==1) count--;
                   // System.out.println(map.get(s.charAt(l)));
                }
                            l++;
               // System.out.println(count);
            }
           // System.out.println(s.substring(l,r+1));
        }
        return ans==null?"":ans;
        
    }
}