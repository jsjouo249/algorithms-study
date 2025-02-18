package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class TreeNode_100 {
    int val;
    TreeNode_100 left;
    TreeNode_100 right;
    TreeNode_100() {}
    TreeNode_100(int val) { this.val = val; }
    TreeNode_100(int val, TreeNode_100 left, TreeNode_100 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class sameTree_100 {
    public static void main(String[] agrs) {
        System.out.println(isSameTree(new TreeNode_100(1, new TreeNode_100(2), new TreeNode_100(3)), new TreeNode_100(1, new TreeNode_100(2), null)));
    }

    public static boolean isSameTree(TreeNode_100 p, TreeNode_100 q) {
        return isSame(p, q);
    }

    public static boolean isSame(TreeNode_100 pRoot, TreeNode_100 qRoot) {
        if (pRoot == null && qRoot == null) return true;
        else if (pRoot == null || qRoot == null) return false;

        if (pRoot.val == qRoot.val) {
            return isSame(pRoot.left, qRoot.left) && isSame(pRoot.right, qRoot.right);
        } else {
            return false;
        }
    }
}
