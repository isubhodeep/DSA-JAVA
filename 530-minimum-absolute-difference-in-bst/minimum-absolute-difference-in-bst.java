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
    public int getMinimumDifference(TreeNode root) {
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
        int min=Integer.MAX_VALUE;
        Collections.sort(l);
        for(int i=0;i<l.size()-1;i++){
            if(Math.abs(l.get(i)-l.get(i+1))<min)
            min=Math.abs(l.get(i)-l.get(i+1));
        }
        return min;
        
    }
}