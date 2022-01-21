package com.cc.leetcode.primer;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] ints = new int[nums.length];
        int j = nums.length - 1;
        for (int i = 0; i < j + 1; i++) {
            int left = nums[i];
            for (j=nums.length-1-i; j >= i; j--) {
                int right = nums[j];
            }
        }
        return ints;
    }
}
