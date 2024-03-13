package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import exceptions.EmptyGroceryListException;

public class GroceryListReader {
    public List<String> readInputFile(String fileName) throws EmptyGroceryListException {
        StringBuilder sb = new StringBuilder();
        File inputFile = new File(fileName);

        try (Scanner inputScanner = new Scanner(inputFile)) {
            while (inputScanner.hasNextLine()) {
                sb.append(inputScanner.nextLine().toLowerCase());
                sb.append(" ");
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

        List<String> groceryList = Arrays.asList(sb.toString().split("\\s+"));
        if (groceryList.size() == 0) {
            throw new EmptyGroceryListException();
        }

        return groceryList;
    }
}
