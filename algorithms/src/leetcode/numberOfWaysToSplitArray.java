package leetcode;

//2270
public class numberOfWaysToSplitArray {
    public static void main(String[] agrs) {
        System.out.println(waysToSplitArray(new int[] {10, 4, -8, 7}));
    }

    public static int waysToSplitArray(int[] nums) {
        int result = 0;

        long leftSum = 0;
        long rightSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];

            if (leftSum >= rightSum) result++;
        }

        return result;
    }
}
