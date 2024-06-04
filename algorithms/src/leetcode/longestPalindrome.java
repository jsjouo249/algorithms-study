package leetcode;

//409

public class longestPalindrome {
     public static void main(String[] agrs) {
         longestPalindrome("abccccdd");
     }

     public static int longestPalindrome(String s) {
         int[] wholeAlpha = new int[58];
         int length = 0;
         boolean addOdd = false;

         for (int i = 0; i < s.length(); ++i) {
             wholeAlpha[s.charAt(i) - 'A']++;
         }

         for (int v : wholeAlpha) {
             if (v % 2 == 0) {
                 length += v;
             } else {
                 addOdd = true;
                 length += v - 1;
             }
         }

         return addOdd ? length + 1 : length;
     }
}
