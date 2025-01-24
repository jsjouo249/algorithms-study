package leetcode;

import java.util.Stack;

public class validParentheses_20 {
    public static void main(String[] agrs) {
        System.out.println(isValid("(])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        boolean answer = true;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.add(c);
            } else if (st.empty()) {
                answer = false;
                break;
            } else if (c == ')') {
                if (st.peek() == '(') {
                    st.pop();
                }
                else {
                    answer = false;
                    break;
                }
            }  else if (c == ']') {
                if (st.peek() == '[') {
                    st.pop();
                }
                else {
                    answer = false;
                    break;
                }
            } else if (c == '}') {
                if (st.peek() == '{') {
                    st.pop();
                }
                else {
                    answer = false;
                    break;
                }
            }
        }

        if (!st.empty()) {
            answer = false;
        }

        return answer;
    }
}
