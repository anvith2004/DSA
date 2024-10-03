package DSA.Trees_Pattern.Leetcode_Easy;

public class _13_Univalued_Binary_Tree {

    public boolean isUnivalTree(TreeNode root) {
        return value(root, root.val);
    }

    public boolean value(TreeNode root, int value) {
        if (root == null) {
            return true;
        }

        if (root.val != value) {
            return false;
        }

        return value(root.left, value) && value(root.right, value);
    }

    public static void main(String[] args) {

    }
}
