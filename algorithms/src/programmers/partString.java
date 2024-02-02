package programmers;

import java.util.HashMap;

//https://school.programmers.co.kr/learn/courses/30/lessons/147355
public class partString {
    public static void main(String agrs[]) {
        String t = "1221351118575141528544";
        String p = "12511";
        solution(t, p);
    }

    static int solution(String t, String p) {
        int answer = 0;

        Long numP = Long.parseLong(p);

        HashMap<Long, Long> hm = new HashMap<>();

        int index = 0;

        while ( index + p.length() <= t.length()) {
            Long temp = Long.parseLong(t.substring(index, index + p.length()));
            hm.put(temp, hm.getOrDefault(temp, 0L) + 1);
            index++;
        }

        for (Long key : hm.keySet()) {
            System.out.println(key + " ::: " + hm.get(key));
            if (key <= numP) answer += hm.get(key);
        }

        System.out.println(answer);

        return answer;
    }
}
