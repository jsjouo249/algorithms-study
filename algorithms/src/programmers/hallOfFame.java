package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/138477

import java.util.ArrayList;
import java.util.Comparator;

public class hallOfFame {
    public static void main(String[] agrs) {
        solution(4, new int []{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});
    }

    public static int[] solution(int k, int[] score) {
        int [] arr = new int[score.length];
        ArrayList<Integer> listOfFame = new ArrayList<>();

        for (int i = 0; i < score.length; ++i) {
            listOfFame.add(score[i]);
            listOfFame.sort(Comparator.naturalOrder());

            if (listOfFame.size() > k) {
                listOfFame.remove(0);

                arr[i] = listOfFame.get(0);
            } else {
                arr[i] = listOfFame.get(0);
            }
        }

        return arr;
    }
}
