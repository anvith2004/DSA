package DSA.Trees_Pattern.Leetcode_Easy;

public class _30_Minimum_Depth_of_Binary_Tree {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // If one of the subtrees is empty, we return the depth of the non-empty subtree
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }

        // If both subtrees are non-empty, return the minimum depth of both sides + 1 (for the current node)
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static void main(String[] args) {

    }
}
