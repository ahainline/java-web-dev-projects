package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class characterCounter {
    public static void main(String[] args) {
        StringBuilder testPhrase = new StringBuilder();
        HashMap<Character, Integer> charCounts = new HashMap<>();
        try {
            File text = new File("control-flow-and-collections/studio/counting-characters/src/main/resources/quote.txt");
            Scanner reader = new Scanner(text);
            while (reader.hasNextLine()) {
                testPhrase.append(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }

        char[] charactersInString = testPhrase.toString().toLowerCase().toCharArray();

        for (char character : charactersInString) {
            if (character > 96 && character < 123) {
                if (!charCounts.containsKey(character)) {
                    charCounts.put(character, 1);
                } else {
                    charCounts.put(character, charCounts.get(character) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> character : charCounts.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
