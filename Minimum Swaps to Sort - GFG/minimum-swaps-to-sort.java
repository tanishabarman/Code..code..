//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        
        int ans=0;
        int[] tmp = new int[nums.length];
        for(int i=0;i<nums.length;i++) tmp[i] = nums[i];
        Arrays.sort(tmp);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) map.put(nums[i],i);
        
        for(int i=0;i<nums.length;i++){
            
            
            if(nums[i]!=tmp[i]){
                
                
                int in = map.get(tmp[i]);
                
                int tm = nums[i];
                nums[i] = nums[in];
                nums[in] = tm;
                
                ans++;
                
                map.put(nums[in],in);
                //map.put(nums[i],i);    
            }
        }
        return ans;
        
        
    }
}