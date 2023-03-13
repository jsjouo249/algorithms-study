package week7;

class prevWidthInfo {
    int width;
    int height;
    int continuousNum;
    int minHeight;

    public prevWidthInfo(int width, int height, int continuousNum, int minHeight) {
        this.width = width;
        this.height = height;
        this.continuousNum = continuousNum;
        this.minHeight = minHeight;
    }
}

public class q1 {
    public static void main(String[] agrs) {
//        int[] heigths = {2, 1, 5, 6, 6, 2, 3};
//        largestRectangleArea(heigths);
//        int[] heigths1 = {2, 1, 5, 6, 2, 3};
//        largestRectangleArea(heigths1);
//        int[] heigths2 = {2, 4};
//        largestRectangleArea(heigths2);
//        int[] heigths3 = {5, 4, 1, 2};
//        largestRectangleArea(heigths3);
//        int[] heigths4 = {1, 2, 3, 4, 5};
//        largestRectangleArea(heigths4);
//        int[] heigths4 = {4,2,0,3,2,4,3,4};
//        largestRectangleArea(heigths4);
          int[] heigths4 = {1,2,1,1,1,1,0,1};
          largestRectangleArea(heigths4);
    }

    public static int largestRectangleArea(int[] heights) {
        prevWidthInfo[] arr = new prevWidthInfo[heights.length];

        arr[0] = new prevWidthInfo(heights[0], heights[0], 1, heights[0]);

        //heights배열의 제일 낮은 높이
        int minHeight = heights[0];
        //제일 낮은 높이가 이어지는 숫자
        int minHeightContinuouos = 1;
        int largestWidth = heights[0];

        for (int index = 1; index < heights.length; ++index) {
            //이전 정보들
            prevWidthInfo previous = arr[index-1];
            int previousWidth = previous.width;
            int previousHeight = previous.height;
            int continuousNum = previous.continuousNum;
            int prevMinHeight = previous.minHeight;

            int height = heights[index];

            //0이 들어오면 다시 갯수 세기
            //todo: 0을 기준으로 갯수를 다시 세기 전의 크기가 더 클 수 있음
            /**
             * [1,2,1,1,1,1,0,1]이면 해당 로직은 틀림.
             */
            if ( minHeight != 0 ) {
                minHeight = Math.min(minHeight, height);
                minHeightContinuouos++;
            } else {
                minHeight = height;
                minHeightContinuouos = 1;
            }

            //현재 index가 이전 Index보다 높이가 낮으면
            if (previousHeight > height) {
                int maxWidth = 0;

                if (previousWidth < (Math.min(prevMinHeight, height)) * (continuousNum + 1)) {
                    maxWidth = (Math.min(prevMinHeight, height)) * (continuousNum + 1);
                    continuousNum++;
                } else {
                    maxWidth = previousWidth;
                    continuousNum = 1;
                }


                largestWidth = Math.max(largestWidth, maxWidth);
                arr[index] = new prevWidthInfo( largestWidth, height, continuousNum, Math.min(prevMinHeight, height) );


                continue;
            }

            int maxWidth = 0;
            if ( prevMinHeight * (continuousNum + 1) > height ) {
                maxWidth = prevMinHeight * (continuousNum + 1);
                continuousNum++;
            } else {
                prevMinHeight = height;
                maxWidth = height;
                continuousNum = 1;
            }

            /**
             * 2, 3, 4에서 2와4까지가 같고, 3과4까지가 둘다 6으로 같은 경우
             * 더 큰 사각형을 찾기 위해서는 3,4를 선택해야함
             */
            if (previousHeight * (continuousNum - 1) == prevMinHeight * (continuousNum)) {
                prevMinHeight = previousHeight;
                continuousNum--;
            }

            largestWidth = Math.max(largestWidth, maxWidth);
            arr[index] = new prevWidthInfo( largestWidth, height, continuousNum, prevMinHeight );
        }

        largestWidth = Math.max( minHeight * minHeightContinuouos , largestWidth );

        System.out.println(largestWidth);
        return 0;
    }
}
