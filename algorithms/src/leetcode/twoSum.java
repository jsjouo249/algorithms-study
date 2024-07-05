package leetcode;

// 1
public class twoSum {
    public static void main(String[] agrs) {
        int[] arr = {2,7,11,15};
        int target = 9;

        twoSum(arr, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        boolean findAnswer = false;

        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    result[0] = i;
                    result[1] = j;
                    findAnswer = true;
                    break;
                }
            }

            if (findAnswer) {
                break;
            }
        }

        System.out.println(result[0] + " " + result[1]);

        return result;
    }
}
