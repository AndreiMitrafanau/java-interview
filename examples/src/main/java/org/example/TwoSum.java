package org.example;

import java.util.HashMap;

/**
 * You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Iterate through array and check if ech element satisfy predicate that i + j = target
 *
 * Corner cases:
 * Don't see any
 *
 * Complexity:
 * O2 (just guessing don't know how to count complexity)
 *
 */
public class TwoSum {
    public int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] twoSum(int[] nums, int target) {
        var seen = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            var n = seen.get(target-nums[i]);
            if (n != null) {
                return new int[] {n, i};
            } else
                seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
