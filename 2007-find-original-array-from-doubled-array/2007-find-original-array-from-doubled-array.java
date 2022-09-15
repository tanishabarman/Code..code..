class Solution {
    public int[] findOriginalArray(int[] changed) {
      if(changed.length%2==1)  return new int[0];
        int[] temp=new int[changed.length/2];
        Arrays.sort(changed);
        Queue<Integer> list=new LinkedList<>();
        int i=0;
        for(int num:changed)
        {
            if(!list.isEmpty() && list.peek()==num) temp[i++]=list.poll()/2;
            else list.add(num*2);
        }
        if(list.size()>0) return new int[0];
        else return temp;
    }
}