package day1;
//35 Search Insert Position
public class q3 {
    public static void main(String[] agrs) {
        int nums[] = new int[] {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int mid = (first + last) / 2;

        while (first <= last) {
            if (nums[mid] < target) {
                first = mid + 1;
                mid = (first + last) / 2;
            } else if (nums[mid] > target) {
                last = mid - 1;
                mid = (first + last) / 2;
            } else {
                return mid;
            }
        }
        return first;
    }
}
