package org.example;

import java.util.HashSet;

public class ContainsDuplicate {
    /**
     * Given an integer array nums, return true if any value appears at least twice in the array,
     * and return false if every element is distinct.
     * <p>
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     * Explanation:
     * The element 1 occurs at the indices 0 and 3.
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     * Explanation:
     * All elements are distinct.
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     * Constraints:
     * 1 <= nums.length <= 105
     * -109 <= nums[i] <= 109
     * <p>
     * Решение:
     * итерировать по Array, собирать данные в сет если новый элемент есть в сете то возвращаем true ecли нет, идем
     * дальше и возвращаем true
     * Solution:
     * Iterate through Array and put value in Set if Set contains value return true if not contains true
     *
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
           if (set.contains(nums[i])){
               return true;
           } else {
               set.add(nums[i]);
           }
        }
        return set.size() != nums.length;
    }
}
