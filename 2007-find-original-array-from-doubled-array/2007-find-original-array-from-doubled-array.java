import java.util.*;
class Solution {
    public int[] findOriginalArray(int[] changed) {
      if(changed.length%2==1)  return new int[0];
        int[] ans=new int[changed.length/2];
        Arrays.sort(changed);
        Queue<Integer> list=new LinkedList<>();
        int i=0;
        for(int num:changed)
        {
            if(!list.isEmpty() && list.peek()==num) ans[i++]=list.poll()/2;
            else list.add(num*2);
        }
        if(list.size()>0) return new int[0];
        else return ans;
      /*  if(changed.length%2==1)  return new int[0];
        
        List<Integer> list=new ArrayList<>();
        //int[] ans=new int[changed.length/2];
        Arrays.sort(changed);
        int n=changed.length;
        int k=0;
        for(int i=0;i<n;i++)
        {
            
            int j=i+1;
            while(changed[j]<=(changed[i]*2))
            {
                if(changed[j]==changed[i]*2) list.add(changed[i]);
            }
        }
        if(list.size()!=(n/2)) return new int[0];
        else 
        {
             int[] ans = new int[list.size()];
             for(int i=0;i<list.size();i++) ans[i]=list.get(i);
            return ans;
        }*/
        
    }
}