package com.zephir0g;
import java.util.Arrays;

public class numsArrays {
    public static void main(String[] args) {

        int nums[] = {3,2,3};
        int target = 6;

        System.out.println(Arrays.toString(toSum(nums, target)));
    }

    public static int[] toSum(int nums[], int target){

        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}
