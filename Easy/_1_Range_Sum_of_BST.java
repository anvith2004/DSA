package DSA.Trees_Pattern.Leetcode_Easy;

public class _1_Range_Sum_of_BST {

    static int sum ;

    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        helper(root, low, high);
        return sum;
    }

    public void helper(TreeNode root, int low, int high) {
        if (root == null) {
            return ;
        }

        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }

        helper(root.left, low, high);
        helper(root.right, low, high);
    }

    public static void main(String[] args) {

    }
}
