package leetcode;

public class romanToInteger_13 {
    public static void main(String[] agrs) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                if (s.charAt(i) == 'I') {
                    if (s.charAt(i+1) == 'V') {
                        result += 4;
                        i++;
                    } else if (s.charAt(i+1) == 'X') {
                        result += 9;
                        i++;
                    } else {
                        result += 1;
                    }
                } else if (s.charAt(i) == 'X') {
                    if (s.charAt(i+1) == 'L') {
                        result += 40;
                        i++;
                    } else if (s.charAt(i+1) == 'C') {
                        result += 90;
                        i++;
                    } else {
                        result += 10;
                    }
                } else if (s.charAt(i) == 'C') {
                    if (s.charAt(i+1) == 'D') {
                        result += 400;
                        i++;
                    } else if (s.charAt(i+1) == 'M') {
                        result += 900;
                        i++;
                    } else {
                        result += 100;
                    }
                } else {
                    result += addRoman(s.charAt(i));
                }
            } else {
                result += addRoman(s.charAt(i));
            }
        }

        return result;
    }

    public static int addRoman(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
