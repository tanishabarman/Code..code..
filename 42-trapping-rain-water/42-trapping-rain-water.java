class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int leftmax=0,rightmax=0;
        int ans=0;
        while(l<r)
        {
            if(height[l]<=height[r])
            {
                if(leftmax<height[l]) leftmax=height[l];
                else ans+=leftmax-height[l];
                l++;
            }
            else
            {
                if(rightmax<height[r]) rightmax=height[r];
                else ans+=rightmax-height[r];
                
                r--;
            }
        }
        return ans;
    }
}