import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordCounter {
    public static int countWords(String fileName) {
        StringBuilder sb = new StringBuilder();
        File inputFile = new File(fileName);

        try (Scanner inputScanner = new Scanner(inputFile)) {
            while (inputScanner.hasNextLine()) {
                sb.append(inputScanner.nextLine());
                sb.append(" ");
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

        List<String> groceryList = Arrays.asList(sb.toString().split("\\s+"));
        return groceryList.size();
    }

    public static void main(String[] args) {
        System.out.println(countWords("input.txt"));
    }
}
