package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * <p>
 * Algorithm:
 * Iterate through input Array and put elements into Map
 * key will be sorted String and value will be List of actual Strings
 * <p>
 * Corner cases:
 * None
 * <p>
 * Complexity:
 * O(N)
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        var acc = new HashMap<String, List<String>>();
        for (String str : strs) {
            var chars = str.toCharArray();
            Arrays.sort(chars);
            var key = new String(chars);
            acc.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return acc.values().stream().toList();
    }
}
