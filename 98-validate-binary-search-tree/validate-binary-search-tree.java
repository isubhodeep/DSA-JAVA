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
    List<Integer>l=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
       inorder(root);
       for(int i=0;i<l.size()-1;i++){
        if(l.get(i)>=l.get(i+1))
        return false;
       }
       return true;
        
    }
    public TreeNode inorder(TreeNode root){
        if(root==null)
        return null;
        TreeNode left=inorder(root.left);
        l.add(root.val);
        TreeNode right=inorder(root.right);
        return root;
    }
}






















//  if (root==null)
//         return false;
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.offer(root);
//         while(!queue.isEmpty())
//         {
//             int level = queue.size();
//             for(int i=0;i<level;i++)
//             {
//                 TreeNode c = queue.poll();
//                 if(c.left!=null && c.val<=c.left.val)
//                 return false;
//                 if(c.right!=null && c.val>=c.right.val)
//                 return false;
//                 if(c.left!=null)
//                 queue.offer(c.left);
//                 if(c.right!=null)
//                 queue.offer(c.right);
//             }
//         }
//         return true;