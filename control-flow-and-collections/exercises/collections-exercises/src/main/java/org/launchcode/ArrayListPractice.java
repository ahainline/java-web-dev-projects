package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static int evensTotal(ArrayList<Integer> numbers) {
        int sumOfEvens = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sumOfEvens += number;
            }
        }
        return sumOfEvens;
    }

    public static void printWords(ArrayList<String> wordsList, int numLetters) {
        for (String word : wordsList) {
            if (word.length() == numLetters) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            nums.add(i);
        }
        System.out.println(evensTotal(nums));

        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        ArrayList<String> words = new ArrayList<>(Arrays.asList(phrase.split(" ")));

        Scanner input = new Scanner(System.in);
        System.out.println("Number of characters to search for: ");
        int searchLength = input.nextInt();
        input.close();
        printWords(words, searchLength);
    }
}
