package com.zephir0g;

public class RomanToIntegeer {
    public static void main(String[] args) {

        String s = "MCMXCIV";

        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = number(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = number(s.charAt(i + 1));
                if (s1 >= s2) {
                    res += s1;
                } else {
                    res += s2 - s1;
                    i++;
                }
            } else {
                res += s1;
                i++;
            }
        }
        return res;
    }


    public static int number(char r){
        if (r == 'I'){
            return 1;
        }
        if (r == 'V'){
            return 5;
        }
        if (r == 'X'){
            return 10;
        }
        if (r == 'L'){
            return 50;
        }
        if (r == 'C'){
            return 100;
        }
        if (r == 'D'){
            return 500;
        }
        if (r == 'M'){
            return 1000;
        }
        return 0;
    }
}
