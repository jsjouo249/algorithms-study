package week5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class q1 {
    public static void main(String[] agrs) {
        int[] deck = {17,13,11,2,3,5,7};
        deckRevealedIncreasing(deck);
    }

    public static int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> queue = new LinkedList<>();

        int[] result = new int[deck.length];
        Arrays.sort(deck);
        /**
         * 오름차순으로 되어야 하니 역순으로 넣음.
         * 1. 하나를 뽑는다
         * 2. 카드가 있다면 다음건 맨 아래로 내린다.
         * 있다면 1, 2 반복을 해야하니
         * 역순으로 하기.
         * 1. 하나를 넣는다
         * 2. 카드가 있다면 맨 앞으로 넣고, 넣는다.
         */
        for (int i = deck.length - 1; i >= 0; --i) {
            int temp = deck[i];

            if (queue.size() > 0) {
                queue.add(queue.poll());
            }
            queue.add(temp);
        }

        for (int i = deck.length - 1; i >= 0; --i) {
            result[i] = queue.poll();
        }

        return result;
    }
}
