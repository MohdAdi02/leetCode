import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return root;
        }
        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!= null){
                queue.add(current.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {

    }
}



