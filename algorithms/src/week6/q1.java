package week6;

import java.util.PriorityQueue;

public class q1 {
    public static void main(String[] agrs) {
        int[] piles = {5, 4, 9};
        int k = 2;
        minStoneSum(piles, k);
    }

    public static int minStoneSum(int[] piles, int k) {
        int result = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);

        for(int i : piles) {
            priorityQueue.add(i);
        }

        for ( int i = 0; i < k; ++i) {
            int temp = priorityQueue.poll();
            temp = temp - (int)Math.floor(temp / 2);
            priorityQueue.add(temp);
        }

        while (!priorityQueue.isEmpty()){
            result += priorityQueue.poll();
        }

        return result;
    }
}
