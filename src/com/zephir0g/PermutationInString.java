package com.zephir0g;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args){

        int count1[] = new int[26];
        int count2[] = new int[26];
        System.out.println( Arrays.equals(count1, count2));

    }


    public static boolean checkInclusion(String s1, String s2){

        int n = s1.length();
        int m = s2.length();
        if (n > m) return false;
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for (int i = 0; i < n; i++) {
            c1[s1.charAt(i) - 'a']++;
            c2[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < m - n; i++) {
            if (matches(c1, c2)) return true;
            c2[s2.charAt(i + n) - 'a']++;
            c2[s2.charAt(i) - 'a']--;
        }
        return matches(c1, c2);
    }

    public static boolean matches(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) return false;
        }
        return true;
    }

}
