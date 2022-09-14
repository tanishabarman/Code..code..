class Solution {
   /* public String binary(int dec)
    {
  // int dec=1;
      String result= "00000000";
            int i=result.length()-1;
            while(dec!=0)
            {
              char a[]=result.toCharArray();
              a[i--]= String.valueOf(dec%2).charAt(0);
              result=new String(a);
              dec=dec/2;  

            }
        //System.out.println(result);
            return result;
    }*/
    public boolean validUtf8(int[] data) {
       /* String[] s=new String[data.length];
        int res=0;
        if(data.length==1 && binary(data[0]).charAt(0)!='0') return false;
        for(int i=0;i<data.length;i++)
        {
            String a=binary(data[i]);
            s[i]=a;
            int count=0;
            if(res>0)
            {
                String ss=s[i].substring(0,2);
                //System.out.println(ss);
                if(ss.equals("10")) 
                {
                    res--;
                    continue;
                }
                else return false;
            }
           // System.out.println(a);
            else
            {
               
            for(int j=0;j<8;j++)
            {
                if(a.charAt(j)=='1') count++;
                else if(a.charAt(j)=='0') break;
            }
            //System.out.println(count);
                if(count>4) return false;
            res=count-1;
            if(res!=-1 && i==data.length-1) return false;
            }
        }
        if(res>0) return false;*/
              int count = 0;
        for (int value : data) {
            if (count == 0) {
                if (value >> 3 == 0b11110) {
                    count = 3;
                } else if (value >> 4 == 0b1110) {
                    count = 2;
                } else if (value >> 5 == 0b110) {
                    count = 1;
                } else if (value >> 7 == 0b0) {
                    count = 0;
                } else {
                    return false;
                }
            } else {
                if (value >> 6 == 0b10) {
                    count--;
                } else {
                    return false;
                }
            }
        }
        return count == 0;
    }
}