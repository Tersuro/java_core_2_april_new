package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println(getWords(words.toLowerCase().split(" ")));
        System.out.println(getWordsCount(words.toLowerCase().split(" ")));

        Phonebook phonebook = new Phonebook();
        phonebook.add("Гордеев","7(616)102-93-89");
        phonebook.add("Архипов","7(1251)144-15-29");
        phonebook.add("Гордеев","7(391)072-24-04");
        phonebook.add("Ковалёв","7(237)342-50-43");
        phonebook.add("Ковалёв","7(80)816-97-71");

        System.out.println("Номер(а) Гордеева:" + phonebook.get("Гордеев"));
        System.out.println("Номер(а) Архипова:" + phonebook.get("Архипов"));
        System.out.println("Номер(а) Ковалёва:" + phonebook.get("Ковалёв"));
    }

    private static final String words =
            "What shell we do with a drunken sailor? " +
                    "What shell we do with a drunken sailor? " +
                    "What shell we do with a drunken sailor? " +
                    "Early in the morning! " +
                    " " +
                    "Way hay and up she rises " +
                    "Way hay and up she rises " +
                    "Way hay and up she rises " +
                    "Early in the morning! ";

    private static Set<String> getWords(String[] arr) {
        return new HashSet<>(Arrays.asList(arr));
    }

    private static HashMap<String, Integer> getWordsCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }
}
