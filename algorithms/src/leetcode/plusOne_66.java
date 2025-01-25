package leetcode;

import java.util.ArrayList;

public class plusOne_66 {
    public static void main(String[] agrs) {
         System.out.println(plusOne(new int[] {9}));
     }

    public static int[] plusOne(int[] digits) {
        ArrayList<Integer> ll = new ArrayList<>();

        boolean upperNum = false;

        int num = digits[digits.length - 1] + 1;

        if (num > 9) {
            upperNum = true;
        }
        digits[digits.length - 1] = num % 10;
        ll.add(0 ,digits[digits.length - 1]);

        for (int i = digits.length - 2; i >= 0; i--) {
            int temp = digits[i];
            if (upperNum) temp += 1;

            if (temp > 9) {
                upperNum = true;
                digits[i] = 0;
                ll.add(0, digits[i]);
            } else {
                upperNum = false;
                digits[i] = temp;
                ll.add(0, digits[i]);
            }
        }

        if (upperNum) ll.add(0, 1);

        for (int a : ll) {
            System.out.print(a + " ");
        }

        return ll.stream().mapToInt(Integer::intValue).toArray();
    }
}
