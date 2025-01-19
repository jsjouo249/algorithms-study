package leetcode;

//difference array = 차이배열로 공부한 뒤, 다시 해보기

public class shiftingLetters_2381 {
    public static void main(String[] agrs) {
        System.out.println(shiftingLetters("abc", new int[][] {{0,1,0}, {1,2,1}, {0,2,1}}));
    }

    public static String shiftingLetters(String s, int[][] shifts) {
        char[] letters = s.toCharArray();

        int[] totalShift = new int[s.length()];

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int dir = shift[2];

            for (; start <= end; start++) {
                totalShift[start] += dir == 1 ? 1 : -1;
            }
        }

        for (int i = 0; i < letters.length; i++) {
            int shiftedIndex = (s.charAt(i) - 'a' + totalShift[i] % 26 + 26) % 26;
            letters[i] = (char) ('a' + shiftedIndex);
        }

        String str = String.valueOf(letters);

        return str;
    }
}
