package DSA.Trees_Pattern.Leetcode_Easy;

public class _18_Binary_Tree_Tilt {

    public int findTilt(TreeNode root) {
        int[] totalTilt = new int[1];  // Store the total tilt here
        sum(root, totalTilt);  // Helper function to calculate tilt and sum of nodes
        return totalTilt[0];  // Return the total tilt
    }

    public int sum(TreeNode root, int[] totalTilt) {
        if (root == null) {
            return 0;
        }

        // Recursively calculate the sum of left and right subtrees
        int leftSum = sum(root.left, totalTilt);
        int rightSum = sum(root.right, totalTilt);

        // The tilt for the current node
        int tilt = Math.abs(leftSum - rightSum);

        // Add this tilt to the total tilt
        totalTilt[0] += tilt;

        // Return the sum of values for this subtree (including the current node's value)
        return root.val + leftSum + rightSum;
    }

    public static void main(String[] args) {

    }
}
