package day6;

//3. Longest Substring Without Repeating Characters

import java.util.HashSet;

public class q1 {
    public static void main(String[] agrs) {
        String s = "abcabcbb";
        lengthOfLongestSubstring(s);
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;

        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }

        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < s.length(); ++i) {
            hs.add(s.charAt(i));
            int tempMax = 1;

            for (int j = i + 1; j < s.length(); ++j) {
                if (hs.add(s.charAt(j)) == false) {
                    hs.clear();
                    break;
                } else {
                    hs.add(s.charAt(j));
                    tempMax++;
                }
            }
            max = Math.max(max, tempMax);
        }

        return max;
    }
}
