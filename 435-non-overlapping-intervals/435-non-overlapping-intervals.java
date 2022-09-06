class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(x,y)->x[0]-y[0]);
        // 1 2,1 3, 2 3 , 3 4
        int count=0;
        int l=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<l)
            {
                count++;
                l=Math.min(l,intervals[i][1]);
            }
            else
            {
                l=intervals[i][1];
            }

        }
        return count;
    }
}