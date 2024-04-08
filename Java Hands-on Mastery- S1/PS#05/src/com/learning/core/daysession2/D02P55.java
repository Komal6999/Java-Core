package com.learning.core.daysession2;

import java.util.*;

public class D02P55 {
    public static void main(String[] args) {
        String[] words = {"abc", "efg", "cde", "ghi", "ija"};
        boolean canFormCircle = canFormCircle(words);
        System.out.println(canFormCircle);
    }

    public static boolean canFormCircle(String[] words) {
        // Create adjacency list representing the graph
        Map<Character, List<String>> graph = new HashMap<>();
        for (String word : words) {
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);
            if (!graph.containsKey(firstChar)) {
                graph.put(firstChar, new ArrayList<>());
            }
            graph.get(firstChar).add(word);
            if (!graph.containsKey(lastChar)) {
                graph.put(lastChar, new ArrayList<>());
            }
        }

        // Start DFS from any character to find if a cycle exists
        for (char startChar : graph.keySet()) {
            Set<String> visited = new HashSet<>();
            if (dfs(startChar, startChar, graph, visited)) {
                return true;
            }
        }
        return false;
    }

    private static boolean dfs(char startChar, char currentChar, Map<Character, List<String>> graph, Set<String> visited) {
        // Base case: If the current character has been visited and it's the start character, return true
        if (currentChar == startChar && visited.contains(Character.toString(startChar))) {
            return true;
        }

        // Mark the current character as visited
        visited.add(Character.toString(currentChar));

        // Get the words starting with the current character
        List<String> nextWords = graph.get(currentChar);

        // Perform DFS on each word starting with the current character
        if (nextWords != null) {
            for (String nextWord : nextWords) {
                char nextChar = nextWord.charAt(nextWord.length() - 1);
                if (!visited.contains(nextWord) && dfs(startChar, nextChar, graph, visited)) {
                    return true;
                }
            }
        }

        // Unmark the current character before returning
        visited.remove(Character.toString(currentChar));
        return false;
    }
}
