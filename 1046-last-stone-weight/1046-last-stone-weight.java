class Solution {
    public int lastStoneWeight(int[] stones) {
        /*List<Integer> list=new ArrayList<>();
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
        return list.size()==1?list.get(0):0;*/
        Queue<Integer> q=new PriorityQueue<>((a,b)->b-a);
        for(int i:stones)
        {
            q.add(i);
        }
        while(q.size()>1)
        {
            int a=q.peek();
            q.poll();
            int b=q.peek();
            q.poll();
            if(a==b) continue;
            else
            {
                q.add(a-b);
            }
        }
     if(!q.isEmpty()) return q.poll();
        else return 0;
    }
}