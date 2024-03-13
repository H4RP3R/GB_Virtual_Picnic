import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import exceptions.EmptyGroceryListException;
import util.GroceryListReader;

public class Main {
    public static void main(String[] args) {
        GroceryListReader glReader = new GroceryListReader();
        List<String> groceryList = new ArrayList<>();
        try {
            groceryList = glReader.readInputFile("input.txt");
        } catch (EmptyGroceryListException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

        int wordsAmount = WordCounter.countWords(groceryList);
        System.out.printf("\nWords amount: %d\n", wordsAmount);

        String longestWord = LongestWord.findLongestWord(groceryList);
        System.out.printf("The longest word is '%s'\n\n", longestWord);

        HashMap<String, Integer> wordFrequency = WordFrequency.countFrequency(groceryList);
        for (var entry : wordFrequency.entrySet()) {
            System.out.printf("%-12s - %3d\n", entry.getKey(), entry.getValue());
        }
    }
}
