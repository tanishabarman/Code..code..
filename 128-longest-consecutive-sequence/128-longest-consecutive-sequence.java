class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
       Set<Integer> list=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
        int i=0;
        int count=0;
        int ans=0;
       for(int s:list)
       {
           if(!list.contains(s-1))
           {
               count++;
               int t=s+1;
               while(list.contains(t))
               {
                   count++;
                   t+=1;
               }
               ans=Math.max(ans,count);
               count=0;
           }
           
           
       }
        return ans;
    }
}