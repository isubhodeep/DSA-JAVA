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
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for(int j=0;j<inorder.length;j++){
            map.put(inorder[j],j);
        }
        return build(preorder,0,preorder.length-1);
        
    }
    public TreeNode build(int preorder[],int start,int end){
        if(start>end)
        return null;
        int rootval=preorder[index++];
        TreeNode root=new TreeNode(rootval);
        int mid=map.get(rootval);
        root.left=build(preorder,start,mid-1);
        root.right=build(preorder,mid+1,end);
        return root;
    }
}