package leetcode;

//344
public class reverseString {
    public static void main(String[] agrs) {
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }

    public static void reverseString(char[] s) {
        for (int head = 0, tail = s.length - 1; head < s.length / 2; ++head, --tail) {
            char temp = '\0';

            temp = s[head];
            s[head] = s[tail];
            s[tail] = temp;
        }

        for(char c : s) {
            System.out.println(c);
        }
    }
}
