package leetcode;

//1002 find common characters

import java.util.*;

public class commonChars {
    public static void main(String[] agrs) {
        commonChars(new String[]{"bella", "label", "roller"});
    }

    public static List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();

        int[] resultAlpha = new int[26];
        Arrays.fill(resultAlpha, 101);
        int[] alpha = new int[26];

        for (String word : words) {
            for (int i = 0; i < word.length(); ++i) {
                alpha[word.charAt(i) - 'a']++;
            }

            for (int i = 0; i < resultAlpha.length; ++i) {
                resultAlpha[i] = Math.min(resultAlpha[i], alpha[i]);
            }

            Arrays.fill(alpha, 0);
        }

        for (int i = 0; i < resultAlpha.length; ++i) {
            for (int j = 0; j < resultAlpha[i]; ++j) {
                list.add(Character.toString('a' + i));
            }
        }

        return list;
    }
}
