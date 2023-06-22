package day4;

import java.util.StringTokenizer;

// 557. Reverse Words in a String III
public class q2 {
    public static void main(String[] agrs) {
        String s = "Let's take LeetCode contest";
        reverseWords(s);
    }

    public static String reverseWords(String s) {
        StringTokenizer cut = new StringTokenizer(s, " ");
        StringBuilder sb = new StringBuilder();

        while (cut.hasMoreTokens()) {
            char[] temp = cut.nextToken().toCharArray();

            for (int i = temp.length - 1; i >= 0; --i) {
                sb.append(temp[i]);
            }
            if (cut.hasMoreTokens()) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
