import java.util.ArrayList;
import java.util.List;

public class Problem4_BranchSum {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums1(BinaryTree root) {
        // Write your code here.
        List<Integer> result = new ArrayList<Integer>();
        if (root.left == null && root.right == null) {
            result.add(root.value);
        }

        if (root.left != null) {
            List<Integer> left = addToList(root.value, branchSums1(root.left));
            result.addAll(left);
        }
        if (root.right != null) {
            List<Integer> right = addToList(root.value, branchSums1(root.right));
            result.addAll(right);
        }

        return result;
    }

    public static List<Integer> addToList(int num, List<Integer> list) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i : list) {
            result.add(i + num);
        }
        return result;
    }

    public static List<Integer> branchSums2(BinaryTree root) {
        // Write your code here.

        return sumDown(root, 0, new ArrayList<Integer>());
    }

    public static List<Integer> sumDown(BinaryTree root, int total, List<Integer> list) {

        if (root.left == null && root.right == null) {
            list.add(root.value + total);
        }

        if (root.left != null) {
            sumDown(root.left, total + root.value, list);
        }

        if (root.right != null) {
            sumDown(root.right, total + root.value, list);
        }

        return list;
    }


}
