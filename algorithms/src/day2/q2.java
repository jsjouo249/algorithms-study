package day2;

import java.util.ArrayList;

//189. Rotate Array
public class q2 {
    public static void main(String[] agrs) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int n = 3;
        rotate(nums, n);
    }

    public static void rotate(int[] nums, int k) {
        // k를 배열로 나눠서 나머지의 값만큼만 돌리면 됨.
        int count = k % nums.length;
        ArrayList arr = new ArrayList<Integer>();

        if (count != 0) {
            for (int i = nums.length - count; i < nums.length; ++i) {
                arr.add(nums[i]);
            }

            for (int i = 0; i < nums.length - count; i++) {
                arr.add(nums[i]);
            }
        }

        for (Object a : arr) {
            System.out.println(a);
        }

        for (int i = 0; i < arr.size(); ++i) {
            nums[i] = (int) arr.get(i);
        }
    }
}
