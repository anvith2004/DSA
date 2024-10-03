package DSA.Trees_Pattern.Leetcode_Medium;

public class _1_Binary_Search_Tree_to_Greater_Sum_Tree {

    public TreeNode bstToGst(TreeNode root) {
        int[] sum = new int[1];
        reverseInorder(root, sum);
        return root;
    }

    public void reverseInorder(TreeNode root, int[] sum) {
        if (root == null) {
            return;
        }

        reverseInorder(root.right, sum);
        sum[0] = sum[0] + root.val;
        root.val = sum[0];
        reverseInorder(root.left, sum);
    }

    public static void main(String[] args) {

    }
}
