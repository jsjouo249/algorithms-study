package week8;

public class q1 {
    public static void main(String[] agrs) {
          int n = 4;
          fib(n);
    }

    static int fibArr[] = new int[31];

    public static int fib(int n) {
        fibArr[0] = 1;
        fibArr[1] = 1;

        for (int i = 2; i <= n; ++i) {
            fibArr[i] = fibArr[i - 2] + fibArr[i - 1];
        }

        return fibArr[n];
    }
}
