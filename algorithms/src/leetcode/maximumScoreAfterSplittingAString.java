package leetcode;

//1422
public class maximumScoreAfterSplittingAString {
    public static void main(String[] agrs) {
        System.out.println(maxScore("011101"));
    }

    public static int maxScore(String s) {
      int max = 0;

      for (int i = 1; i < s.length(); i++) {
          String left = s.substring(0, i);
          String right = s.substring(i);

          int leftZero = 0;
          int rightOne = 0;

          for (int j = 0; j < i; j++) {
              if (s.charAt(j) == '0') {
                  leftZero++;
              }
          }

          for (int k = i; k < s.length(); k++) {
              if (s.charAt(k) == '1') {
                  rightOne++;
              }
          }

          max = Math.max(max, leftZero + rightOne);
      }

      return max;
    }
}
