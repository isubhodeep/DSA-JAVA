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
    HashMap <Integer,Integer>map;
    int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        map.put(inorder[i],i);
        index=postorder.length-1;
        return build(postorder,postorder.length-1,0);

    }
    public TreeNode build(int postorder[],int start,int end){
        if(start<end)
        return null;
        int rootval=postorder[index--];
        TreeNode root=new TreeNode(rootval);
        int mid=map.get(rootval);
        root.right=build(postorder,start,mid+1);
        root.left=build(postorder,mid-1,end);
        return root;
    }
}