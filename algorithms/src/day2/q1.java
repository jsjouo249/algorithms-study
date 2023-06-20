package day2;

import java.util.Arrays;

//977 Squares of a Sorted Array
public class q1 {
    public static void main(String[] agrs) {
        int[] arr = {-4, -1, 0, 3, 10};
        System.out.println(sortedSquares(arr));
    }

    public static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; ++i) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }

        Arrays.sort(nums);

        return nums;
    }
}
