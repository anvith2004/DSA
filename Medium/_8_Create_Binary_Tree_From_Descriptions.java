package DSA.Trees_Pattern.Leetcode_Medium;

import java.util.HashMap;
import java.util.Map;

public class _8_Create_Binary_Tree_From_Descriptions {

    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> nodeMap = new HashMap<>();
        Map<Integer, Boolean> hasParent = new HashMap<>();

        for (int[] description : descriptions) {
            int parentVal = description[0];
            int childVal = description[1];
            Boolean isLeft = description[2] == 1;

            TreeNode parent;
            if (nodeMap.containsKey(parentVal)) {
                parent = nodeMap.get(parentVal);
            } else {
                parent = new TreeNode(parentVal);
                nodeMap.put(parentVal, parent);
            }

            TreeNode child;
            if (nodeMap.containsKey(childVal)) {
                child = nodeMap.get(childVal);
            } else {
                child = new TreeNode(childVal);
                nodeMap.put(childVal, child);
            }

            if (isLeft) {
                parent.left = child;
            } else {
                parent.right = child;
            }

            hasParent.put(childVal, true);
            hasParent.putIfAbsent(parentVal, false);
        }

        // Step 2: Find the root (the node that has no parent)
        for (int key : nodeMap.keySet()) {
            if (!hasParent.get(key)) {
                return nodeMap.get(key);  // Return the root node
            }
        }


        return null;
    }

    public static void main(String[] args) {

    }
}
