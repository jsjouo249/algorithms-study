package programmers;

// 다음 큰 숫자 https://school.programmers.co.kr/learn/courses/30/lessons/12911

public class nextBiggerNum {
    public static void main(String[] agrs) {
        solution(78);
    }

    public static int solution(int n) {
        String binary = Integer.toBinaryString(n);
        int oneCnt = 0;


        for (int i = 0; i < binary.length(); ++i) {
            if (binary.charAt(i) == '1') oneCnt++;
        }

        while (true) {
            int temp = 0;
            n += 1;

            String tempBinary = Integer.toBinaryString(n);

            for (int i = 0; i < tempBinary.length(); ++i) {
                if (tempBinary.charAt(i) == '1') temp++;
            }

            if (temp == oneCnt) break;
        }


        return n;
    }
}
