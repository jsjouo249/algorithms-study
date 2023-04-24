package week12;

import java.util.ArrayList;

public class q1 {
    public static void main(String[] agrs) {
        int[][] firstList = {{0,2},{5,10},{13,23},{24,25}};
        int[][] secondList = {{1,5},{8,12},{15,24},{25,26}};
        intervalIntersection(firstList, secondList);
    }

    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        ArrayList<int[]> arr = new ArrayList<>();

        int firstIndex = 0;
        int secondIndex = 0;

        while ( firstIndex < firstList.length && secondIndex < secondList.length ) {
            int duplicateStart = Math.max(firstList[firstIndex][0], secondList[secondIndex][0]);
            int duplicateEnd = Math.min(firstList[firstIndex][1], secondList[secondIndex][1]);

            if ( duplicateStart <= duplicateEnd ) {
                arr.add(new int[] {duplicateStart, duplicateEnd});
            }

            if ( firstList[firstIndex][1] < secondList[secondIndex][1] ) {
                ++firstIndex;
            } else {
                ++secondIndex;
            }
        }

        int[][] ret = new int[arr.size()][2];

        for(int i = 0; i < arr.size(); ++i) {
            ret[i][0] = arr.get(i)[0];
            ret[i][1] = arr.get(i)[1];
        }

        return ret;
    }
}
