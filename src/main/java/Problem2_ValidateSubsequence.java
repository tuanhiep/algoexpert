import java.util.List;

class Problem2_ValidateSubsequence {
    public static void main(String[] args) {

    }

    public static boolean isValidSubsequence1(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        boolean found = false;
        int index = 0;
        for (int i = 0; i < sequence.size(); i++) {
            found = false;

            while (index < array.size() && found == false) {
                if (array.get(index) == sequence.get(i)) {
                    found = true;
                }
                index++;
            }
            if (!found) return false;

        }
        return found;
    }

    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int index = 0;
        for (int num : array) {

            if (num == sequence.get(index)) {
                index++;
            }
            if (index == sequence.size()) return true;
        }


        return false;
    }

}

