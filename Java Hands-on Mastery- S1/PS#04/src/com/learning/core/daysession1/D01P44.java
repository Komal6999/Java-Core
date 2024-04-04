package com.learning.core.daysession1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D01P44 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 2;

        List<List<Integer>> result = findCombinations(arr, k);

        System.out.println("Distinct combinations of size " + k + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

    public static List<List<Integer>> findCombinations(int[] arr, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); // Sort the array to handle duplicates properly
        backtrack(arr, k, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] arr, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            // Skip duplicates to avoid duplicate combinations
            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }

            current.add(arr[i]);
            backtrack(arr, k, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
