package Homework.Dz5;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        String[] words1 = {"a", "a", "a", "b"};
        String[] words2 = {"a", "c", "b", "c"};


        Solution sol = new Solution();
        System.out.println(sol.countWords(words1, words2));
    }

    static class Solution {
        public int countWords(String[] words1, String[] words2) {
            if (words1.length > words2.length) {
                return countWords(words2, words1);
            }

            Map<String, Integer> mapWords = new HashMap<>();

            for (int i = 0; i < words1.length; i++) {
                if (mapWords.containsKey(words1[i])) {
                    mapWords.put(words1[i], mapWords.get(words1[i]) + 1);
                } else {
                    mapWords.put(words1[i], 1);
                }
            }

            for (int i = 0; i < words1.length; i++) {
                if (mapWords.containsKey(words1[i])) {
                    if (mapWords.get(words1[i]) > 1) {
                        mapWords.remove(words1[i]);
                    }
                }
            }

            for (int i = 0; i < words2.length; i++) {
                if (mapWords.containsKey(words2[i])) {
                    if (mapWords.get(words2[i]) >= 0) {
                        mapWords.put(words2[i], mapWords.get(words2[i]) - 1);
                    }
                }
            }

            int countWord = 0;
            for (Integer val : mapWords.values()) {
                if (val == 0) {
                    countWord++;
                }
            }
            return countWord;
        }
    }
}

