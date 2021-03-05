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

    public int[] optimizedSortedSquaredArray(int[] array) {
        // Write your code here.
        int small = 0;
        int large = array.length - 1;
        int[] result = new int[array.length];
        int index = array.length - 1;
        while (small < large) {
            int s_small = array[small] * array[small];
            int s_large = array[large] * array[large];
            if (s_small < s_large) {
                result[index] = s_large;
                large--;
            } else {
                result[index] = s_small;
                small++;
            }
            index--;
        }
        result[index] = array[large] * array[large];

        return result;
    }
}

