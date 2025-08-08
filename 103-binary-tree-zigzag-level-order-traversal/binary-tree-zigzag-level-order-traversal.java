/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zz = new ArrayList<>();
        if(root==null)
        return zz;
        int c=0;
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int level=queue.size();
            c++;
            List<Integer> z = new ArrayList<>();
                for(int i=0;i<level;i++)
                {
                    TreeNode q = queue.poll();
                    
                    if(c%2!=0)
                    z.addLast(q.val);
                    else
                    z.addFirst(q.val);
                    if(q.left!=null)
                    queue.offer(q.left);
                    if(q.right!=null)
                    queue.offer(q.right);
            }
            zz.add(z);
        } 
        return zz;
    }
}