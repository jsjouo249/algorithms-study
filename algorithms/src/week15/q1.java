package week15;

public class q1 {
    public static void main(String[] agrs) {
        int[] nums = {0,4,3,4,0,4};
        specialArray(nums);
    }

    public static int specialArray(int[] nums) {
        int count = 0;
        for (int i = 1; i <= 1000; ++i) {
            count = 0;
            for (int j = 0; j < nums.length; ++j) {
                if (i <= nums[j] ) {
                    count++;
                }
            }
            if( count == i ) {
                return i;
            }
        }
        return -1;
    }
}
