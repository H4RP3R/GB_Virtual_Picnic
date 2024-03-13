import java.util.HashMap;
import java.util.List;

public class WordFrequency {
    public static HashMap<String, Integer> countFrequency(List<String> groceryList) {
        HashMap<String, Integer> frequencyDict = new HashMap<>();

        for (String word : groceryList) {
            frequencyDict.put(word, frequencyDict.getOrDefault(word, 0) + 1);
        }

        return frequencyDict;
    }
}
