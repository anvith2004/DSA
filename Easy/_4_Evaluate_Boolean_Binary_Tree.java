package DSA.Trees_Pattern.Leetcode_Easy;

public class _4_Evaluate_Boolean_Binary_Tree {

    public boolean evaluateTree(TreeNode root) {

        if (root.val == 0) {
            return false;
        }

        if (root.val == 1) {
            return true;
        }

        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);

        if (root.val == 2) {
            return left || right;
        }

        if (root.val == 3) {
            return left && right;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
