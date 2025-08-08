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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res =new ArrayList<>();
        if(root==null)
        return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int level=queue.size();
            for(int i=0;i<level;i++)
            {
                TreeNode c=queue.poll();
                if(i==level-1)
                res.add(c.val);
                if(c.left!=null)
                queue.offer(c.left);
                if(c.right!=null)
                queue.offer(c.right);
            }
        }
        return res;

    }
}