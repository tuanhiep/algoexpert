import java.util.ArrayList;
import java.util.List;

public class Problem5_NodeDepth {
    public static int total;

    public static int nodeDepths1(BinaryTree root) {
        //Time O(n). Space O(h) with h is the height of tree.
        total = 0;
        return sumDepth1(root, 0);

    }

    public static int sumDepth1(BinaryTree root, int runningDepth) {

        total += runningDepth;

        if (root.left != null) {
            sumDepth1(root.left, runningDepth + 1);
        }
        if (root.right != null) {
            sumDepth1(root.right, runningDepth + 1);
        }
        return total;

    }

    public static int nodeDepths2(BinaryTree root) {
        // Time O(n). Space O(h) with h is the height of tree.
        return nodeDepthHelper(root, 0);

    }

    public static int nodeDepthHelper(BinaryTree root, int depth) {
        if (root == null) return 0;
        return depth + nodeDepthHelper(root.left, depth + 1) + nodeDepthHelper(root.right, depth + 1);
    }

    public static int nodeDepths3(BinaryTree root) {
        // Time O(n). Space O(h) with h is the height of tree
        List<Level> stack = new ArrayList<Level>();
        stack.add(new Level(root, 0));
        int total = 0;
        while (!stack.isEmpty()) {
            Level top = stack.remove(stack.size() - 1);
            total += top.depth;
            if (top.root.left != null) stack.add(new Level(top.root.left, top.depth + 1));
            if (top.root.right != null) stack.add(new Level(top.root.right, top.depth + 1));
        }
        return total;
    }

    static class Level {
        public BinaryTree root;
        int depth;

        public Level(BinaryTree root, int depth) {
            this.root = root;
            this.depth = depth;
        }

    }


    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
