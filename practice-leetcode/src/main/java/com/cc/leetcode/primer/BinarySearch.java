package com.cc.leetcode.primer;

import java.util.Arrays;

/**
 * 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target ，写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 */
public class BinarySearch {
  public int search(int[] nums, int target) {
    int m = nums.length / 2;
    for (int i = nums.length/2; i >0; i--) {
      if (nums[i] > target) {
        return i;
      }
    }
    return -1;
  }
}
