package com.zephir0g;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();


        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x){

        if (x < 0){
            return false;
        }

        int rev = 0;
        int num = x;

        while (num != 0){
                int pal = num % 10;
                num /= 10;
                rev = rev * 10 + pal;
            }return x == rev;
        }
}
