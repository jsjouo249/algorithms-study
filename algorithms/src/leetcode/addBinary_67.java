package leetcode;

public class addBinary_67 {
    public static void main(String[] agrs) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int indexA = a.length() - 1;
        int indexB = b.length() - 1;

        int maxArraySize = Math.max(a.length(), b.length()) - 1;

        char carryNum = '0';

        for (; maxArraySize >= 0; maxArraySize--, indexA--, indexB--) {
            char tempA = '0';
            char tempB = '0';

            if (indexA < a.length() && indexA >= 0) {
                tempA = a.charAt(indexA);
            }
            if (indexB < b.length() && indexB >= 0) {
                tempB = b.charAt(indexB);
            }

            if (tempA + tempB + carryNum == 147 ) {
                sb.insert(0, "1");
                carryNum = '1';
            } else if (tempA + tempB + carryNum == 146) {
                sb.insert(0, "0");
                carryNum = '1';
            } else if (tempA + tempB + carryNum == 145) {
                sb.insert(0, "1");
                carryNum = '0';
            } else {
                sb.insert(0, "0");
                carryNum = '0';
            }
        }

        if (carryNum == '1') {
            sb.insert(0, "1");
        }

        return sb.toString();
    }
}
