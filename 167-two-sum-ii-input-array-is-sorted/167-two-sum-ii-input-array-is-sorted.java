class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[2];
        int i=0;
        int n=numbers.length;
        int j=n-1;
        while(i<j)
        {
            int a=numbers[i]+numbers[j];
            if(a>target) j--;
            else if(a<target) i++;
            else 
            {
                arr[0]=i+1;
                arr[1]=j+1;
                break;
            }
        }
        return arr;
    }
}