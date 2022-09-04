class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                char a=board[i][j];
                if(a=='.') continue;
                boolean r=checkRow(a,i,j,board,m);
                boolean c=checkCol(a,i,j,board,n);
                boolean b=checkBox(a,i,j,board,n,m);
                if(r==false || c==false || b==false) return false;
            }
        }
        return true;
    }
    
    public boolean checkRow(int a,int p,int q,char[][] board,int m)
    {
        
        for(int i=0;i<m;i++)
        {
            if(i==q) continue;
            if(board[p][i]==a) return false;
        }
        return true;
    }
    public boolean checkCol(int a,int p,int q,char[][] board,int n)
    {
        
        for(int i=0;i<n;i++)
        {
            if(i==p) continue;
            if(board[i][q]==a) return false;
        }
        return true;
    }
    public boolean checkBox(int a,int p,int q,char[][] board,int n,int m)
    {
        int t1=p/3;
       int t2=q/3;
        for(int i=(3*t1);i<(3*t1+3);i++)
        {
            for(int j=(3*t2);j<(3*t2+3);j++)
            {
                if(i==p && j==q) continue;
                if(board[i][j]==a) return false;
            }
        }
        return true;
    }
}