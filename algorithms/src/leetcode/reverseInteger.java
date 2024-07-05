package leetcode;

// 7 reverseInteger

public class reverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(120));
    }

    public static int reverse(int x) {
        boolean isMinus = false;
        long convertLong = Long.valueOf(x);
        if (x < 0) {
            isMinus = true;
            convertLong = -1 * convertLong;
        }

        StringBuilder sb = new StringBuilder();

        while (true) {
            sb.append(convertLong % 10);
            convertLong = convertLong / 10;

            if (convertLong / 10 == 0) {
                if (convertLong > 0) {
                    sb.append(convertLong);
                }
                break;
            }
        }

        long result = isMinus ? -1 * Long.parseLong(sb.toString()) : Long.parseLong(sb.toString());

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) result;
        }
    }
}
