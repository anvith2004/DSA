package DSA.Trees_Pattern.Leetcode_Easy;

public class _10_Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int depth = Math.max(left, right) + 1;

        return depth;
    }

    public static void main(String[] args) {

    }
}
