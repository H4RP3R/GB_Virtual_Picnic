package exceptions;

import java.io.IOException;

public class EmptyGroceryListException extends IOException {
    public EmptyGroceryListException() {
        super("File 'input.txt' can't be empty!");
    }
}
