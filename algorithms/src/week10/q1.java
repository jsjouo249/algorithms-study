package week10;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
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

class BSTIterator {
    Queue<Integer> tree = new LinkedList<>();

    public BSTIterator(TreeNode root) {
        travel(root);
    }

    private void travel(TreeNode root) {
        if ( null == root ) {
            return;
        }

        // System.out.println("ROOT " + root.val);
        // if(root.left != null) System.out.println("RLEFT " + root.left.val);
        // if(root.right != null) System.out.println("RRIGHT " + root.right.val);

        travel(root.left);
        tree.add(root.val);
        travel(root.right);
    }

    //In-order는 왼쪽부터
    public int next() {
        return tree.remove();
    }

    public boolean hasNext() {
        return !tree.isEmpty();
    }
}
