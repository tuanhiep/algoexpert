import java.util.*;

class Program {
    public static int[] twoNumberSum1(int[] array, int targetSum) {
        // Write your code here.
        int[] result = new int[2];
        for (int i : array) {
            for (int j : array) {

                if (i != j && i + j == targetSum) {

                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }

        }
        return new int[0];
    }

    public static int[] twoNumberSum2(int[] array, int targetSum) {
        // Write your code here.
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] + array[j] == targetSum) {

                    result[0] = array[i];
                    result[1] = array[j];
                    return result;
                }
            }

        }
        return new int[0];
    }
}

