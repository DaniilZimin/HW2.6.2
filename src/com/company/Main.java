package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 13, 1, 8, 2, 16, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("снег", "снег", "дым", "тропинка", "берёза", "снег", "следы", "снег", "дом", "свеча", "берёза", "снег", "камин", "скрипка", "кресло", "апельсины", "камин", "огонь"));

        oddNumbers(nums);
        evenNumbers(nums);
        uniqueWords(words);
        System.out.println();
        numberOfTakes(words);
    }

    //Задание 1
    public static void oddNumbers(List<Integer> nums) {
        List<Integer> numsCopy = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            if (num % 2 != 0) {
                numsCopy.add(num);
            }
        }
        System.out.println(numsCopy);
    }

    //Задание 2
    public static void evenNumbers(List<Integer> nums) {
        Set<Integer> numsCopy = new TreeSet<>();
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            if (num % 2 == 0) {
                numsCopy.add(num);
            }
        }
        System.out.println(numsCopy);
    }

    //Задание 3
    public static void uniqueWords(List<String> words) {
        Map<String, Integer> wordByNumber = new HashMap<>();
        for (String word : words) {
            wordByNumber.put(word, wordByNumber.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordByNumber.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    //Задание 4
    public static void numberOfTakes(List<String> words) {
        Map<String, Integer> wordByNumber = new HashMap<>();
        for (String word : words) {
            wordByNumber.put(word, wordByNumber.getOrDefault(word, 0) + 1);
        }
        int result = 0;
        for (Map.Entry<String, Integer> entry : wordByNumber.entrySet()) {
            if (entry.getValue() > 1) {
                result = result + entry.getValue();
            }
        }
        System.out.println(result);
    }

}
