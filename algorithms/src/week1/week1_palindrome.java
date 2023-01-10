package week1;

import java.util.HashMap;
//leetcode 409
public class week1_palindrome {
    public static void main(String[] agrs) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("Aa"));
    }

    public static int longestPalindrome(String s) {
        int length = 0;
        boolean addOdd = false;

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            hm.put(temp, hm.getOrDefault(temp, 0) + 1 );
        }

        for(Character key : hm.keySet()){
            int charNum = hm.get(key);
            //짝수면 그냥 더하고
            if( charNum % 2 == 0 ) {
                length += charNum;
            } else {
                /**
                 * 홀수면 a : 3, b : 5, c : 7면 a 2개, b 4개, c 7개
                 * 더해진 홀수 있고, 그 홀수가 3 이상이면 +1 해주기
                 */
                length += charNum - 1;
                addOdd = true;
            }
        }
        return addOdd ? length + 1 : length;
    }
}
