package day4;

import java.util.Arrays;

//344. Reverse String
public class q1 {
    public static void main(String[] agrs) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        for (int first = 0, end = s.length - 1; first < s.length / 2; ++first, --end) {
            char temp = s[first];
            s[first] = s[end];
            s[end] = temp;
        }
    }
}
