class Solution {
    public String breakPalindrome(String palindrome) {
        
        String ans="";
        int flag=0;
       for(int i=0;i<palindrome.length()/2;i++)
       {
           if(palindrome.charAt(i)!='a')
           {
               flag=1;
               if(i==0)
               {
                   ans="a"+palindrome.substring(i+1);
                   break;
                   
               }else
               {
                   //System.out.println(palindrome.substring(0,i));
                   ans=palindrome.substring(0,i)+"a"+palindrome.substring(i+1);
                   break;
               }
              
           }
           
           
       }
        if(flag==0 && palindrome.length()!=1)
        {
            ans=palindrome.substring(0,palindrome.length()-1)+"b";
        }
        return ans;
    }
}