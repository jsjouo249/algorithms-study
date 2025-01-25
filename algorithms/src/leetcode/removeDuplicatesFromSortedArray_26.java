package leetcode;

import java.util.HashSet;

public class removeDuplicatesFromSortedArray_26 {
     public static void main(String[] agrs) {
         System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
     }

    public static int removeDuplicates(int[] nums) {
         HashSet<Integer> hs = new HashSet<>();

         for (int i = 0, changeIndex = 0; i < nums.length; i++) {
             if (hs.add(nums[i])) {
                 nums[changeIndex] = nums[i];
                 changeIndex++;
             }
         }

         return hs.size();
    }
}
