package DSA.Trees_Pattern.Leetcode_Easy;

public class _3_Root_Equals_Sum_of_Children {

    public boolean checkTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left != null && root.right != null) {
            int sum = root.left.val + root.right.val;
            if (sum == root.val) {
                return true;
            } else {
                return false;
            }
        }

        if (root.left != null) {
            if (root.left.val == root.val) {
                return true;
            }
        }

        if (root.right != null) {
            if (root.right.val == root.val) {
                return true;
            }
        }

        return checkTree(root.left) && checkTree(root.right);
    }

    public static void main(String[] args) {

    }
}
