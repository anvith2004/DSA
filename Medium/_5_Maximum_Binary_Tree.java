package DSA.Trees_Pattern.Leetcode_Medium;

public class _5_Maximum_Binary_Tree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null) {
            return null;
        }

        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int indMax = start;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > nums[indMax]) {
                indMax = i;
            }
        }

        TreeNode root = new TreeNode(nums[indMax]);

        root.left = helper(nums, start, indMax - 1);
        root.right = helper(nums, indMax + 1, end);

        return root;
    }

    public static void main(String[] args) {

    }
}
