import java.util.*;

class Program {
    public static int[] twoNumberSum1(int[] array, int targetSum) {
        // Write your code here.
        for (int i : array) {
            for (int j : array) {
                if (i != j && i + j == targetSum) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSum2(int[] array, int targetSum) {
        // Write your code here.
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSum3(int[] array, int targetSum) {
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap();
        for (int i : array) {
            map.put(i, targetSum - i);
            if (targetSum - i != i && map.containsKey(targetSum - i)) {
                return new int[]{i, targetSum - i};
            }
        }
        return new int[0];
    }
}
