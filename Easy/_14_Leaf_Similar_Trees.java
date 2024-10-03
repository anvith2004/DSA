package DSA.Trees_Pattern.Leetcode_Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class _14_Leaf_Similar_Trees {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        add(root1, first);
        add(root2, second);
//        HashSet<Integer> hashSet = new HashSet<>(first);
//        HashSet<Integer> hashSet1 = new HashSet<>(second);

//        if (hashSet.equals(hashSet1)) {
//            return true;
//        }

        if (first.equals(second)) {
            return true;
        }
        return false;
    }

    public void add(TreeNode root, ArrayList<Integer> arrayList) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            arrayList.add(root.val);
        }

        add(root.left, arrayList);
        add(root.right, arrayList);
    }

    public static void main(String[] args) {

    }
}
