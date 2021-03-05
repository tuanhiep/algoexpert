import java.util.Arrays;

class Problem9_SortedSquaredArray {

    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i] * array[i];
        }

        Arrays.sort(tmp);
        return tmp;
    }
}

