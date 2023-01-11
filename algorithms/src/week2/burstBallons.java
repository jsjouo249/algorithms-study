package week2;

import java.util.Arrays;

public class burstBallons {
    public static void main(String[] agrs) {
        //int[][] arr = {{-2147483646,-2147483645}, {2147483646,2147483647}};
        //int[][] arr = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        //int[][] arr = {{9, 12}, {1, 10}, {4, 11}, {8, 12}, {3, 9}, {6, 9}, {6, 7}};
        int[][] arr = {{1,1}};
        findMinArrowShots(arr);
    }

    public static int findMinArrowShots(int[][] points) {
        //Xstart 순으로 정렬 후, 같으면 Xend순으로 오름 차순 정렬
        Arrays.sort(points , (arr1, arr2) -> {
            if ( arr1[0] < arr2[0] ) {
                return -1;
            }else if( arr1[0] > arr2[0]) {
                return 1;
            }else {
                return arr1[1] - arr2[1];
            }
        });

        //지금 풍선의 end보다 내 뒤의 풍선의 start가 더 크면, 화살 늘리고, 지금 풍선을 내 뒤의 풍선으로 치환
        /**
         * a 1, 6
         * b 2, 8
         * c 7, 12
         * e 10, 16
         * a의 end가 b의 start보다 크지만, c의 start보다 작으니, a,b는 1개의 화살로 가능.
         */

        int arrow = 1;
        int indexStart = points[0][0];
        int indexEnd = points[0][1];

        for (int i = 1; i < points.length; ++i) {
            if( indexEnd < points[i][0] ){
                indexEnd = points[i][1];
                arrow++;
            } else {
                //[[9,12],[1,10],[4,11],[8,12],[3,9],[6,9],[6,7]]
                //중간에 6,7 처럼 짧은 놈이 끼면, 밑에 있고(start가 크고), 길이는 짧은 (end는 작은)놈이 기준이 되야 함.
                indexStart = Math.max(indexStart, points[i][0]);
                indexEnd = Math.min(indexEnd, points[i][1]);
            }
        }

        return arrow;
    }
}
