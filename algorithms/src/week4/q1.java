package week4;

import java.util.Stack;

public class q1 {
    public static void main(String[] agrs) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();

        int max = 0;
        for (int i = 0; i < s.length(); ++i) {
            char temp = s.charAt(i);
            if ('(' == temp) {
                stack.push(temp);
                max = Math.max(max, stack.size());
            }else if (')' == temp) {
                stack.pop();
            }
        }

        return max;
    }
}
