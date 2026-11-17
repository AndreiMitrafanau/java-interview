package org.example;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * Решение:
 * сортируем каждую строку и проверяем равны ли отсортированные версии
 * Solution:
 * sort ech string and check if their sorted versions are equal
 *
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sortedS = s.toLowerCase().toCharArray();
        Arrays.sort(sortedS);
        char[] sortedT = t.toLowerCase().toCharArray();
        Arrays.sort(sortedT);

        return Arrays.equals(sortedS, sortedT);
    }
}
