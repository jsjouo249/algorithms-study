package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

// 88 merge sorted array
public class mergeSortedArray {
    public static void main(String[] agrs) {
        int[] nums1 = {-1, 0, 0, 3, 3, 3, 0, 0, 0};
        int m = 6;
        int[] nums2 = {1, 2, 2};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; ++i) {
            list.add(nums1[i]);
        }

        for (int i = 0; i < n; ++i) {
            list.add(nums2[i]);
        }

        Integer[] arr = list.toArray(new Integer[list.size()]);

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; ++i) {
            nums1[i] = arr[i];
        }

            for (int a : nums1) {
                System.out.println(a);
        }
    }
}
