package DSA.Trees_Pattern.Leetcode_Easy;

import java.util.ArrayList;

public class _12_Sum_of_Root_To_Leaf_Binary_Numbers {

    public int sumRootToLeaf(TreeNode root) {
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        findPath(root, new ArrayList<>(), paths);

        int totalSum = 0;

        for (ArrayList<Integer> path : paths) {
            int binary = 0;

            // Convert the path to a binary number
            for (int num : path) {
                binary = binary * 2 + num;  // Construct the binary number
            }

            // Add the binary number (already in decimal form) to total sum
            totalSum += binary;
        }

        return totalSum;
    }

    public void findPath(TreeNode root, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> allPaths) {
        if (root == null) {
            return;
        }

        current.add(root.val);

        if (root.left == null && root.right == null) {
            allPaths.add(new ArrayList<>(current));
        }

        findPath(root.left, current, allPaths);
        findPath(root.right, current, allPaths);

        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {

    }
}
