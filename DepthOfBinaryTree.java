public class DepthOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
         TreeNode(int val) {
            this.val = val;
         }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {


        if(root == null){
            return 0;
        }
        int l_depth;
        int r_depth;
        l_depth = maxDepth(root.left);
        r_depth = maxDepth(root.right);

        return Math.max(l_depth,r_depth)+1;


    }
}
