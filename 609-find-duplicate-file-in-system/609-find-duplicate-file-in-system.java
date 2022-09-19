class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<paths.length;i++)
        {
            int sp = paths[i].indexOf(' ');
            String s1=paths[i].substring(0,paths[i].indexOf(' '));
            int op = paths[i].indexOf('(');
            int clo = paths[i].indexOf(')');
            while(clo!=-1 && op!=-1 && clo<paths[i].length()){       
                String s2=paths[i].substring(op+1,clo);
                if(map.containsKey(s2))
                {
                    List<String> temp=map.get(s2);
                    String tmp = s1 + "/"+paths[i].substring(sp+1,op);
                    temp.add(tmp);
                    map.put(s2,temp);
                }else
                {    
                    List<String> temp=new ArrayList<>();
                    String tmp = s1 + "/"+paths[i].substring(sp+1,op);
                    temp.add(tmp);
                    map.put(s2,temp);
                }    
                sp = paths[i].indexOf(' ',sp+1);
                op = paths[i].indexOf('(',op+1);
                clo = paths[i].indexOf(')',clo+1);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            if(entry.getValue().size()!=1)    
                ans.add(entry.getValue());        
        }
        return ans;
    }
}