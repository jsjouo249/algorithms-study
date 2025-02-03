package leetcode;

import java.util.HashMap;

public class singleNumber_136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {4,1,2,1,2}));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int answer = 0;

        for (int num : nums) {
            if (hm.get(num) == null) {
                hm.put(num, 1);
            } else {
                hm.remove(num);
            }
        }

        for (int key : hm.keySet()) {
            answer = key;
        }

        return answer;
    }
}
