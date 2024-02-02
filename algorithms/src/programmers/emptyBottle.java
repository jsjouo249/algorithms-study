package programmers;

public class emptyBottle {
    public static void main(String agrs[]) {
        solution(3, 1, 20);
    }

    public static int solution(int a, int b, int n) {
        int addBottle = 0;
        while (true) {
            addBottle += (n / a) * b;

            n = (n / a) * b + n % a;

            if (n < a) {
                break;
            }
        }

        return addBottle;
    }
}
