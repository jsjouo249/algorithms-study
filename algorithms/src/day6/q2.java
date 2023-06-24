package day6;

//567. Permutation in String

import java.util.HashMap;

public class q2 {
    public static void main(String[] agrs) {
        String s1 = "abc";
        String s2 = "bbbca";
        checkInclusion(s1, s2);
    }

    public static boolean checkInclusion(String s1, String s2) {
        boolean isContain = false;

        int cnt = s2.length() - s1.length() + 1;
        int[] s1Arr = new int[26];

        for (char c: s1.toCharArray()) {
            s1Arr[c - 'a']++;
        }

        for (int i = 0; i < cnt; ++i) {
            int[] s2Arr = new int[26];
            StringBuilder sb = new StringBuilder(s2.substring(i, i + s1.length()));

            for (int j = 0; j < s1.length(); ++j) {
                s2Arr[sb.charAt(j) - 'a']++;
            }

            for (int j = 0; j < s1Arr.length; ++j) {
                if (s1Arr[j] != s2Arr[j]) {
                    isContain = false;
                    break;
                } else {
                    isContain = true;
                }
            }

            if (isContain) {
                break;
            }
        }

        System.out.println(isContain);

        return isContain;
    }
}
