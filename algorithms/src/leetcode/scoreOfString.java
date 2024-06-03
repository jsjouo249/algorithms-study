package leetcode;

//3110
public class scoreOfString {
    public static void main(String[] agrs) {
        scoreOfString("hello");
    }

    public static int scoreOfString(String s) {
        int sum = 0;

        for (int i = 0; i < s.length() - 1; ++i) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);

            sum += Math.abs(c1 - c2);
        }

        return sum;
    }
}
