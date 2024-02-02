package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/176963

import java.util.ArrayList;
import java.util.HashMap;

public class missingScore {
    public static void main (String args[]) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};
        solution(name, yearning, photo);
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        ArrayList<Integer> score = new ArrayList<>();

        HashMap<String, Integer> nameScoreHm = new HashMap<>();

        for (int i = 0; i < name.length; ++i) {
            nameScoreHm.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; ++i) {
            int tempScore = 0;
            for (int j = 0; j < photo[i].length; ++j) {
                tempScore += nameScoreHm.getOrDefault(photo[i][j], 0);
            }

            score.add(tempScore);
        }

        return score.stream().mapToInt(Integer::intValue).toArray();
    }
}
