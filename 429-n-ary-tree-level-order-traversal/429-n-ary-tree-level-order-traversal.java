/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
       
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int a=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<a;i++)
            {
                l.add(q.peek().val);
                for(Node n:q.peek().children)
                {
                    q.add(n);
                }
                q.poll();
            }
            
            
        
        ans.add(new ArrayList<>(l));
        }
        return ans;
        
    }
}