package leetcode;

public class validPalindrome_125 {
    public static void main(String[] agrs) {
        System.out.println(isPalindrome("Was it\\ a rat I saw?"));
    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]", "").replaceAll(" ", "").toLowerCase();

        boolean answer = true;

        if (str.length() == 0) return true;

        for (int h = 0, t = str.length() - 1; h <= str.length()/2; h++, t--) {
            if (str.charAt(h) != str.charAt(t)) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
