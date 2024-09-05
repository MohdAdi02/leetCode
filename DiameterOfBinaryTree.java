

/*
public class DiameterOfBinaryTree {
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    int height(BalancedBinaryTree.TreeNode node){

        if(node ==  null){
            return 0;
        }
        int l_height = height(node.left);//2
        int r_height = height(node.right);//1
        int nodeDiameter = (l_height + r_height);
        diameter = Math.max(diameter,nodeDiameter);

        return Math.max(l_height, r_height)+1;
    }
}
*/

