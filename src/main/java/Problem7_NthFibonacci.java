public class Problem7_NthFibonacci {
    public static int getNthFib(int n) {
        // O(n) time, O(1) space
        if (n == 1) return 0;
        if (n == 2) return 1;
        int f1 = 0, f2 = 1, f3 = 1;
        for (int i = 2; i < n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
