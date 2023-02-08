package com.zephir0g;

import java.util.Arrays;

public class ConcArray {
    public static void main(String[] args) {

        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(new ConcArray().conc(nums)));

    }

    public static int[] conc(int[] nums){
        int n = nums.length;
        int[] res = new int[n*2];
        for (int i = 0; i < n; i++) {
            res[i] = nums[i];
            res[i+n] = nums[i];

        } return res;
    }

    /*public int[] conc(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }
        return arr;
    }*/
}
