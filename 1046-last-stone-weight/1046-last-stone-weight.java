class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<stones.length;i++)
        {
            list.add(stones[i]);
        }
        while(list.size()>1)
        {
            Collections.sort(list);
            
            if(list.get(list.size()-1)==list.get(list.size()-2)) list.remove(list.size()-1);
            else list.set(list.size()-2,list.get(list.size()-1)-list.get(list.size()-2));
            list.remove(list.size()-1);
        }
        return list.size()==1?list.get(0):0;
    }
}