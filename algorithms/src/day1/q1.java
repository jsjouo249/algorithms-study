package day1;
//704 binary search
public class q1 {
    public static void main(String[] agrs) {
        int[] arr = {5};
        System.out.println(search(arr, 5));
    }

    public static int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int mid = (first + last) / 2;

        while(first <= last) {
            if (nums[mid] > target) {
                last = mid - 1;
                mid = (first + last) / 2;
            } else if (nums[mid] < target) {
                first = mid + 1;
                mid = (first + last) / 2;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
