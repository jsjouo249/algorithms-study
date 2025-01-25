package leetcode;

public class findTheIndexOfTheFirstOccurrenceInAString_28 {
     public static void main(String[] agrs) {
         System.out.println(strStr("sadbutsad","sad"));
     }

    public static int strStr(String haystack, String needle) {
         return haystack.indexOf(needle);
    }
}
