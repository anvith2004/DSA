package DSA.Trees_Pattern.Leetcode_Medium;

public class _2_Count_Nodes_Equal_to_Average_of_Subtree {

    public int averageOfSubtree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] count = new int[1];

        help(root, count);

        return count[0];
    }

    public int[] help(TreeNode root, int[] count) {
        if (root == null) {
            return new int[]{0, 0};
        }

        int[] left = help(root.left, count);
        int[] right = help(root.right, count);

        int subTreeSum = left[0] + right[0] + root.val;
        int noOfSubTreeNodes = left[1] + right[1] + 1;

        int average = subTreeSum/noOfSubTreeNodes;

        if (root.val == average) {
            count[0] = count[0] + 1;
        }

        return new int[]{subTreeSum, noOfSubTreeNodes};
    }

    public static void main(String[] args) {

    }
}
