package DSA.Trees_Pattern.Leetcode_Easy;

public class _26_Balanced_Binary_Tree {

    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        // If any subtree is unbalanced, propagate -1 upwards to indicate imbalance
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1; // Return -1 to indicate that the subtree is not balanced
        }

        return 1 + Math.max(left, right); // Otherwise, return the height of the current node
    }

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1; // If height returns -1, the tree is unbalanced
    }

    public static void main(String[] args) {

    }
}
