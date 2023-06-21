package day3;

import java.util.Arrays;

//283 Move Zeroes
public class q1 {
    public static void main(String[] agrs) {
        int[] arr = {2,1};
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        Arrays.sort(nums);

        int index = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (; index < nums.length; index++) {
            nums[index] = 0;
        }
    }
}
