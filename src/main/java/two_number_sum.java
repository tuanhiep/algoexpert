import java.util.*;

class Program {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int[] result= new int[2];
        for(int i : array){
            for(int j : array){

                if (i!=j && i+j==targetSum){

                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }

        }
        return new int[0];
    }
}

