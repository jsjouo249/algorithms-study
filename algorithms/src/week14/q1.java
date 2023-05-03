package week14;

import java.util.HashMap;

public class q1 {
    public static void main(String[] agrs) {
        int[] fruits = {1,0,1,4,1,4,1,2,3};
        totalFruit(fruits);
    }

    public static int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> basket = new HashMap<>();

        int max = 0;
        int loopIndex = 0;
        int deleteIndex = 0;

        while (loopIndex < fruits.length) {
            //바구니에 과일 넣기.
            basket.put(fruits[loopIndex], basket.getOrDefault(fruits[loopIndex], 0) + 1);

            //바구니가 3개가 되면 뒤에서부터 하나씩 줄이면서, 바구니 2개 만들기.
            while (basket.size() > 2) {
                //처음부터 다시 돌면서, 과일 하나씩 줄여나가기.
                int fruit = fruits[deleteIndex];
                basket.put(fruit, basket.get(fruit) - 1);
                if ( basket.get(fruit) == 0 ) {
                    basket.remove(fruit);
                }
                deleteIndex++;
            }

            //이전의 max값과 현재의 slide의 갯수 비교
            max = Math.max(max, loopIndex - deleteIndex + 1);
            loopIndex++;
        }

        return max;
    }
}
