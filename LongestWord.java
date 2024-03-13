import java.util.List;

public class LongestWord {
    public static String findLongestWord(List<String> groceryList) {
        String longestWord = groceryList.get(0);

        for (String word : groceryList) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
