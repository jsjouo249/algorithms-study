package leetcode;

//2486
public class appendCharacters {
    public static void main(String[] agrs) {

        System.out.println(appendCharacters("abcde", "a"));
    }

    public static int appendCharacters(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                tIndex++;
            }

            sIndex++;
        }

        System.out.println(t.length() - tIndex);

        return t.length() - tIndex;
    }
}
