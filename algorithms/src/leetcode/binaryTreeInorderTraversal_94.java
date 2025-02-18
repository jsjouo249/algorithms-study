package leetcode;

import java.util.ArrayList;
import java.util.List;

class TreeNode_94 {
    int val;
    TreeNode_94 left;
    TreeNode_94 right;
    TreeNode_94() {}
    TreeNode_94(int val) { this.val = val; }
    TreeNode_94(int val, TreeNode_94 left, TreeNode_94 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class binaryTreeInorderTraversal_94 {
    public static void main(String[] agrs) {
        System.out.println(inorderTraversal(new TreeNode_94(1, null, new TreeNode_94(2, new TreeNode_94(3), null))));
    }

    public static List<Integer> inorderTraversal(TreeNode_94 root) {
        List<Integer> ll = new ArrayList<>();
        inorderTravel(ll, root);
        return ll;
    }

    public static void inorderTravel(List<Integer> ll, TreeNode_94 root) {
        if (root == null) {
            return;
        }

        inorderTravel(ll, root.left);
        ll.add(root.val);
        inorderTravel(ll, root.right);
    }
}
