package programmers;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/142086
public class closestSameNumber {
    public static void main(String[] agrs) {
        String s = "banana";
        solution(s);
    }

    public static int[] solution(String s) {
        ArrayList<Integer> arr = new ArrayList<>();

        int[] alpha = new int[26];

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if ( alpha[c - 'a'] == 0 ) {
                alpha[c - 'a']++;
                arr.add(-1);
            } else {
                int tempIndex = 1;
                for (int j = i - 1; j >= 0; --j) {
                    if (s.charAt(j) == c) {
                        break;
                    }
                    tempIndex++;
                }

                arr.add(tempIndex);
            }
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}
