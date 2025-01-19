package leetcode;

import java.util.HashSet;

public class uniquePlindrom_1930 {
    public static void main(String[] agrs) {
        System.out.println(countPalindromicSubsequence("bbcbaba"));
    }

    public static int countPalindromicSubsequence(String s) {
        int answer = 0;

        HashSet<Character> hs = new HashSet<>();

        int[] alpha = new int[26];

        for (int start = 0; start < s.length() - 2; start++) {
            if (alpha[s.charAt(start) - 'a'] == 0) {
                alpha[s.charAt(start) - 'a'] = 1;
                for (int end = s.length() - 1; end > start + 1; end--) {
                    if (s.charAt(start) == s.charAt(end)) {
                        for (int i = start + 1; i < end; i++) {
                            hs.add(s.charAt(i));
                        }
                        answer += hs.size();
                        hs.clear();
                        break;
                    }
                }
            }
        }

        return answer;
    }
}
