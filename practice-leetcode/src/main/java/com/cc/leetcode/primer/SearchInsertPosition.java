package com.cc.leetcode.primer;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法
 *
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int n = nums.length - 1;
        int i = n / 2;
        if (nums[0]>target){
            return 0;
        }
        if (nums[nums.length-1]<target){
            return nums.length;
        }
        while (true){
            if (nums[i] < target) {
                i = (n-i)/2+i;
            } else if (nums[i] > target) {
                n=i;
                i = i/2;
            } else {
                return i;
            }
        }

    }

    public static void main(String[] args) {
        int[] i = new int[]{1,3,4,5,6,8};
        int i1 = new SearchInsertPosition().searchInsert(i, 6);
        System.out.println(i1);
    }
}
