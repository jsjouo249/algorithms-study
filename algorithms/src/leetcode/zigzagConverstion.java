package leetcode;

//6 zigzag conversion

public class zigzagConverstion {
    public static void main(String[] args) {
        String s = "ABC";
        int numRows = 1;
        convert(s, numRows);
    }

    static char[][] zigzag;

    static int col;
    static int sIndex;

    public static String convert(String s, int numRows) {
        zigzag = new char[numRows][s.length()];

        col = 0;
        sIndex = 1;

        if (numRows == 1) {
            return s;
        }

        //down, diagonal이 3번씩 도니, 처음엔 매핑
        zigzag[0][0] = s.charAt(0);

        while (sIndex <= s.length()) {
            down(numRows, s);
            col++;
            diagonal(numRows, s);
            col--;
            if (sIndex >= s.length()) break;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < zigzag.length; ++i) {
            for (int j = 0; j < zigzag[0].length; ++j) {
                if (zigzag[i][j] != 0) {
                    sb.append(zigzag[i][j]);
                }
            }
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

    //밑으로 3번
    public static void down(int numRows, String s) {
        for (int i = 1; i <= numRows - 1; ++i) {
            if (sIndex >= s.length()) break;
            zigzag[i][col] = s.charAt(sIndex);
            sIndex++;
        }
    }

    //대각선 위로 3번
    public static void diagonal(int numRows, String s) {
        for (int i = numRows - 2; i >= 0; --i, ++col) {
            if (sIndex >= s.length()) break;
            zigzag[i][col] = s.charAt(sIndex);
            sIndex++;
        }
    }
}
