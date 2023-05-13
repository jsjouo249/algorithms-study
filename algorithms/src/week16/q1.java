package week16;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class q1 {
    public static void main(String[] agrs) {
        TreeNode root11 = new TreeNode(5, null, null);
        TreeNode root10 = new TreeNode(1, null, null);
        TreeNode root9 = new TreeNode(4, null, null);
        TreeNode root8 = new TreeNode(1, null, null);
        TreeNode root7 = new TreeNode(3, null, root11);
        TreeNode root6 = new TreeNode(1, null,null );
        TreeNode root5 = new TreeNode(7, root9, root10);
        TreeNode root4 = new TreeNode(2, null, root8);
        TreeNode root3 = new TreeNode(8, root6, root7);
        TreeNode root2 = new TreeNode(7, root4, root5);
        TreeNode root = new TreeNode(6, root2, root3);
        deepestLeavesSum(root);
    }

    public static int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> tree = new LinkedList<>();
        tree.add(root);

        int sum = 0;

        while (!tree.isEmpty()) {
            sum = 0;
            int depthSize = tree.size();
            for (int i = 0; i < depthSize; ++i) {
                TreeNode leaf = tree.poll();
                if (leaf != null) {
                    sum += leaf.val;
                    if (leaf.left != null ) tree.add(leaf.left);
                    if (leaf.right != null) tree.add(leaf.right);
                }
            }
            System.out.println(sum);
        }

        return sum;
    }
}
