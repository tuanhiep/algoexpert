import java.util.HashSet;

public class Problem3_ClosestBST {
    public static int findClosestValueInBst1(BST tree, int target) {

        HashSet<BST> traversed = new HashSet<BST>();
        BST p = tree;

        while (p != null) {
            traversed.add(p);
            if (p.value > target) {
                p = p.left;
            } else {
                p = p.right;
            }
        }

        // check which location
        int min = getDistance(tree.value, target);
        BST lo = tree;
        for (BST b : traversed) {
            int d = getDistance(b.value, target);
            if (d < min) {
                min = d;
                lo = b;
            }

        }
        return lo.value;


    }
    public static int findClosestValueInBst2(BST tree, int target) {
        // Write your code here.
        BST p= tree;
        int min = getDistance(tree.value,target);
        int value = tree.value;
        int d;
        while(p != null){
            d = getDistance(p.value,target);
            if ( d < min) {
                min = d;
                value = p.value;
            }
            if(p.value > target) {
                p = p.left;
            }
            else {
                p = p.right;
            }
        }

        return value;

    }

    public static int getDistance(int value, int target) {
        return Math.abs(value - target);
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

}
