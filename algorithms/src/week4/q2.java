package week4;

import java.util.Stack;

public class q2 {
    public static void main(String[] agrs) {
        String s = "abc3[cd]xyz";
        System.out.println(decodeString(s));
        String s1 = "3[a]2[bc]";
        System.out.println(decodeString(s1));
        String s2 = "3[a2[c]]";
        System.out.println(decodeString(s2));
        String s3 = "2[abc]3[cd]ef";
        System.out.println(decodeString(s3));
        String s4 = "123[a]";
        System.out.println(decodeString(s4));
        String s5 = "leetcode";
        System.out.println(decodeString(s5));
        String s6 = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef";
        System.out.println(decodeString(s6));
    }

    public static String decodeString(String s) {
        Stack<StringBuilder> wordSt = new Stack<>();
        Stack<Integer> repeatNumSt = new Stack<>();

        StringBuilder result = new StringBuilder();

        int repeatNum = 0;

        for (int i = 0; i < s.length(); ++i) {
            char temp = s.charAt(i);
            //숫자일 때
            if ( Character.isDigit(temp) ) {
                repeatNum = repeatNum * 10 + (temp - '0');
            }else if ('[' == temp) {
                //[면 만들어진 단어가 있을 수 있으니, 단어를 스택에 넣고, 반복숫자도 끝났으니, 숫자도 스택에 넣기
                wordSt.push(result);
                result = new StringBuilder();
                repeatNumSt.push(repeatNum);
                repeatNum = 0;
            }else if (']' == temp) {
                // 반복숫자만큼 반복단어 돌리기
                StringBuilder tempSb = result;
                result = wordSt.pop();
                int num = repeatNumSt.pop();
                for ( int j = 0; j < num; ++j) {
                    result.append(tempSb);
                }
            }else {
                //알파벳이면 반복단어 만들기
                result.append(temp);
            }
        }

        return result.toString();
    }
}
