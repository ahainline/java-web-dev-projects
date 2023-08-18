package org.launchcode;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 5, 8};

        for (int i : values) {
            if (i % 2 == 1) {
                System.out.println(i);

            }
        }

        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] words = phrase.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        String[] sentences = phrase.split("\\.");
        for (String sentence : sentences) {
            sentence = sentence.trim() + ".";
            System.out.println(sentence);
        }
    }
}
