package org.launchcode;

import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args) {
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or conversations in it, ‘and what is " +
                "the use of a book,’ thought Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to search for?");
        String searchTerm = input.nextLine().toLowerCase();
        input.close();

        String searchableText = text.toLowerCase();
        int wordIndex = searchableText.indexOf(searchTerm);
        System.out.println("Found " + searchTerm.length() + " matching characters at index: " + wordIndex + ".");

        String newText;
        if (wordIndex > 0) {
            newText = (text.substring(0, wordIndex - 1) + (text.substring(wordIndex + searchTerm.length())));
        } else {
            newText = (text.substring(wordIndex + searchTerm.length()));
        }
        System.out.println(newText);
    }
}
