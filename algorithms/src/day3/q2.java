package day3;

import java.util.ArrayList;

//167 Two Sum II - Input Array Is Sorted
public class q2 {
    public static void main(String[] agrs) {
        int[] numbers = {2,3,4};
        int target = 6;
        twoSum(numbers, target);
    }

    public static int[] twoSum(int[] numbers, int target) {
         int firstIndex = 0;
        int secondIndex = numbers.length - 1;
        boolean isFinish = false;

        while (firstIndex <= secondIndex) {
            if (numbers[firstIndex] + numbers[secondIndex] > target) {
                secondIndex--;
            } else if (numbers[firstIndex] + numbers[secondIndex] < target) {
                firstIndex++;
            } else {
                break;
            }
        }

        int[] ret = {firstIndex + 1, secondIndex + 1};

        for (int a : ret) {
            System.out.println(a);
        }

        return ret;
    }
}
