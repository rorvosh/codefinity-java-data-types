package com.example;

public class Main {
    public static String[] getWords() {
        return new String[]{"apple", "banana", "cherry"};
    }

    public static void main(String[] args) {
        String[] words = getWords();
        for (String word : words) {
            System.out.println(word);
        }
    }
}