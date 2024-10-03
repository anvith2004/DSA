package DSA.Trees_Pattern.Leetcode_Easy;

import java.util.ArrayList;
import java.util.List;

public class _16_Binary_Tree_Paths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            allPath(root, "", result);
        }
        return result;
    }

    public void allPath(TreeNode root, String path, List<String> strings) {
        if (root == null) {
            return;
        }

        path = path + Integer.toString(root.val);

        if (root.left == null && root.right == null) {
            strings.add(path);
        } else {
            path = path + "->";
            allPath(root.left, path, strings);
            allPath(root.right, path, strings);
        }
    }

    public static void main(String[] args) {

    }
}
