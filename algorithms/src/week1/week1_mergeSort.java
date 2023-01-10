package week1;

public class week1_mergeSort {

    public static void main(String[] agrs) {
        int[] arr = {3, -2, -5};
        sortArray(arr);
    }

    static int[] arr;
    static int[] tempArr;

    public static int[] sortArray(int[] nums) {
        arr = nums;
        tempArr = new int[arr.length];
        mergeSort( 0, nums.length - 1 );
        return nums;
    }

    private static void mergeSort(int start, int end) {
        if ( start < end)  {
            int mid = ( start + end ) / 2;
            //배열 반씩 나누기
            mergeSort( start, mid );
            mergeSort( mid+1, end );

            //나눠진 배열을 정렬해서 다시 원래 배열에 넣기
            int leftIndex = start;
            int rightIndex = mid + 1;
            int index = leftIndex;

            while ( leftIndex <= mid || rightIndex <= end ) {
                if ( rightIndex > end || ( leftIndex <= mid && arr[leftIndex] < arr[rightIndex] ) ) {
                    tempArr[index++] = arr[leftIndex++];
                } else {
                    tempArr[index++] = arr[rightIndex++];
                }
            }

            for (int i = start; i <= end; i++) {
                arr[i] = tempArr[i];
            }
        }
    }
}
