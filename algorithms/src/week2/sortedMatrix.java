package week2;

import java.util.Arrays;
import java.util.HashMap;

public class sortedMatrix {
    public static void main(String[] agrs) {
        int[][] arr = {{1,5,9}, {10, 11, 13}, {12, 13, 15}};
        System.out.println(kthSmallest(arr, 8));
    }

    public static int kthSmallest(int[][] matrix, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        int [] result = new int[matrix.length * matrix[0].length];

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                hm.put(ints[j], hm.getOrDefault(ints[j], 0) + 1);
            }
        }

        int index = 0;
        for( int key : hm.keySet() ){
            int keyNum = hm.get(key);
            for( int i = 0; i < keyNum; ++i, ++index ){
                result[index] = key;
            }
        }

        Arrays.sort(result);

        return result[k-1];
    }
}
