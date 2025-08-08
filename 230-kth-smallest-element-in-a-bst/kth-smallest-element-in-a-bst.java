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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
        return 0;
        Queue <TreeNode>queue=new LinkedList<>();
        queue.add(root);
        List <Integer>l=new ArrayList<>();
        while(!queue.isEmpty()){
            int level=queue.size();
            for(int i=0;i<level;i++){
                TreeNode c=queue.poll();
                l.add(c.val);
                if(c.left!=null)
                queue.offer(c.left);
                if(c.right!=null)
                queue.offer(c.right);
            }

        }
        Collections.sort(l);
        return l.get(k-1);
    }
}