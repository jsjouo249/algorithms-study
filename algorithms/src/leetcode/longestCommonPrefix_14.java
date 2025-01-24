package leetcode;

public class longestCommonPrefix_14 {
    public static void main(String[] agrs) {
        System.out.println(longestCommonPrefix(new String[]{"abca", "aba", "aaab"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].length() == 0) {
            return "";
        }

        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = strs[0].length(); i >= 1; i--) {
            boolean isSame = true;

            String temp = strs[0].substring(0 , i);

            for (String str : strs) {
                if (str.length() <= i || !str.substring(0, i).equals(temp)) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                answer = temp;
                break;
            }
        }

        return answer;
    }
}
