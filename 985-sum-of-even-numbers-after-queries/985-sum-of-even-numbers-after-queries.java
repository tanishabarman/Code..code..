class Solution {
    public int[] sumEvenAfterQueries(int[] N, int[][] Q) {
        int j=0;
        int sum=0;
        int[] ans = new int[N.length];        
        for(int t:N) if(t%2==0) sum+=t;
        for(int[] i: Q){
            if(N[i[1]]%2==0){
                int tmp = N[i[1]];
                sum-=tmp;
                N[i[1]]+=i[0];
                if(N[i[1]]%2==0) sum+=N[i[1]];   
            }else{
                N[i[1]]+=i[0];
                if(N[i[1]]%2==0) sum+=N[i[1]];
            }
            ans[j]=sum;
            j++;
        }
        return ans;
        
    }
}