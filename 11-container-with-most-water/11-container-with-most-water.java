class Solution {
    public int maxArea(int[] height) {
         int s = 0;
        int e = height.length-1;
        int max = Integer.MIN_VALUE;
        int curr = 1;
        while(s < e) {
            curr = Math.min(height[s], height[e]) * (e-s); //current maximum 
            if(max < curr) 
                max = curr;
            
            if(height[s] <= height[e]) s++;
            else e--;
        }
        return max;
    }
}