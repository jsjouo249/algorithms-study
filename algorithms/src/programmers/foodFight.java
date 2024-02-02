package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/134240

public class foodFight {
    public static void main (String agrs[]) {
        int[] food = {1, 3, 4, 6};
        solution(food);
    }

    public static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; ++i) {
            int temp = food[i];

            if (temp > 1) {
                int displayCnt = temp / 2;

                for (int j = 0; j < displayCnt; ++j) {
                    sb.append(i);
                }
            }
        }

        String answer = sb.toString() + "0" + sb.reverse().toString();

        return answer;
    }
}
