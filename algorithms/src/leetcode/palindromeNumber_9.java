package leetcode;

public class palindromeNumber_9 {
    public static void main(String[] agrs) {

        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        boolean result = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = false;
                break;
            }
        }

        return result;
    }
}
