class Solution {
    public String removeStars(String s) {
         int j = 0;
        char[] ch = new char[s.length()];
     
        for (int i = 0; i < s.length(); i++) {
             if(s.charAt(i)=='*'){
                 j--;
             }
             else ch[j++] = s.charAt(i);
        }
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i <j; i++) {
          
           str.append(ch[i]);
        }
        return str.toString();
    }
}