class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            String a=strs[i];
            char[] b=a.toCharArray();
            Arrays.sort(b);
            a=new String(b);
            if(!map.containsKey(a))
            {
                map.put(a,new ArrayList<>());
            }
            map.get(a).add(strs[i]);
        }
        
        return new ArrayList<>(map.values());
            
    }
}