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

        StringBuilder result = new StringBuilder();

        StringBuilder word = new StringBuilder();
        StringBuilder repeat = new StringBuilder();

        Stack<String> wordSt = new Stack<>();
        Stack<Integer> repeatSt = new Stack<>();

        int index = 1;

        char head = s.charAt(0);
        if ( Character.isDigit(head) ) {
            repeat.append(head);
        }else {
            StringBuilder firstWord = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if ( Character.isAlphabetic(s.charAt(i)) ) {
                    firstWord.append(s.charAt(i));
                    index = i + 1;
                }else {
                    break;
                }
            }
            result.append(firstWord);
        }


        for (int i = index; i < s.length(); ++i) {
            char temp = s.charAt(i);
            //숫자일 때
            if ( Character.isDigit(temp) ) {
                /**
                 * 지금 index가 숫자인데, 이전의 index가 숫자가 아니면, 여태 만든 숫자는 반복숫자stack에 넣기
                 * 2[a3[b]]에서 3인 경우
                 */
                if( Character.isAlphabetic(head) ) {
                    wordSt.push(word.toString());
                    word.setLength(0);
                }

                repeat.append(temp);
            }else if ('[' == temp) {
                //[면 반복숫자stack에 넣기
                repeatSt.push(Integer.parseInt(repeat.toString()));

                repeat.setLength(0);
            }else if (']' == temp) {
                // 반복숫자만큼 반복단어 돌리기
                int repeatNum = repeatSt.pop();
                if (!word.isEmpty()) {
                    wordSt.push(word.toString());
                    word.setLength(0);
                }
                String repeatWord = wordSt.pop();

                StringBuilder a = new StringBuilder();

                for (int rNum = 0; rNum < repeatNum; rNum++) {
                    a.append(repeatWord);
                }

                if (repeatSt.isEmpty()) {
                    result.append(a);
                }else {
                    String lastRepeatWord = wordSt.pop() + a;

                    wordSt.push(lastRepeatWord);
                }

                word.setLength(0);
            }else {
                //알파벳이면 반복단어 만들기
                word.append(temp);
            }
            head = temp;
        }

        if (!word.isEmpty()) {
            result.append(word);
        }

        return result.toString();
    }
}
